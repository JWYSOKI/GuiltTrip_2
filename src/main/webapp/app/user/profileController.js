(function() {

	'use strict';

	angular
		.module('app')
		.controller('ProfileController', ProfileController);

	ProfileController.$inject = [ '$scope', '$http', '$window' ];

	function ProfileController($scope, $http, $window) {
		
		console.log("its working")

		let vm = this;
		vm.id = ""
		vm.username =""
		vm.user = {
				id: "",
				username: "Edit username here",
				password: "Edit password",
		}
	
		function editProfile() {	
			$http.put("http://localhost:8080/GuiltTrip_2/user", JSON.stringify(vm.user)).then(response => console.log(response))
				
		}
		
		function removeProfile(){
			//$window.location.href = 'hello' 
		}
		
	};
	
})();
