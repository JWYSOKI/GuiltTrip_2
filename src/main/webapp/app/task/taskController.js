(function() {

	'use strict';
	
	angular
		.module('app')
		.controller('TaskController', TaskController);

	TaskController.$inject = ['TaskService', '$http', '$scope'];

	function TaskController(TaskService, $http, $scope) {
		
		var vm = this;
		vm.task = {
				id:null,
				activity:'',
				motivation:'',
				reminderTime:'',	
		}
		
		vm.tasks = [];
		
		vm.edit = edit;
		vm.submit = submit;
		vm.reset = reset;
		vm.showMessage = true;
		
		getTaskData();
		
		function createTask(task) {
			TaskService.createTask(task)
				.then(
				getTaskData,
				function(errResponse){
					console.error('Error creating task');
				}
			);
		}		

		function getTaskData() {
			TaskService.getTaskList()
				.then(
				function(response) {
					vm.tasks = response;
					console.log('reading tasks', vm.tasks);

				},
				function(errResponse){
					console.error('Error creating tasks');
				}
			);	
		}
		
		vm.deleteTask = function (id){
			return TaskService.deleteTask(id)
				.then( function (response) {
					console.log(response);
					getTaskData();
				});	
			 getTaskData();
			}
		
		vm.remove = function (id){
			console.log('Removing', id);
			if(vm.task.id == id) {
				reset();
			}
			vm.deleteTask(id);
			getTaskData();
		}
		
		function submit(){
			console.log("in submit function")
			if(vm.task.id==null){
				createTask(vm.task);
				console.log("submit pushed")
			}else{
			
				updateTask(vm.task, vm.task.id);
				console.log("submit is working");
			}
			reset();
		}
		
		
		
		function reset(){
			vm.task=
			{
				id: null,
				activity: '',
				motivation : '',
				reminderTime : '',	
			}
			$scope.myAsynchronosForm.$setPristine();
		}
		
		function edit(id){
			for(var i = 0; i < vm.tasks.length; i++){
				if(vm.tasks[i].id == id){
					vm.task = angular.copy(vm.tasks[i]);
					break;
				}		
			}
		}
		
		function updateTask(task, id){
			console.log(task, id);
			TaskService.updateTask(task, id)
				.then(
				getTaskData,
				function(errResponse){
					console.error('Error while updating task');
				}
			);
		}
	}
	
})();