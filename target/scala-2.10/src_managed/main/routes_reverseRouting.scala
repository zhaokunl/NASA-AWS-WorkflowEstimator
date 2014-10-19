// @SOURCE:/Users/zhaokunli/NASA-AWS-WorkflowEstimator/conf/routes
// @HASH:d35c55f6abd7665f18676e1e4f68c5b1bd455f09
// @DATE:Sat Oct 18 20:55:30 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
class ReverseSensorReadingController {
    

// @LINE:64
def getLatestSensorReadings(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "getLatestSensorReadings")
}
                                                

// @LINE:62
def getSensorReadingsWithinRange(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "getSensorReadings")
}
                                                

// @LINE:61
def sensorReadings(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sensorReading")
}
                                                

// @LINE:63
def getSensorReadingsAtTimestamp(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "getSensorReadingsAtTimestamp")
}
                                                
    
}
                          

// @LINE:58
class ReverseAboutusController {
    

// @LINE:58
def aboutus(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseDeviceTypeController {
    

// @LINE:33
def editDeviceType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit/deviceTypes")
}
                                                

// @LINE:30
def deviceTypes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deviceTypes")
}
                                                

// @LINE:32
def deleteDeviceType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/deviceTypes")
}
                                                

// @LINE:31
def newDeviceType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new/deviceTypes")
}
                                                
    
}
                          

// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
class ReverseEstimateController {
    

// @LINE:95
// @LINE:74
def estimate3(): Call = {
   () match {
// @LINE:74
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/3")
                                                        
// @LINE:95
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/3")
                                                        
   }
}
                                                

// @LINE:94
// @LINE:73
def estimate2(): Call = {
   () match {
// @LINE:73
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/2")
                                                        
// @LINE:94
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/2")
                                                        
   }
}
                                                

// @LINE:100
// @LINE:79
def accountSummary(userName:String = null): Call = {
   (userName: @unchecked) match {
// @LINE:79
case (userName) if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/accountSummary" + queryString(List(if(userName == null) None else Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
                                                        
// @LINE:100
case (userName) if true => Call("GET", _prefix + { _defaultPrefix } + "climate/accountSummary" + queryString(List(if(userName == null) None else Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
                                                        
   }
}
                                                

// @LINE:96
// @LINE:75
def tutorial(): Call = {
   () match {
// @LINE:75
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/tutorial")
                                                        
// @LINE:96
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
                                                        
   }
}
                                                

// @LINE:93
// @LINE:92
// @LINE:72
// @LINE:71
def estimate1(): Call = {
   () match {
// @LINE:71
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/1")
                                                        
// @LINE:72
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/1")
                                                        
// @LINE:92
case () if true => Call("POST", _prefix + { _defaultPrefix } + "climate/1")
                                                        
// @LINE:93
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/1")
                                                        
   }
}
                                                

// @LINE:91
// @LINE:70
def estimate(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:70
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "estimator" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:91
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:99
// @LINE:78
def logout(): Call = {
   () match {
// @LINE:78
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/logout")
                                                        
// @LINE:99
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/logout")
                                                        
   }
}
                                                

// @LINE:98
// @LINE:77
def authenticate(): Call = {
   () match {
// @LINE:77
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/login")
                                                        
// @LINE:98
case () if true => Call("POST", _prefix + { _defaultPrefix } + "climate/login")
                                                        
   }
}
                                                

// @LINE:97
// @LINE:76
def login(): Call = {
   () match {
// @LINE:76
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/login")
                                                        
// @LINE:97
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/login")
                                                        
   }
}
                                                
    
}
                          

// @LINE:55
class ReverseDashboardController {
    

// @LINE:55
def dashboard(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseBugReportController {
    

// @LINE:14
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:18
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:17
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:16
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:15
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseNasaRegistrationController {
    

// @LINE:110
// @LINE:87
def delete(): Call = {
   () match {
// @LINE:87
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/deleteUser/delete")
                                                        
// @LINE:110
case () if true => Call("POST", _prefix + { _defaultPrefix } + "climate/deleteUser/delete")
                                                        
   }
}
                                                

// @LINE:109
// @LINE:86
def deleteForm(): Call = {
   () match {
// @LINE:86
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/deleteUser")
                                                        
// @LINE:109
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/deleteUser")
                                                        
   }
}
                                                

// @LINE:111
// @LINE:88
def adminPage(): Call = {
   () match {
// @LINE:88
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/adminPage")
                                                        
// @LINE:111
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/adminPage")
                                                        
   }
}
                                                

// @LINE:106
// @LINE:83
def submit(): Call = {
   () match {
// @LINE:83
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/register/publish")
                                                        
// @LINE:106
case () if true => Call("POST", _prefix + { _defaultPrefix } + "climate/register/publish")
                                                        
   }
}
                                                

// @LINE:107
// @LINE:84
def updateForm(): Call = {
   () match {
// @LINE:84
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/updateUser")
                                                        
// @LINE:107
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/updateUser")
                                                        
   }
}
                                                

// @LINE:108
// @LINE:85
def update(): Call = {
   () match {
// @LINE:85
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/updateUser/update")
                                                        
// @LINE:108
case () if true => Call("POST", _prefix + { _defaultPrefix } + "climate/updateUser/update")
                                                        
   }
}
                                                

// @LINE:105
// @LINE:82
def registrationForm(): Call = {
   () match {
// @LINE:82
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/register")
                                                        
// @LINE:105
case () if true => Call("GET", _prefix + { _defaultPrefix } + "climate/register")
                                                        
   }
}
                                                
    
}
                          

// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
class ReverseSensorCategoryController {
    

// @LINE:49
def newSensorCategory(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new/sensorCategories")
}
                                                

// @LINE:50
def deleteSensorCategory(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/sensorCategories")
}
                                                

// @LINE:48
def sensorCategories(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sensorCategories")
}
                                                

// @LINE:51
def downloadSensorCategory(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "download/sensorCategories")
}
                                                

// @LINE:52
def editSensorCategory(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit/sensorCategories")
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseDeviceController {
    

// @LINE:38
def deleteDevice(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/devices")
}
                                                

// @LINE:39
def editDevice(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit/devices")
}
                                                

// @LINE:37
def newDevice(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new/devices")
}
                                                

// @LINE:36
def devices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "devices")
}
                                                
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseSensorController {
    

// @LINE:42
def sensors(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sensors")
}
                                                

// @LINE:44
def deleteSensor(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/sensors")
}
                                                

// @LINE:43
def newSensor(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new/sensors")
}
                                                

// @LINE:45
def editSensor(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit/sensors")
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseSensorTypeController {
    

// @LINE:25
def newSensorType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "new/sensorTypes")
}
                                                

// @LINE:27
def editSensorType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "edit/sensorTypes")
}
                                                

// @LINE:26
def deleteSensorType(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/sensorTypes")
}
                                                

// @LINE:24
def sensorTypes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "sensorTypes")
}
                                                
    
}
                          
}
                  


// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
class ReverseSensorReadingController {
    

// @LINE:64
def getLatestSensorReadings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorReadingController.getLatestSensorReadings",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getLatestSensorReadings"})
      }
   """
)
                        

// @LINE:62
def getSensorReadingsWithinRange : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorReadingController.getSensorReadingsWithinRange",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getSensorReadings"})
      }
   """
)
                        

