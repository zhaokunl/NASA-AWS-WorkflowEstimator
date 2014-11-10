// @SOURCE:/Users/zhaokunli/NASA-AWS-WorkflowEstimator/conf/routes
// @HASH:cf6e3381fe5e6d2b57b53675c2fd8cc48304cfe3
// @DATE:Mon Nov 10 14:42:54 EST 2014


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
private[this] lazy val controllers_AboutusController_aboutus10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
        

// @LINE:27
private[this] lazy val controllers_Application_estimate111 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/1"))))
        

// @LINE:28
private[this] lazy val controllers_Application_estimate112 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/1"))))
        

// @LINE:29
private[this] lazy val controllers_Application_estimate213 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/2"))))
        

// @LINE:30
private[this] lazy val controllers_Application_estimate314 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/3"))))
        

// @LINE:31
private[this] lazy val controllers_Application_tutorial15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/tutorial"))))
        

// @LINE:32
private[this] lazy val controllers_Application_login16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/login"))))
        

// @LINE:33
private[this] lazy val controllers_Application_authenticate17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/login"))))
        

// @LINE:34
private[this] lazy val controllers_Application_logout18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/logout"))))
        

// @LINE:35
private[this] lazy val controllers_Application_accountSummary19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/accountSummary"))))
        

// @LINE:38
private[this] lazy val controllers_NasaRegistrationController_registrationForm20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/register"))))
        

// @LINE:39
private[this] lazy val controllers_NasaRegistrationController_submit21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/register/publish"))))
        

// @LINE:40
private[this] lazy val controllers_NasaRegistrationController_updateForm22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/updateUser"))))
        

// @LINE:41
private[this] lazy val controllers_NasaRegistrationController_update23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/updateUser/update"))))
        

// @LINE:42
private[this] lazy val controllers_NasaRegistrationController_deleteForm24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/deleteUser"))))
        

// @LINE:43
private[this] lazy val controllers_NasaRegistrationController_delete25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/deleteUser/delete"))))
        

