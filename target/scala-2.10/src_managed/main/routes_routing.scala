// @SOURCE:/Users/zhaokunli/NASA-AWS-WorkflowEstimator/conf/routes
// @HASH:d35c55f6abd7665f18676e1e4f68c5b1bd455f09
// @DATE:Sat Oct 18 20:55:30 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_BugReportController_reports4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bugs"))))
        

// @LINE:15
private[this] lazy val controllers_BugReportController_newReport5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newReport"))))
        

// @LINE:16
private[this] lazy val controllers_BugReportController_list6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("bug/list"))))
        

// @LINE:17
private[this] lazy val controllers_BugReportController_deleteReport7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/report"))))
        

// @LINE:18
private[this] lazy val controllers_BugReportController_solveReport8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("solve/report"))))
        

// @LINE:21
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:24
private[this] lazy val controllers_SensorTypeController_sensorTypes10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sensorTypes"))))
        

// @LINE:25
private[this] lazy val controllers_SensorTypeController_newSensorType11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new/sensorTypes"))))
        

// @LINE:26
private[this] lazy val controllers_SensorTypeController_deleteSensorType12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/sensorTypes"))))
        

// @LINE:27
private[this] lazy val controllers_SensorTypeController_editSensorType13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/sensorTypes"))))
        

// @LINE:30
private[this] lazy val controllers_DeviceTypeController_deviceTypes14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deviceTypes"))))
        

// @LINE:31
private[this] lazy val controllers_DeviceTypeController_newDeviceType15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new/deviceTypes"))))
        

// @LINE:32
private[this] lazy val controllers_DeviceTypeController_deleteDeviceType16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/deviceTypes"))))
        

// @LINE:33
private[this] lazy val controllers_DeviceTypeController_editDeviceType17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/deviceTypes"))))
        

// @LINE:36
private[this] lazy val controllers_DeviceController_devices18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("devices"))))
        

// @LINE:37
private[this] lazy val controllers_DeviceController_newDevice19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new/devices"))))
        

// @LINE:38
private[this] lazy val controllers_DeviceController_deleteDevice20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/devices"))))
        

// @LINE:39
private[this] lazy val controllers_DeviceController_editDevice21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/devices"))))
        

// @LINE:42
private[this] lazy val controllers_SensorController_sensors22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sensors"))))
        

// @LINE:43
private[this] lazy val controllers_SensorController_newSensor23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new/sensors"))))
        

// @LINE:44
private[this] lazy val controllers_SensorController_deleteSensor24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/sensors"))))
        

// @LINE:45
private[this] lazy val controllers_SensorController_editSensor25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/sensors"))))
        

// @LINE:48
private[this] lazy val controllers_SensorCategoryController_sensorCategories26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sensorCategories"))))
        

// @LINE:49
private[this] lazy val controllers_SensorCategoryController_newSensorCategory27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("new/sensorCategories"))))
        

// @LINE:50
private[this] lazy val controllers_SensorCategoryController_deleteSensorCategory28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete/sensorCategories"))))
        

// @LINE:51
private[this] lazy val controllers_SensorCategoryController_downloadSensorCategory29 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("download/sensorCategories"))))
        

// @LINE:52
private[this] lazy val controllers_SensorCategoryController_editSensorCategory30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("edit/sensorCategories"))))
        

// @LINE:55
private[this] lazy val controllers_DashboardController_dashboard31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
        

// @LINE:58
private[this] lazy val controllers_AboutusController_aboutus32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:61
private[this] lazy val controllers_SensorReadingController_sensorReadings33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("sensorReading"))))
        

// @LINE:62
private[this] lazy val controllers_SensorReadingController_getSensorReadingsWithinRange34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSensorReadings"))))
        

// @LINE:63
private[this] lazy val controllers_SensorReadingController_getSensorReadingsAtTimestamp35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getSensorReadingsAtTimestamp"))))
        

// @LINE:64
private[this] lazy val controllers_SensorReadingController_getLatestSensorReadings36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getLatestSensorReadings"))))
        

// @LINE:70
private[this] lazy val controllers_EstimateController_estimate37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator"))))
        

// @LINE:71
private[this] lazy val controllers_EstimateController_estimate138 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/1"))))
        

// @LINE:72
private[this] lazy val controllers_EstimateController_estimate139 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/1"))))
        