// @LINE:61
def sensorReadings : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorReadingController.sensorReadings",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensorReading"})
      }
   """
)
                        

// @LINE:63
def getSensorReadingsAtTimestamp : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorReadingController.getSensorReadingsAtTimestamp",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getSensorReadingsAtTimestamp"})
      }
   """
)
                        
    
}
              

// @LINE:58
class ReverseAboutusController {
    

// @LINE:58
def aboutus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseDeviceTypeController {
    

// @LINE:33
def editDeviceType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceTypeController.editDeviceType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/deviceTypes"})
      }
   """
)
                        

// @LINE:30
def deviceTypes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceTypeController.deviceTypes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deviceTypes"})
      }
   """
)
                        

// @LINE:32
def deleteDeviceType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceTypeController.deleteDeviceType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/deviceTypes"})
      }
   """
)
                        

// @LINE:31
def newDeviceType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceTypeController.newDeviceType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new/deviceTypes"})
      }
   """
)
                        
    
}
              

// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
class ReverseEstimateController {
    

// @LINE:95
// @LINE:74
def estimate3 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.estimate3",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/3"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/3"})
      }
      }
   """
)
                        

// @LINE:94
// @LINE:73
def estimate2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.estimate2",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/2"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/2"})
      }
      }
   """
)
                        

// @LINE:100
// @LINE:79
def accountSummary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.accountSummary",
   """
      function(userName) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/accountSummary" + _qS([(userName == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/accountSummary" + _qS([(userName == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName))])})
      }
      }
   """
)
                        

// @LINE:96
// @LINE:75
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.tutorial",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/tutorial"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
      }
   """
)
                        

// @LINE:93
// @LINE:92
// @LINE:72
// @LINE:71
def estimate1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.estimate1",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/1"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/1"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/1"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/1"})
      }
      }
   """
)
                        

