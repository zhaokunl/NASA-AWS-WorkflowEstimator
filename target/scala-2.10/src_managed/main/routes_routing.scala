// @SOURCE:/home/derek/NASA-AWS-WorkflowEstimator/conf/routes
// @HASH:e89d15d7450a4a2ca9e5f327ca5ad517d4dee17f
// @DATE:Thu Nov 06 15:22:48 EST 2014


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
private[this] lazy val controllers_DashboardController_dashboard10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
        

// @LINE:27
private[this] lazy val controllers_AboutusController_aboutus11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:30
private[this] lazy val controllers_EstimateController_estimate12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator"))))
        

// @LINE:31
private[this] lazy val controllers_EstimateController_estimate113 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/1"))))
        

// @LINE:32
private[this] lazy val controllers_EstimateController_estimate114 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/1"))))
        

// @LINE:33
private[this] lazy val controllers_EstimateController_estimate215 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/2"))))
        

// @LINE:34
private[this] lazy val controllers_EstimateController_estimate316 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/3"))))
        

// @LINE:35
private[this] lazy val controllers_EstimateController_tutorial17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/tutorial"))))
        

// @LINE:36
private[this] lazy val controllers_EstimateController_login18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/login"))))
        

// @LINE:37
private[this] lazy val controllers_EstimateController_authenticate19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/login"))))
        

// @LINE:38
private[this] lazy val controllers_EstimateController_logout20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/logout"))))
        

// @LINE:39
private[this] lazy val controllers_EstimateController_accountSummary21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/accountSummary"))))
        

// @LINE:42
private[this] lazy val controllers_NasaRegistrationController_registrationForm22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/register"))))
        

// @LINE:43
private[this] lazy val controllers_NasaRegistrationController_submit23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/register/publish"))))
        

// @LINE:44
private[this] lazy val controllers_NasaRegistrationController_updateForm24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/updateUser"))))
        

// @LINE:45
private[this] lazy val controllers_NasaRegistrationController_update25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/updateUser/update"))))
        

// @LINE:46
private[this] lazy val controllers_NasaRegistrationController_deleteForm26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/deleteUser"))))
        

// @LINE:47
private[this] lazy val controllers_NasaRegistrationController_delete27 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/deleteUser/delete"))))
        

// @LINE:48
private[this] lazy val controllers_NasaRegistrationController_adminPage28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/adminPage"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.DashboardController.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutus()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator""","""controllers.EstimateController.estimate(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/1""","""controllers.EstimateController.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/1""","""controllers.EstimateController.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/2""","""controllers.EstimateController.estimate2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/3""","""controllers.EstimateController.estimate3()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/tutorial""","""controllers.EstimateController.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/login""","""controllers.EstimateController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/login""","""controllers.EstimateController.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/logout""","""controllers.EstimateController.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/accountSummary""","""controllers.EstimateController.accountSummary(userName:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/register""","""controllers.NasaRegistrationController.registrationForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/register/publish""","""controllers.NasaRegistrationController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/updateUser""","""controllers.NasaRegistrationController.updateForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/updateUser/update""","""controllers.NasaRegistrationController.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/deleteUser""","""controllers.NasaRegistrationController.deleteForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/deleteUser/delete""","""controllers.NasaRegistrationController.delete()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/adminPage""","""controllers.NasaRegistrationController.adminPage()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_DashboardController_dashboard10(params) => {
   call { 
        invokeHandler(controllers.DashboardController.dashboard(), HandlerDef(this, "controllers.DashboardController", "dashboard", Nil,"GET", """ dashboard""", Routes.prefix + """dashboard"""))
   }
}
        

// @LINE:27
case controllers_AboutusController_aboutus11(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutus(), HandlerDef(this, "controllers.AboutusController", "aboutus", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:30
case controllers_EstimateController_estimate12(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.EstimateController.estimate(email, vfile, dataset), HandlerDef(this, "controllers.EstimateController", "estimate", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ recommendation""", Routes.prefix + """estimator"""))
   }
}
        

// @LINE:31
case controllers_EstimateController_estimate113(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Nil,"POST", """""", Routes.prefix + """estimator/1"""))
   }
}
        