// @LINE:73
private[this] lazy val controllers_EstimateController_estimate240 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/2"))))
        

// @LINE:74
private[this] lazy val controllers_EstimateController_estimate341 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/3"))))
        

// @LINE:75
private[this] lazy val controllers_EstimateController_tutorial42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/tutorial"))))
        

// @LINE:76
private[this] lazy val controllers_EstimateController_login43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/login"))))
        

// @LINE:77
private[this] lazy val controllers_EstimateController_authenticate44 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/login"))))
        

// @LINE:78
private[this] lazy val controllers_EstimateController_logout45 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/logout"))))
        

// @LINE:79
private[this] lazy val controllers_EstimateController_accountSummary46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/accountSummary"))))
        

// @LINE:82
private[this] lazy val controllers_NasaRegistrationController_registrationForm47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/register"))))
        

// @LINE:83
private[this] lazy val controllers_NasaRegistrationController_submit48 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/register/publish"))))
        

// @LINE:84
private[this] lazy val controllers_NasaRegistrationController_updateForm49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/updateUser"))))
        

// @LINE:85
private[this] lazy val controllers_NasaRegistrationController_update50 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/updateUser/update"))))
        

// @LINE:86
private[this] lazy val controllers_NasaRegistrationController_deleteForm51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/deleteUser"))))
        

// @LINE:87
private[this] lazy val controllers_NasaRegistrationController_delete52 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/deleteUser/delete"))))
        

// @LINE:88
private[this] lazy val controllers_NasaRegistrationController_adminPage53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/adminPage"))))
        

// @LINE:91
private[this] lazy val controllers_EstimateController_estimate54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate"))))
        

// @LINE:92
private[this] lazy val controllers_EstimateController_estimate155 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/1"))))
        

// @LINE:93
private[this] lazy val controllers_EstimateController_estimate156 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/1"))))
        

// @LINE:94
private[this] lazy val controllers_EstimateController_estimate257 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/2"))))
        

// @LINE:95
private[this] lazy val controllers_EstimateController_estimate358 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/3"))))
        

// @LINE:96
private[this] lazy val controllers_EstimateController_tutorial59 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/tutorial"))))
        

// @LINE:97
private[this] lazy val controllers_EstimateController_login60 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/login"))))
        

// @LINE:98
private[this] lazy val controllers_EstimateController_authenticate61 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/login"))))
        

// @LINE:99
private[this] lazy val controllers_EstimateController_logout62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/logout"))))
        

// @LINE:100
private[this] lazy val controllers_EstimateController_accountSummary63 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/accountSummary"))))
        

// @LINE:105
private[this] lazy val controllers_NasaRegistrationController_registrationForm64 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/register"))))
        

// @LINE:106
private[this] lazy val controllers_NasaRegistrationController_submit65 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/register/publish"))))
        

// @LINE:107
private[this] lazy val controllers_NasaRegistrationController_updateForm66 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/updateUser"))))
        

// @LINE:108
private[this] lazy val controllers_NasaRegistrationController_update67 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/updateUser/update"))))
        

// @LINE:109
private[this] lazy val controllers_NasaRegistrationController_deleteForm68 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/deleteUser"))))
        

// @LINE:110
private[this] lazy val controllers_NasaRegistrationController_delete69 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/deleteUser/delete"))))
        