// @LINE:44
private[this] lazy val controllers_NasaRegistrationController_adminPage26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("estimator/adminPage"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index(email:String ?= null, vfile:String ?= null, dataset:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bugs""","""controllers.BugReportController.reports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newReport""","""controllers.BugReportController.newReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """bug/list""","""controllers.BugReportController.list()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete/report""","""controllers.BugReportController.deleteReport()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """solve/report""","""controllers.BugReportController.solveReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.AboutusController.aboutus()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/1""","""controllers.Application.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/1""","""controllers.Application.estimate1()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/2""","""controllers.Application.estimate2()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/3""","""controllers.Application.estimate3()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/tutorial""","""controllers.Application.tutorial()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/accountSummary""","""controllers.Application.accountSummary(userName:String ?= null)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/register""","""controllers.NasaRegistrationController.registrationForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/register/publish""","""controllers.NasaRegistrationController.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/updateUser""","""controllers.NasaRegistrationController.updateForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/updateUser/update""","""controllers.NasaRegistrationController.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/deleteUser""","""controllers.NasaRegistrationController.deleteForm()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/deleteUser/delete""","""controllers.NasaRegistrationController.delete()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """estimator/adminPage""","""controllers.NasaRegistrationController.adminPage()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call(params.fromQuery[String]("email", Some(null)), params.fromQuery[String]("vfile", Some(null)), params.fromQuery[String]("dataset", Some(null))) { (email, vfile, dataset) =>
        invokeHandler(controllers.Application.index(email, vfile, dataset), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String], classOf[String], classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
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
case controllers_AboutusController_aboutus10(params) => {
   call { 
        invokeHandler(controllers.AboutusController.aboutus(), HandlerDef(this, "controllers.AboutusController", "aboutus", Nil,"GET", """ About Us""", Routes.prefix + """aboutus"""))
   }
}
        

// @LINE:27
case controllers_Application_estimate111(params) => {
   call { 
        invokeHandler(controllers.Application.estimate1(), HandlerDef(this, "controllers.Application", "estimate1", Nil,"POST", """ recommendation""", Routes.prefix + """estimator/1"""))
   }
}
        

// @LINE:28
case controllers_Application_estimate112(params) => {
   call { 
        invokeHandler(controllers.Application.estimate1(), HandlerDef(this, "controllers.Application", "estimate1", Nil,"GET", """""", Routes.prefix + """estimator/1"""))
   }
}
        

// @LINE:29
case controllers_Application_estimate213(params) => {
   call { 
        invokeHandler(controllers.Application.estimate2(), HandlerDef(this, "controllers.Application", "estimate2", Nil,"GET", """""", Routes.prefix + """estimator/2"""))
   }
}
        

// @LINE:30
case controllers_Application_estimate314(params) => {
   call { 
        invokeHandler(controllers.Application.estimate3(), HandlerDef(this, "controllers.Application", "estimate3", Nil,"GET", """""", Routes.prefix + """estimator/3"""))
   }
}
        

// @LINE:31
case controllers_Application_tutorial15(params) => {
   call { 
        invokeHandler(controllers.Application.tutorial(), HandlerDef(this, "controllers.Application", "tutorial", Nil,"GET", """""", Routes.prefix + """estimator/tutorial"""))
   }
}
        

// @LINE:32
case controllers_Application_login16(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """estimator/login"""))
   }
}
        

// @LINE:33
case controllers_Application_authenticate17(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """estimator/login"""))
   }
}
        

// @LINE:34
case controllers_Application_logout18(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """estimator/logout"""))
   }
}
        

// @LINE:35
case controllers_Application_accountSummary19(params) => {
   call(params.fromQuery[String]("userName", Some(null))) { (userName) =>
        invokeHandler(controllers.Application.accountSummary(userName), HandlerDef(this, "controllers.Application", "accountSummary", Seq(classOf[String]),"GET", """""", Routes.prefix + """estimator/accountSummary"""))
   }
}
        

// @LINE:38
case controllers_NasaRegistrationController_registrationForm20(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.registrationForm(), HandlerDef(this, "controllers.NasaRegistrationController", "registrationForm", Nil,"GET", """Registration""", Routes.prefix + """estimator/register"""))
   }
}
        

// @LINE:39
case controllers_NasaRegistrationController_submit21(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.submit(), HandlerDef(this, "controllers.NasaRegistrationController", "submit", Nil,"POST", """""", Routes.prefix + """estimator/register/publish"""))
   }
}
        

// @LINE:40
case controllers_NasaRegistrationController_updateForm22(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.updateForm(), HandlerDef(this, "controllers.NasaRegistrationController", "updateForm", Nil,"GET", """""", Routes.prefix + """estimator/updateUser"""))
   }
}
        

// @LINE:41
case controllers_NasaRegistrationController_update23(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.update(), HandlerDef(this, "controllers.NasaRegistrationController", "update", Nil,"POST", """""", Routes.prefix + """estimator/updateUser/update"""))
   }
}
        

// @LINE:42
case controllers_NasaRegistrationController_deleteForm24(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.deleteForm(), HandlerDef(this, "controllers.NasaRegistrationController", "deleteForm", Nil,"GET", """""", Routes.prefix + """estimator/deleteUser"""))
   }
}
        

// @LINE:43
case controllers_NasaRegistrationController_delete25(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.delete(), HandlerDef(this, "controllers.NasaRegistrationController", "delete", Nil,"POST", """""", Routes.prefix + """estimator/deleteUser/delete"""))
   }
}
        

// @LINE:44
case controllers_NasaRegistrationController_adminPage26(params) => {
   call { 
        invokeHandler(controllers.NasaRegistrationController.adminPage(), HandlerDef(this, "controllers.NasaRegistrationController", "adminPage", Nil,"GET", """""", Routes.prefix + """estimator/adminPage"""))
   }
}
        
}

}
     