// @LINE:91
// @LINE:70
def estimate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.estimate",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:99
// @LINE:78
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.logout",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/logout"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/logout"})
      }
      }
   """
)
                        

// @LINE:98
// @LINE:77
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.authenticate",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/login"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/login"})
      }
      }
   """
)
                        

// @LINE:97
// @LINE:76
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EstimateController.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/login"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/login"})
      }
      }
   """
)
                        
    
}
              

// @LINE:55
class ReverseDashboardController {
    

// @LINE:55
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DashboardController.dashboard",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseBugReportController {
    

// @LINE:14
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:18
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:17
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:16
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:15
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseNasaRegistrationController {
    

// @LINE:110
// @LINE:87
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.delete",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/deleteUser/delete"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/deleteUser/delete"})
      }
      }
   """
)
                        

// @LINE:109
// @LINE:86
def deleteForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.deleteForm",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/deleteUser"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/deleteUser"})
      }
      }
   """
)
                        

// @LINE:111
// @LINE:88
def adminPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.adminPage",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/adminPage"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/adminPage"})
      }
      }
   """
)
                        

// @LINE:106
// @LINE:83
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.submit",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/register/publish"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/register/publish"})
      }
      }
   """
)
                        

// @LINE:107
// @LINE:84
def updateForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.updateForm",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/updateUser"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/updateUser"})
      }
      }
   """
)
                        

// @LINE:108
// @LINE:85
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.update",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/updateUser/update"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/updateUser/update"})
      }
      }
   """
)
                        

// @LINE:105
// @LINE:82
def registrationForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.registrationForm",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/register"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/register"})
      }
      }
   """
)
                        
    
}
              

// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
class ReverseSensorCategoryController {
    

// @LINE:49
def newSensorCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorCategoryController.newSensorCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new/sensorCategories"})
      }
   """
)
                        

// @LINE:50
def deleteSensorCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorCategoryController.deleteSensorCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/sensorCategories"})
      }
   """
)
                        

// @LINE:48
def sensorCategories : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorCategoryController.sensorCategories",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensorCategories"})
      }
   """
)
                        

// @LINE:51
def downloadSensorCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorCategoryController.downloadSensorCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "download/sensorCategories"})
      }
   """
)
                        

// @LINE:52
def editSensorCategory : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorCategoryController.editSensorCategory",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/sensorCategories"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseDeviceController {
    

// @LINE:38
def deleteDevice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceController.deleteDevice",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/devices"})
      }
   """
)
                        

// @LINE:39
def editDevice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceController.editDevice",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/devices"})
      }
   """
)
                        

// @LINE:37
def newDevice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceController.newDevice",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new/devices"})
      }
   """
)
                        

// @LINE:36
def devices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DeviceController.devices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "devices"})
      }
   """
)
                        
    
}
              

// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseSensorController {
    

// @LINE:42
def sensors : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorController.sensors",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensors"})
      }
   """
)
                        

// @LINE:44
def deleteSensor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorController.deleteSensor",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/sensors"})
      }
   """
)
                        

// @LINE:43
def newSensor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorController.newSensor",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new/sensors"})
      }
   """
)
                        

// @LINE:45
def editSensor : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorController.editSensor",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/sensors"})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseSensorTypeController {
    

// @LINE:25
def newSensorType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorTypeController.newSensorType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "new/sensorTypes"})
      }
   """
)
                        

// @LINE:27
def editSensorType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorTypeController.editSensorType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/sensorTypes"})
      }
   """
)
                        

// @LINE:26
def deleteSensorType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorTypeController.deleteSensorType",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/sensorTypes"})
      }
   """
)
                        

// @LINE:24
def sensorTypes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SensorTypeController.sensorTypes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sensorTypes"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:58
// @LINE:55
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:21
class ReverseAssets {
    

// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
class ReverseSensorReadingController {
    

// @LINE:64
def getLatestSensorReadings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorReadingController.getLatestSensorReadings(), HandlerDef(this, "controllers.SensorReadingController", "getLatestSensorReadings", Seq(), "POST", """""", _prefix + """getLatestSensorReadings""")
)
                      

// @LINE:62
def getSensorReadingsWithinRange(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorReadingController.getSensorReadingsWithinRange(), HandlerDef(this, "controllers.SensorReadingController", "getSensorReadingsWithinRange", Seq(), "POST", """""", _prefix + """getSensorReadings""")
)
                      

// @LINE:61
def sensorReadings(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorReadingController.sensorReadings(), HandlerDef(this, "controllers.SensorReadingController", "sensorReadings", Seq(), "GET", """ sensor reading""", _prefix + """sensorReading""")
)
                      

// @LINE:63
def getSensorReadingsAtTimestamp(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorReadingController.getSensorReadingsAtTimestamp(), HandlerDef(this, "controllers.SensorReadingController", "getSensorReadingsAtTimestamp", Seq(), "POST", """""", _prefix + """getSensorReadingsAtTimestamp""")
)
                      
    
}
                          

