'use strict';

/* Controllers */

var app = angular.module('ingredapp.controllers', []);


// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('ProductListCtrl', ['$scope', 'ProductsFactory', '$location',
    function ($scope, ProductsFactory, $location) {

        ProductsFactory.query().$promise.then(function(data) {
        	$scope.products = data;
        });
    }]);
