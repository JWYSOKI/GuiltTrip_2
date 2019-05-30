(function() {

	'use strict';

	angular
		.module('app')
		.controller('UserController', UserController);

	UserController.$inject = [ '$scope', '$http', 'userService', '$window' ];


	function UserController($scope, $http, userService, $window) {

		let vm = this;
		vm.addUser = addUser;
		vm.loginUser = loginUser;
		
		vm.user = {
				id: "",
				username: "",
				password: "",
		}
	
		function addUser() {	
			$http.post("http://localhost:8080/GuiltTrip_2/user", JSON.stringify(vm.user)).then(response => console.log(response))	
			$window.location.href = 'hello' 
				
		}
		 
		function loginUser(){
			if(vm.user.username == "" || vm.user.password == "") { return null } 
			$window.location.href = 'hello' 
		}
		
	};
	
})();
