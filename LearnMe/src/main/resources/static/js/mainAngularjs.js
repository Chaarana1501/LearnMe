/**
 * 
 */

angular.module('appLearnMe', [])
  .controller('home', function($scope, $http) {
  $http.get('/resource/').then(function(data) {
	  
    $scope.greeting = data;
  })
});