// @LINE:111
private[this] lazy val controllers_NasaRegistrationController_adminPage70 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("climate/adminPage"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sensorTypes""","""controllers.SensorTypeController.sensorTypes()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new/sensorTypes""","""controllers.SensorTypeController.newSensorType()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/sensorTypes""","""controllers.SensorTypeController.deleteSensorType()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/sensorTypes""","""controllers.SensorTypeController.editSensorType()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deviceTypes""","""controllers.DeviceTypeController.deviceTypes()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new/deviceTypes""","""controllers.DeviceTypeController.newDeviceType()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/deviceTypes""","""controllers.DeviceTypeController.deleteDeviceType()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/deviceTypes""","""controllers.DeviceTypeController.editDeviceType()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """devices""","""controllers.DeviceController.devices()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new/devices""","""controllers.DeviceController.newDevice()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/devices""","""controllers.DeviceController.deleteDevice()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/devices""","""controllers.DeviceController.editDevice()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sensors""","""controllers.SensorController.sensors()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new/sensors""","""controllers.SensorController.newSensor()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/sensors""","""controllers.SensorController.deleteSensor()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/sensors""","""controllers.SensorController.editSensor()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sensorCategories""","""controllers.SensorCategoryController.sensorCategories()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """new/sensorCategories""","""controllers.SensorCategoryController.newSensorCategory()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/sensorCategories""","""controllers.SensorCategoryController.deleteSensorCategory()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """download/sensorCategories""","""controllers.SensorCategoryController.downloadSensorCategory()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """edit/sensorCategories""","""controllers.SensorCategoryController.editSensorCategory()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.DashboardController.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutus()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sensorReading""","""controllers.SensorReadingController.sensorReadings()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSensorReadings""","""controllers.SensorReadingController.getSensorReadingsWithinRange()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getSensorReadingsAtTimestamp""","""controllers.SensorReadingController.getSensorReadingsAtTimestamp()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getLatestSensorReadings""","""controllers.SensorReadingController.getLatestSensorReadings()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator""","""controllers.EstimateController.estimate(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/1""","""controllers.EstimateController.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/1""","""controllers.EstimateController.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/2""","""controllers.EstimateController.estimate2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/3""","""controllers.EstimateController.estimate3()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/tutorial""","""controllers.EstimateController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/login""","""controllers.EstimateController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/login""","""controllers.EstimateController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/logout""","""controllers.EstimateController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/accountSummary""","""controllers.EstimateController.accountSummary(userName:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/register""","""controllers.NasaRegistrationController.registrationForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/register/publish""","""controllers.NasaRegistrationController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/updateUser""","""controllers.NasaRegistrationController.updateForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/updateUser/update""","""controllers.NasaRegistrationController.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/deleteUser""","""controllers.NasaRegistrationController.deleteForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/deleteUser/delete""","""controllers.NasaRegistrationController.delete()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/adminPage""","""controllers.NasaRegistrationController.adminPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate""","""controllers.EstimateController.estimate(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/1""","""controllers.EstimateController.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/1""","""controllers.EstimateController.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/2""","""controllers.EstimateController.estimate2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/3""","""controllers.EstimateController.estimate3()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/tutorial""","""controllers.EstimateController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/login""","""controllers.EstimateController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/login""","""controllers.EstimateController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/logout""","""controllers.EstimateController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/accountSummary""","""controllers.EstimateController.accountSummary(userName:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/register""","""controllers.NasaRegistrationController.registrationForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/register/publish""","""controllers.NasaRegistrationController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/updateUser""","""controllers.NasaRegistrationController.updateForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/updateUser/update""","""controllers.NasaRegistrationController.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/deleteUser""","""controllers.NasaRegistrationController.deleteForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/deleteUser/delete""","""controllers.NasaRegistrationController.delete()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """climate/adminPage""","""controllers.NasaRegistrationController.adminPage()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case controllers_BugReportController_reports4(params) => {
   call { 
        invokeHandler(controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Nil,"GET", """ BugReporting""", Routes.prefix + """bugs"""))
   }
}
        

// @LINE:15
case controllers_BugReportController_newReport5(params) => {
   call { 
        invokeHandler(controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Nil,"GET", """""", Routes.prefix + """newReport"""))
   }
}
        

// @LINE:16
case controllers_BugReportController_list6(params) => {
   call { 
        invokeHandler(controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Nil,"GET", """""", Routes.prefix + """bug/list"""))
   }
}
        

// @LINE:17
case controllers_BugReportController_deleteReport7(params) => {
   call { 
        invokeHandler(controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Nil,"POST", """""", Routes.prefix + """delete/report"""))
   }
}
        

// @LINE:18
case controllers_BugReportController_solveReport8(params) => {
   call { 
        invokeHandler(controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Nil,"POST", """""", Routes.prefix + """solve/report"""))
   }
}
        

// @LINE:21
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:24
case controllers_SensorTypeController_sensorTypes10(params) => {
   call { 
        invokeHandler(controllers.SensorTypeController.sensorTypes(), HandlerDef(this, "controllers.SensorTypeController", "sensorTypes", Nil,"GET", """ sensor_types""", Routes.prefix + """sensorTypes"""))
   }
}
        

// @LINE:25
case controllers_SensorTypeController_newSensorType11(params) => {
   call { 
        invokeHandler(controllers.SensorTypeController.newSensorType(), HandlerDef(this, "controllers.SensorTypeController", "newSensorType", Nil,"POST", """""", Routes.prefix + """new/sensorTypes"""))
   }
}
        

// @LINE:26
case controllers_SensorTypeController_deleteSensorType12(params) => {
   call { 
        invokeHandler(controllers.SensorTypeController.deleteSensorType(), HandlerDef(this, "controllers.SensorTypeController", "deleteSensorType", Nil,"POST", """""", Routes.prefix + """delete/sensorTypes"""))
   }
}
        

// @LINE:27
case controllers_SensorTypeController_editSensorType13(params) => {
   call { 
        invokeHandler(controllers.SensorTypeController.editSensorType(), HandlerDef(this, "controllers.SensorTypeController", "editSensorType", Nil,"POST", """""", Routes.prefix + """edit/sensorTypes"""))
   }
}
        

// @LINE:30
case controllers_DeviceTypeController_deviceTypes14(params) => {
   call { 
        invokeHandler(controllers.DeviceTypeController.deviceTypes(), HandlerDef(this, "controllers.DeviceTypeController", "deviceTypes", Nil,"GET", """ device_types""", Routes.prefix + """deviceTypes"""))
   }
}
        

// @LINE:31
case controllers_DeviceTypeController_newDeviceType15(params) => {
   call { 
        invokeHandler(controllers.DeviceTypeController.newDeviceType(), HandlerDef(this, "controllers.DeviceTypeController", "newDeviceType", Nil,"POST", """""", Routes.prefix + """new/deviceTypes"""))
   }
}
        

// @LINE:32
case controllers_DeviceTypeController_deleteDeviceType16(params) => {
   call { 
        invokeHandler(controllers.DeviceTypeController.deleteDeviceType(), HandlerDef(this, "controllers.DeviceTypeController", "deleteDeviceType", Nil,"POST", """""", Routes.prefix + """delete/deviceTypes"""))
   }
}
        

// @LINE:33
case controllers_DeviceTypeController_editDeviceType17(params) => {
   call { 
        invokeHandler(controllers.DeviceTypeController.editDeviceType(), HandlerDef(this, "controllers.DeviceTypeController", "editDeviceType", Nil,"POST", """""", Routes.prefix + """edit/deviceTypes"""))
   }
}
        

// @LINE:36
case controllers_DeviceController_devices18(params) => {
   call { 
        invokeHandler(controllers.DeviceController.devices(), HandlerDef(this, "controllers.DeviceController", "devices", Nil,"GET", """ devices""", Routes.prefix + """devices"""))
   }
}
        

// @LINE:37
case controllers_DeviceController_newDevice19(params) => {
   call { 
        invokeHandler(controllers.DeviceController.newDevice(), HandlerDef(this, "controllers.DeviceController", "newDevice", Nil,"POST", """""", Routes.prefix + """new/devices"""))
   }
}
        

// @LINE:38
case controllers_DeviceController_deleteDevice20(params) => {
   call { 
        invokeHandler(controllers.DeviceController.deleteDevice(), HandlerDef(this, "controllers.DeviceController", "deleteDevice", Nil,"POST", """""", Routes.prefix + """delete/devices"""))
   }
}
        

// @LINE:39
case controllers_DeviceController_editDevice21(params) => {
   call { 
        invokeHandler(controllers.DeviceController.editDevice(), HandlerDef(this, "controllers.DeviceController", "editDevice", Nil,"POST", """""", Routes.prefix + """edit/devices"""))
   }
}
        

// @LINE:42
case controllers_SensorController_sensors22(params) => {
   call { 
        invokeHandler(controllers.SensorController.sensors(), HandlerDef(this, "controllers.SensorController", "sensors", Nil,"GET", """ sensors""", Routes.prefix + """sensors"""))
   }
}
        

// @LINE:43
case controllers_SensorController_newSensor23(params) => {
   call { 
        invokeHandler(controllers.SensorController.newSensor(), HandlerDef(this, "controllers.SensorController", "newSensor", Nil,"POST", """""", Routes.prefix + """new/sensors"""))
   }
}
        

// @LINE:44
case controllers_SensorController_deleteSensor24(params) => {
   call { 
        invokeHandler(controllers.SensorController.deleteSensor(), HandlerDef(this, "controllers.SensorController", "deleteSensor", Nil,"POST", """""", Routes.prefix + """delete/sensors"""))
   }
}
        

// @LINE:45
case controllers_SensorController_editSensor25(params) => {
   call { 
        invokeHandler(controllers.SensorController.editSensor(), HandlerDef(this, "controllers.SensorController", "editSensor", Nil,"POST", """""", Routes.prefix + """edit/sensors"""))
   }
}
        

// @LINE:48
case controllers_SensorCategoryController_sensorCategories26(params) => {
   call { 
        invokeHandler(controllers.SensorCategoryController.sensorCategories(), HandlerDef(this, "controllers.SensorCategoryController", "sensorCategories", Nil,"GET", """ sensor_categories""", Routes.prefix + """sensorCategories"""))
   }
}
        

// @LINE:49
case controllers_SensorCategoryController_newSensorCategory27(params) => {
   call { 
        invokeHandler(controllers.SensorCategoryController.newSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "newSensorCategory", Nil,"POST", """""", Routes.prefix + """new/sensorCategories"""))
   }
}
        

// @LINE:50
case controllers_SensorCategoryController_deleteSensorCategory28(params) => {
   call { 
        invokeHandler(controllers.SensorCategoryController.deleteSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "deleteSensorCategory", Nil,"POST", """""", Routes.prefix + """delete/sensorCategories"""))
   }
}
        

// @LINE:51
case controllers_SensorCategoryController_downloadSensorCategory29(params) => {
   call { 
        invokeHandler(controllers.SensorCategoryController.downloadSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "downloadSensorCategory", Nil,"POST", """""", Routes.prefix + """download/sensorCategories"""))
   }
}
        

// @LINE:52
case controllers_SensorCategoryController_editSensorCategory30(params) => {
   call { 
        invokeHandler(controllers.SensorCategoryController.editSensorCategory(), HandlerDef(this, "controllers.SensorCategoryController", "editSensorCategory", Nil,"POST", """""", Routes.prefix + """edit/sensorCategories"""))
   }
}
        

// @LINE:55
case controllers_DashboardController_dashboard31(params) => {
   call { 
        invokeHandler(controllers.DashboardController.dashboard(), HandlerDef(this, "controllers.DashboardController", "dashboard", Nil,"GET", """ dashboard""", Routes.prefix + """dashboard"""))
   }
}
        

// @LINE:58
case controllers_AboutusController_aboutus32(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutus(), HandlerDef(this, "controllers.AboutusController", "aboutus", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:61
case controllers_SensorReadingController_sensorReadings33(params) => {
   call { 
        invokeHandler(controllers.SensorReadingController.sensorReadings(), HandlerDef(this, "controllers.SensorReadingController", "sensorReadings", Nil,"GET", """ sensor reading""", Routes.prefix + """sensorReading"""))
   }
}
        

// @LINE:62
case controllers_SensorReadingController_getSensorReadingsWithinRange34(params) => {
   call { 
        invokeHandler(controllers.SensorReadingController.getSensorReadingsWithinRange(), HandlerDef(this, "controllers.SensorReadingController", "getSensorReadingsWithinRange", Nil,"POST", """""", Routes.prefix + """getSensorReadings"""))
   }
}
        

// @LINE:63
case controllers_SensorReadingController_getSensorReadingsAtTimestamp35(params) => {
   call { 
        invokeHandler(controllers.SensorReadingController.getSensorReadingsAtTimestamp(), HandlerDef(this, "controllers.SensorReadingController", "getSensorReadingsAtTimestamp", Nil,"POST", """""", Routes.prefix + """getSensorReadingsAtTimestamp"""))
   }
}
        

// @LINE:64
case controllers_SensorReadingController_getLatestSensorReadings36(params) => {
   call { 
        invokeHandler(controllers.SensorReadingController.getLatestSensorReadings(), HandlerDef(this, "controllers.SensorReadingController", "getLatestSensorReadings", Nil,"POST", """""", Routes.prefix + """getLatestSensorReadings"""))
   }
}
        

// @LINE:70
case controllers_EstimateController_estimate37(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.EstimateController.estimate(email, vfile, dataset), HandlerDef(this, "controllers.EstimateController", "estimate", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ recommendation""", Routes.prefix + """estimator"""))
   }
}
        

// @LINE:71
case controllers_EstimateController_estimate138(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Nil,"POST", """""", Routes.prefix + """estimator/1"""))
   }
}
        