// @LINE:58
class ReverseAboutusController {
    

// @LINE:58
def aboutus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutus(), HandlerDef(this, "controllers.AboutusController", "aboutus", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
class ReverseDeviceTypeController {
    

// @LINE:33
def editDeviceType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceTypeController.editDeviceType(), HandlerDef(this, "controllers.DeviceTypeController", "editDeviceType", Seq(), "POST", """""", _prefix + """edit/deviceTypes""")
)
                      

// @LINE:30
def deviceTypes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceTypeController.deviceTypes(), HandlerDef(this, "controllers.DeviceTypeController", "deviceTypes", Seq(), "GET", """ device_types""", _prefix + """deviceTypes""")
)
                      

// @LINE:32
def deleteDeviceType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceTypeController.deleteDeviceType(), HandlerDef(this, "controllers.DeviceTypeController", "deleteDeviceType", Seq(), "POST", """""", _prefix + """delete/deviceTypes""")
)
                      

// @LINE:31
def newDeviceType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceTypeController.newDeviceType(), HandlerDef(this, "controllers.DeviceTypeController", "newDeviceType", Seq(), "POST", """""", _prefix + """new/deviceTypes""")
)
                      
    
}
                          

// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:79
// @LINE:78
// @LINE:77
// @LINE:76
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
class ReverseEstimateController {
    

// @LINE:74
def estimate3(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.estimate3(), HandlerDef(this, "controllers.EstimateController", "estimate3", Seq(), "GET", """""", _prefix + """estimator/3""")
)
                      

// @LINE:73
def estimate2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.estimate2(), HandlerDef(this, "controllers.EstimateController", "estimate2", Seq(), "GET", """""", _prefix + """estimator/2""")
)
                      

// @LINE:79
def accountSummary(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.accountSummary(userName), HandlerDef(this, "controllers.EstimateController", "accountSummary", Seq(classOf[String]), "GET", """""", _prefix + """estimator/accountSummary""")
)
                      

// @LINE:75
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.tutorial(), HandlerDef(this, "controllers.EstimateController", "tutorial", Seq(), "GET", """""", _prefix + """estimator/tutorial""")
)
                      

// @LINE:71
def estimate1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Seq(), "POST", """""", _prefix + """estimator/1""")
)
                      

// @LINE:70
def estimate(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.estimate(email, vfile, dataset), HandlerDef(this, "controllers.EstimateController", "estimate", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ recommendation""", _prefix + """estimator""")
)
                      

// @LINE:78
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.logout(), HandlerDef(this, "controllers.EstimateController", "logout", Seq(), "GET", """""", _prefix + """estimator/logout""")
)
                      

// @LINE:77
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.authenticate(), HandlerDef(this, "controllers.EstimateController", "authenticate", Seq(), "POST", """""", _prefix + """estimator/login""")
)
                      

// @LINE:76
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EstimateController.login(), HandlerDef(this, "controllers.EstimateController", "login", Seq(), "GET", """""", _prefix + """estimator/login""")
)
                      
    
}
                          

// @LINE:55
class ReverseDashboardController {
    

// @LINE:55
def dashboard(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DashboardController.dashboard(), HandlerDef(this, "controllers.DashboardController", "dashboard", Seq(), "GET", """ dashboard""", _prefix + """dashboard""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseBugReportController {
    

// @LINE:14
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:18
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:17
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:16
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:15
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:111
// @LINE:110
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:88
// @LINE:87
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
class ReverseNasaRegistrationController {
    

// @LINE:87
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.delete(), HandlerDef(this, "controllers.NasaRegistrationController", "delete", Seq(), "POST", """""", _prefix + """estimator/deleteUser/delete""")
)
                      

// @LINE:86
def deleteForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.deleteForm(), HandlerDef(this, "controllers.NasaRegistrationController", "deleteForm", Seq(), "GET", """""", _prefix + """estimator/deleteUser""")
)
                      

// @LINE:88
def adminPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.adminPage(), HandlerDef(this, "controllers.NasaRegistrationController", "adminPage", Seq(), "GET", """""", _prefix + """estimator/adminPage""")
)
                      

// @LINE:83
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.submit(), HandlerDef(this, "controllers.NasaRegistrationController", "submit", Seq(), "POST", """""", _prefix + """estimator/register/publish""")
)
                      

