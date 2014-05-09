spApp.controller('HomeController', ['$scope', function ($scope) {
    "use strict";
}]);

spApp.controller('LoginController', ['$scope', '$location', 'SPAuthService',
    function ($scope, $location, SPAuthService) {
        "use strict";
        $scope.login = function () {
            SPAuthService.login($scope.username, $scope.password, $scope.rememberMe, function () {
                $location.path('/home')
            });
        };
    }]);

spApp.controller('LogoutController', ['$scope', '$location', 'SPAuthService',
    function ($scope, $location, SPAuthService) {
        "use strict";
        SPAuthService.logout(function () {
            $location.path('')
        });
    }]);

spApp.controller('ProjectController', ['$scope', 'ProjectResource',
    function ($scope, ProjectResource) {

    }]);