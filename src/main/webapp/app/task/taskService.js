(function() {

	"use strict";

	angular
		.module('app')
		.factory('TaskService', TaskService);
	
	var REST_SERVICE_URI = "http://localhost:8080/GuiltTrip_2/task/";

	TaskService.$inject = [ '$http' , '$q'];
	

	function TaskService($http, $q) {

		return {
			addTask : addTask,
			getTaskList : getTaskList,
			createTask: createTask,
			deleteTask: deleteTask,
			updateTask: updateTask,
		};

		function addTask(newTaskInfo) {
			return $http.post('task', newTaskInfo).then(function(response) {
				return response.data;
			})
		}

		function getTaskList() {
			var defer = $q.defer();
			console.log('get', $http.get(REST_SERVICE_URI));
			$http.get(REST_SERVICE_URI)
				.then(
				function(response){
					defer.resolve(response.data);
				}
			);
			return defer.promise;
	
		}
		
		function createTask(task){
			var defer = $q.defer();
			$http.post(REST_SERVICE_URI, task)
				.then(
				function(response){
					defer.resolve(response.data);
				}
			);
			console.log('post promise', defer.promise);
			return defer.promise;
		}
		
		function updateTask(task, id){
			var defer = $q.defer();
			$http.put(REST_SERVICE_URI+id, task)
				.then(
				function(response){
					defer.resolve(response.data);
				}
			);
			return defer.promise;		
		}
		
		function deleteTask(id){
			console.log('Service delete', id);
			var defer = $q.defer();	
			$http.delete(REST_SERVICE_URI+id)
				.then(
				function(response){
					defer.resolve(response.data);
				}
			);
			return defer.promise;
		}
		
	}
	
})();