// @LINE:72
case controllers_EstimateController_estimate139(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Nil,"GET", """""", Routes.prefix + """estimator/1"""))
   }
}
        

// @LINE:73
case controllers_EstimateController_estimate240(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate2(), HandlerDef(this, "controllers.EstimateController", "estimate2", Nil,"GET", """""", Routes.prefix + """estimator/2"""))
   }
}
        

// @LINE:74
case controllers_EstimateController_estimate341(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate3(), HandlerDef(this, "controllers.EstimateController", "estimate3", Nil,"GET", """""", Routes.prefix + """estimator/3"""))
   }
}
        

// @LINE:75
case controllers_EstimateController_tutorial42(params) => {
   call { 
        invokeHandler(controllers.EstimateController.tutorial(), HandlerDef(this, "controllers.EstimateController", "tutorial", Nil,"GET", """""", Routes.prefix + """estimator/tutorial"""))
   }
}
        

// @LINE:76
case controllers_EstimateController_login43(params) => {
   call { 
        invokeHandler(controllers.EstimateController.login(), HandlerDef(this, "controllers.EstimateController", "login", Nil,"GET", """""", Routes.prefix + """estimator/login"""))
   }
}
        

// @LINE:77
case controllers_EstimateController_authenticate44(params) => {
   call { 
        invokeHandler(controllers.EstimateController.authenticate(), HandlerDef(this, "controllers.EstimateController", "authenticate", Nil,"POST", """""", Routes.prefix + """estimator/login"""))
   }
}
        

