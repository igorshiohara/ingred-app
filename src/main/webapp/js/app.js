'use strict';

// Declare app level module which depends on filters, and services
angular.module('ingredapp', ['ngRoute','ingredapp.filters', 'ingredapp.services', 'ingredapp.directives', 'ingredapp.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/product-list', {templateUrl: 'partials/product-list.html', controller: 'ProductListCtrl'});        
        $routeProvider.otherwise({redirectTo: '/product-list'});
    }]);