// @LINE:32
case controllers_EstimateController_estimate114(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate1(), HandlerDef(this, "controllers.EstimateController", "estimate1", Nil,"GET", """""", Routes.prefix + """estimator/1"""))
   }
}
        

// @LINE:33
case controllers_EstimateController_estimate215(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate2(), HandlerDef(this, "controllers.EstimateController", "estimate2", Nil,"GET", """""", Routes.prefix + """estimator/2"""))
   }
}
        

// @LINE:34
case controllers_EstimateController_estimate316(params) => {
   call { 
        invokeHandler(controllers.EstimateController.estimate3(), HandlerDef(this, "controllers.EstimateController", "estimate3", Nil,"GET", """""", Routes.prefix + """estimator/3"""))
   }
}
        

// @LINE:35
case controllers_EstimateController_tutorial17(params) => {
   call { 
        invokeHandler(controllers.EstimateController.tutorial(), HandlerDef(this, "controllers.EstimateController", "tutorial", Nil,"GET", """""", Routes.prefix + """estimator/tutorial"""))
   }
}
        

// @LINE:36
case controllers_EstimateController_login18(params) => {
   call { 
        invokeHandler(controllers.EstimateController.login(), HandlerDef(this, "controllers.EstimateController", "login", Nil,"GET", """""", Routes.prefix + """estimator/login"""))
   }
}
        

// @LINE:37
case controllers_EstimateController_authenticate19(params) => {
   call { 
        invokeHandler(controllers.EstimateController.authenticate(), HandlerDef(this, "controllers.EstimateController", "authenticate", Nil,"POST", """""", Routes.prefix + """estimator/login"""))
   }
}
        

// @LINE:38
case controllers_EstimateController_logout20(params) => {
   call { 
        invokeHandler(controllers.EstimateController.logout(), HandlerDef(this, "controllers.EstimateController", "logout", Nil,"GET", """""", Routes.prefix + """estimator/logout"""))
   }
}
        

// @LINE:39
case controllers_EstimateController_accountSummary21(params) => {
   call(params.fromQuery[String]("userName", Some(null))) { (userName) =>
        invokeHandler(controllers.EstimateController.accountSummary(userName), HandlerDef(this, "controllers.EstimateController", "accountSummary", Seq(classOf[String]),"GET", """""", Routes.prefix + """estimator/accountSummary"""))
   }
}
        

// @LINE:42
case controllers_NasaRegistrationController_registrationForm22(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.registrationForm(), HandlerDef(this, "controllers.NasaRegistrationController", "registrationForm", Nil,"GET", """Registration""", Routes.prefix + """estimator/register"""))
   }
}
        

// @LINE:43
case controllers_NasaRegistrationController_submit23(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.submit(), HandlerDef(this, "controllers.NasaRegistrationController", "submit", Nil,"POST", """""", Routes.prefix + """estimator/register/publish"""))
   }
}
        

// @LINE:44
case controllers_NasaRegistrationController_updateForm24(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.updateForm(), HandlerDef(this, "controllers.NasaRegistrationController", "updateForm", Nil,"GET", """""", Routes.prefix + """estimator/updateUser"""))
   }
}
        

// @LINE:45
case controllers_NasaRegistrationController_update25(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.update(), HandlerDef(this, "controllers.NasaRegistrationController", "update", Nil,"POST", """""", Routes.prefix + """estimator/updateUser/update"""))
   }
}
        

// @LINE:46
case controllers_NasaRegistrationController_deleteForm26(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.deleteForm(), HandlerDef(this, "controllers.NasaRegistrationController", "deleteForm", Nil,"GET", """""", Routes.prefix + """estimator/deleteUser"""))
   }
}
        

// @LINE:47
case controllers_NasaRegistrationController_delete27(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.delete(), HandlerDef(this, "controllers.NasaRegistrationController", "delete", Nil,"POST", """""", Routes.prefix + """estimator/deleteUser/delete"""))
   }
}
        

// @LINE:48
case controllers_NasaRegistrationController_adminPage28(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.adminPage(), HandlerDef(this, "controllers.NasaRegistrationController", "adminPage", Nil,"GET", """""", Routes.prefix + """estimator/adminPage"""))
   }
}
        
}

}
     