// @LINE:78
case controllers_EstimateController_logout45(params) => {
   call { 
        invokeHandler(controllers.EstimateController.logout(), HandlerDef(this, "controllers.EstimateController", "logout", Nil,"GET", """""", Routes.prefix + """estimator/logout"""))
   }
}
        

// @LINE:79
case controllers_EstimateController_accountSummary46(params) => {
   call(params.fromQuery[String]("userName", Some(null))) { (userName) =>
        invokeHandler(controllers.EstimateController.accountSummary(userName), HandlerDef(this, "controllers.EstimateController", "accountSummary", Seq(classOf[String]),"GET", """""", Routes.prefix + """estimator/accountSummary"""))
   }
}
        

// @LINE:82
case controllers_NasaRegistrationController_registrationForm47(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.registrationForm(), HandlerDef(this, "controllers.NasaRegistrationController", "registrationForm", Nil,"GET", """Registration""", Routes.prefix + """estimator/register"""))
   }
}
        

// @LINE:83
case controllers_NasaRegistrationController_submit48(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.submit(), HandlerDef(this, "controllers.NasaRegistrationController", "submit", Nil,"POST", """""", Routes.prefix + """estimator/register/publish"""))
   }
}
        

// @LINE:84
case controllers_NasaRegistrationController_updateForm49(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.updateForm(), HandlerDef(this, "controllers.NasaRegistrationController", "updateForm", Nil,"GET", """""", Routes.prefix + """estimator/updateUser"""))
   }
}
        

