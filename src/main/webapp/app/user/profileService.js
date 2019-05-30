(function() {

	"use strict";

	angular
		.module('app')
		.factory('userService', userService);

	userService.$inject = [ '$http' ];

	function userService($http) {

		var REST_SERVICE_URI = 'http://localhost8080/GuiltTrip_2/user/';

		var factory = {
			addUser : addUser,
			getUserList : getUserList

		};

		return factory;

		function getUserList() {
			return $http.get(REST_SERVICE_URI);
			userInfo
		}

		function addUser(userInfo) {
			return $http.post(REST_SERVICE_URI, userInfo).then(
					function(response) {
						return response.data;
					})
		}

		function updateUser(userInfo) {
			return $http.put(REST_SERVICE_URI, userInfo).then(
					function(response) {
						return response.data;
					})
		}

		function deleteUser(userInfo) {
			return $http.post(REST_SERVICE_URI, userInfo).then(
					function(response) {
						return response.data;
					})
		}

	};

})();