// @LINE:84
def updateForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.updateForm(), HandlerDef(this, "controllers.NasaRegistrationController", "updateForm", Seq(), "GET", """""", _prefix + """estimator/updateUser""")
)
                      

// @LINE:85
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.update(), HandlerDef(this, "controllers.NasaRegistrationController", "update", Seq(), "POST", """""", _prefix + """estimator/updateUser/update""")
)
                      

// @LINE:82
def registrationForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.registrationForm(), HandlerDef(this, "controllers.NasaRegistrationController", "registrationForm", Seq(), "GET", """Registration""", _prefix + """estimator/register""")
)
                      
    
}
                          

// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:49
// @LINE:48
class ReverseSensorCategoryController {
    

// @LINE:49
def newSensorCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorCategoryController.newSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "newSensorCategory", Seq(), "POST", """""", _prefix + """new/sensorCategories""")
)
                      

// @LINE:50
def deleteSensorCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorCategoryController.deleteSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "deleteSensorCategory", Seq(), "POST", """""", _prefix + """delete/sensorCategories""")
)
                      

// @LINE:48
def sensorCategories(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorCategoryController.sensorCategories(), HandlerDef(this, "controllers.SensorCategoryController", "sensorCategories", Seq(), "GET", """ sensor_categories""", _prefix + """sensorCategories""")
)
                      

// @LINE:51
def downloadSensorCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorCategoryController.downloadSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "downloadSensorCategory", Seq(), "POST", """""", _prefix + """download/sensorCategories""")
)
                      

// @LINE:52
def editSensorCategory(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorCategoryController.editSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "editSensorCategory", Seq(), "POST", """""", _prefix + """edit/sensorCategories""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseDeviceController {
    

// @LINE:38
def deleteDevice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceController.deleteDevice(), HandlerDef(this, "controllers.DeviceController", "deleteDevice", Seq(), "POST", """""", _prefix + """delete/devices""")
)
                      

// @LINE:39
def editDevice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceController.editDevice(), HandlerDef(this, "controllers.DeviceController", "editDevice", Seq(), "POST", """""", _prefix + """edit/devices""")
)
                      

// @LINE:37
def newDevice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceController.newDevice(), HandlerDef(this, "controllers.DeviceController", "newDevice", Seq(), "POST", """""", _prefix + """new/devices""")
)
                      

// @LINE:36
def devices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DeviceController.devices(), HandlerDef(this, "controllers.DeviceController", "devices", Seq(), "GET", """ devices""", _prefix + """devices""")
)
                      
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
class ReverseSensorController {
    

// @LINE:42
def sensors(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorController.sensors(), HandlerDef(this, "controllers.SensorController", "sensors", Seq(), "GET", """ sensors""", _prefix + """sensors""")
)
                      

// @LINE:44
def deleteSensor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorController.deleteSensor(), HandlerDef(this, "controllers.SensorController", "deleteSensor", Seq(), "POST", """""", _prefix + """delete/sensors""")
)
                      

// @LINE:43
def newSensor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorController.newSensor(), HandlerDef(this, "controllers.SensorController", "newSensor", Seq(), "POST", """""", _prefix + """new/sensors""")
)
                      

// @LINE:45
def editSensor(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorController.editSensor(), HandlerDef(this, "controllers.SensorController", "editSensor", Seq(), "POST", """""", _prefix + """edit/sensors""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseSensorTypeController {
    

// @LINE:25
def newSensorType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorTypeController.newSensorType(), HandlerDef(this, "controllers.SensorTypeController", "newSensorType", Seq(), "POST", """""", _prefix + """new/sensorTypes""")
)
                      

// @LINE:27
def editSensorType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorTypeController.editSensorType(), HandlerDef(this, "controllers.SensorTypeController", "editSensorType", Seq(), "POST", """""", _prefix + """edit/sensorTypes""")
)
                      

// @LINE:26
def deleteSensorType(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorTypeController.deleteSensorType(), HandlerDef(this, "controllers.SensorTypeController", "deleteSensorType", Seq(), "POST", """""", _prefix + """delete/sensorTypes""")
)
                      

// @LINE:24
def sensorTypes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SensorTypeController.sensorTypes(), HandlerDef(this, "controllers.SensorTypeController", "sensorTypes", Seq(), "GET", """ sensor_types""", _prefix + """sensorTypes""")
)
                      
    
}
                          
}
        
    