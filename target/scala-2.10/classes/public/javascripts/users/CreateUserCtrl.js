(function() {
  var CreateUserCtrl;

  CreateUserCtrl = (function() {

    function CreateUserCtrl($log, $location, UserService) {
      this.$log = $log;
      this.$location = $location;
      this.UserService = UserService;
      this.$log.debug("constructing CreateUserController");
      this.user = {};
    }

    CreateUserCtrl.prototype.createUser = function() {
      var _this = this;
      this.$log.debug("createUser()");
      this.user.active = true;
      return this.UserService.createUser(this.user).then(function(data) {
        _this.$log.debug("Promise returned " + data + " User");
        _this.user = data;
        return _this.$location.path("/");
      }, function(error) {
        return _this.$log.error("Unable to create User: " + error);
      });
    };

    return CreateUserCtrl;

  })();

  controllersModule.controller('CreateUserCtrl', CreateUserCtrl);

}).call(this);