// @LINE:85
case controllers_NasaRegistrationController_update50(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.update(), HandlerDef(this, "controllers.NasaRegistrationController", "update", Nil,"POST", """""", Routes.prefix + """estimator/updateUser/update"""))
   }
}
        

// @LINE:86
case controllers_NasaRegistrationController_deleteForm51(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.deleteForm(), HandlerDef(this, "controllers.NasaRegistrationController", "deleteForm", Nil,"GET", """""", Routes.prefix + """estimator/deleteUser"""))
   }
}
        

// @LINE:87
case controllers_NasaRegistrationController_delete52(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.delete(), HandlerDef(this, "controllers.NasaRegistrationController", "delete", Nil,"POST", """""", Routes.prefix + """estimator/deleteUser/delete"""))
   }
}
        

// @LINE:88
case controllers_NasaRegistrationController_adminPage53(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.adminPage(), HandlerDef(this, "controllers.NasaRegistrationController", "adminPage", Nil,"GET", """""", Routes.prefix + """estimator/adminPage"""))
   }
}
        

// @LINE:91
case controllers_EstimateController_estimate54(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.EstimateController.estimate(email, vfile, dataset), HandlerDef(this, "controllers.EstimateController", "estimate", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Climate Model""", Routes.prefix + """climate"""))
   }
}
        

// @LINE:92
case controllers_EstimateController_estimate155(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Nil,"POST", """""", Routes.prefix + """climate/1"""))
   }
}
        

// @LINE:93
case controllers_EstimateController_estimate156(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Nil,"GET", """""", Routes.prefix + """climate/1"""))
   }
}
        

// @LINE:94
case controllers_EstimateController_estimate257(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate2(), HandlerDef(this, "controllers.EstimateController", "estimate2", Nil,"GET", """""", Routes.prefix + """climate/2"""))
   }
}
        

// @LINE:95
case controllers_EstimateController_estimate358(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate3(), HandlerDef(this, "controllers.EstimateController", "estimate3", Nil,"GET", """""", Routes.prefix + """climate/3"""))
   }
}
        

// @LINE:96
case controllers_EstimateController_tutorial59(params) => {
   call { 
        invokeHandler(controllers.EstimateController.tutorial(), HandlerDef(this, "controllers.EstimateController", "tutorial", Nil,"GET", """""", Routes.prefix + """climate/tutorial"""))
   }
}
        

// @LINE:97
case controllers_EstimateController_login60(params) => {
   call { 
        invokeHandler(controllers.EstimateController.login(), HandlerDef(this, "controllers.EstimateController", "login", Nil,"GET", """""", Routes.prefix + """climate/login"""))
   }
}
        

// @LINE:98
case controllers_EstimateController_authenticate61(params) => {
   call { 
        invokeHandler(controllers.EstimateController.authenticate(), HandlerDef(this, "controllers.EstimateController", "authenticate", Nil,"POST", """""", Routes.prefix + """climate/login"""))
   }
}
        

// @LINE:99
case controllers_EstimateController_logout62(params) => {
   call { 
        invokeHandler(controllers.EstimateController.logout(), HandlerDef(this, "controllers.EstimateController", "logout", Nil,"GET", """""", Routes.prefix + """climate/logout"""))
   }
}
        

// @LINE:100
case controllers_EstimateController_accountSummary63(params) => {
   call(params.fromQuery[String]("userName", Some(null))) { (userName) =>
        invokeHandler(controllers.EstimateController.accountSummary(userName), HandlerDef(this, "controllers.EstimateController", "accountSummary", Seq(classOf[String]),"GET", """""", Routes.prefix + """climate/accountSummary"""))
   }
}
        

// @LINE:105
case controllers_NasaRegistrationController_registrationForm64(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.registrationForm(), HandlerDef(this, "controllers.NasaRegistrationController", "registrationForm", Nil,"GET", """Climate Model Registration""", Routes.prefix + """climate/register"""))
   }
}
        

// @LINE:106
case controllers_NasaRegistrationController_submit65(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.submit(), HandlerDef(this, "controllers.NasaRegistrationController", "submit", Nil,"POST", """""", Routes.prefix + """climate/register/publish"""))
   }
}
        

// @LINE:107
case controllers_NasaRegistrationController_updateForm66(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.updateForm(), HandlerDef(this, "controllers.NasaRegistrationController", "updateForm", Nil,"GET", """""", Routes.prefix + """climate/updateUser"""))
   }
}
        

// @LINE:108
case controllers_NasaRegistrationController_update67(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.update(), HandlerDef(this, "controllers.NasaRegistrationController", "update", Nil,"POST", """""", Routes.prefix + """climate/updateUser/update"""))
   }
}
        

// @LINE:109
case controllers_NasaRegistrationController_deleteForm68(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.deleteForm(), HandlerDef(this, "controllers.NasaRegistrationController", "deleteForm", Nil,"GET", """""", Routes.prefix + """climate/deleteUser"""))
   }
}
        

// @LINE:110
case controllers_NasaRegistrationController_delete69(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.delete(), HandlerDef(this, "controllers.NasaRegistrationController", "delete", Nil,"POST", """""", Routes.prefix + """climate/deleteUser/delete"""))
   }
}
        

// @LINE:111
case controllers_NasaRegistrationController_adminPage70(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.adminPage(), HandlerDef(this, "controllers.NasaRegistrationController", "adminPage", Nil,"GET", """""", Routes.prefix + """climate/adminPage"""))
   }
}
        
}

}
     