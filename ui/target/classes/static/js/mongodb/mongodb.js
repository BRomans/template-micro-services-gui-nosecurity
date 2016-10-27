/**
 * Created by miche on 25/10/2016.
 */
angular.module('mongodb', []).controller('mongodb', function($http) {
    var self = this;
    console.log("dentro mongodb");
    $http.get('http://localhost:9000/').then(function(response) {
        self.greeting = response.data;
        console.log("dentro richiesta http");
    });
});
