// @SOURCE:/Users/zhaokunli/NASA-AWS-WorkflowEstimator/conf/routes
// @HASH:cf6e3381fe5e6d2b57b53675c2fd8cc48304cfe3
// @DATE:Mon Nov 10 14:42:54 EST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
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
                          

// @LINE:24
class ReverseAboutusController {
    

// @LINE:24
def aboutus(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
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
                          

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseNasaRegistrationController {
    

// @LINE:43
def delete(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "estimator/deleteUser/delete")
}
                                                

// @LINE:42
def deleteForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/deleteUser")
}
                                                

// @LINE:44
def adminPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/adminPage")
}
                                                

// @LINE:39
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "estimator/register/publish")
}
                                                

// @LINE:40
def updateForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/updateUser")
}
                                                

// @LINE:41
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "estimator/updateUser/update")
}
                                                

// @LINE:38
def registrationForm(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/register")
}
                                                
    
}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:30
def estimate3(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/3")
}
                                                

// @LINE:29
def estimate2(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/2")
}
                                                

// @LINE:35
def accountSummary(userName:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/accountSummary" + queryString(List(if(userName == null) None else Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                

// @LINE:31
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "estimator/tutorial")
}
                                                

// @LINE:28
// @LINE:27
def estimate1(): Call = {
   () match {
// @LINE:27
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/1")
                                                        
// @LINE:28
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/1")
                                                        
   }
}
                                                

// @LINE:34
// @LINE:11
def logout(): Call = {
   () match {
// @LINE:11
case () if true => Call("GET", _prefix + { _defaultPrefix } + "logout")
                                                        
// @LINE:34
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/logout")
                                                        
   }
}
                                                

// @LINE:6
def index(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
}
                                                

// @LINE:33
// @LINE:10
def authenticate(): Call = {
   () match {
// @LINE:10
case () if true => Call("POST", _prefix + { _defaultPrefix } + "login")
                                                        
// @LINE:33
case () if true => Call("POST", _prefix + { _defaultPrefix } + "estimator/login")
                                                        
   }
}
                                                

// @LINE:32
// @LINE:9
def login(): Call = {
   () match {
// @LINE:9
case () if true => Call("GET", _prefix + { _defaultPrefix } + "login")
                                                        
// @LINE:32
case () if true => Call("GET", _prefix + { _defaultPrefix } + "estimator/login")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
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
              

// @LINE:24
class ReverseAboutusController {
    

// @LINE:24
def aboutus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
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
              

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseNasaRegistrationController {
    

// @LINE:43
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.delete",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/deleteUser/delete"})
      }
   """
)
                        

// @LINE:42
def deleteForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.deleteForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/deleteUser"})
      }
   """
)
                        

// @LINE:44
def adminPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.adminPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/adminPage"})
      }
   """
)
                        

// @LINE:39
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/register/publish"})
      }
   """
)
                        

// @LINE:40
def updateForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.updateForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/updateUser"})
      }
   """
)
                        

// @LINE:41
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/updateUser/update"})
      }
   """
)
                        

// @LINE:38
def registrationForm : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.NasaRegistrationController.registrationForm",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/register"})
      }
   """
)
                        
    
}
              

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:30
def estimate3 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.estimate3",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/3"})
      }
   """
)
                        

// @LINE:29
def estimate2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.estimate2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/2"})
      }
   """
)
                        

// @LINE:35
def accountSummary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.accountSummary",
   """
      function(userName) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/accountSummary" + _qS([(userName == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName))])})
      }
   """
)
                        

// @LINE:31
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/tutorial"})
      }
   """
)
                        

// @LINE:28
// @LINE:27
def estimate1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.estimate1",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/1"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/1"})
      }
      }
   """
)
                        

// @LINE:34
// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/logout"})
      }
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
   """
)
                        

// @LINE:33
// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/login"})
      }
      }
   """
)
                        

// @LINE:32
// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estimator/login"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
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
                          

// @LINE:24
class ReverseAboutusController {
    

// @LINE:24
def aboutus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutus(), HandlerDef(this, "controllers.AboutusController", "aboutus", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
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
                          

// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
class ReverseNasaRegistrationController {
    

// @LINE:43
def delete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.delete(), HandlerDef(this, "controllers.NasaRegistrationController", "delete", Seq(), "POST", """""", _prefix + """estimator/deleteUser/delete""")
)
                      

// @LINE:42
def deleteForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.deleteForm(), HandlerDef(this, "controllers.NasaRegistrationController", "deleteForm", Seq(), "GET", """""", _prefix + """estimator/deleteUser""")
)
                      

// @LINE:44
def adminPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.adminPage(), HandlerDef(this, "controllers.NasaRegistrationController", "adminPage", Seq(), "GET", """""", _prefix + """estimator/adminPage""")
)
                      

// @LINE:39
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.submit(), HandlerDef(this, "controllers.NasaRegistrationController", "submit", Seq(), "POST", """""", _prefix + """estimator/register/publish""")
)
                      

// @LINE:40
def updateForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.updateForm(), HandlerDef(this, "controllers.NasaRegistrationController", "updateForm", Seq(), "GET", """""", _prefix + """estimator/updateUser""")
)
                      

// @LINE:41
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.update(), HandlerDef(this, "controllers.NasaRegistrationController", "update", Seq(), "POST", """""", _prefix + """estimator/updateUser/update""")
)
                      

// @LINE:38
def registrationForm(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.NasaRegistrationController.registrationForm(), HandlerDef(this, "controllers.NasaRegistrationController", "registrationForm", Seq(), "GET", """Registration""", _prefix + """estimator/register""")
)
                      
    
}
                          

// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:30
def estimate3(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.estimate3(), HandlerDef(this, "controllers.Application", "estimate3", Seq(), "GET", """""", _prefix + """estimator/3""")
)
                      

// @LINE:29
def estimate2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.estimate2(), HandlerDef(this, "controllers.Application", "estimate2", Seq(), "GET", """""", _prefix + """estimator/2""")
)
                      

// @LINE:35
def accountSummary(userName:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.accountSummary(userName), HandlerDef(this, "controllers.Application", "accountSummary", Seq(classOf[String]), "GET", """""", _prefix + """estimator/accountSummary""")
)
                      

// @LINE:31
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.tutorial(), HandlerDef(this, "controllers.Application", "tutorial", Seq(), "GET", """""", _prefix + """estimator/tutorial""")
)
                      

// @LINE:27
def estimate1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.estimate1(), HandlerDef(this, "controllers.Application", "estimate1", Seq(), "POST", """ recommendation""", _prefix + """estimator/1""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:6
def index(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(email, vfile, dataset), HandlerDef(this, "controllers.Application", "index", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """""")
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
                          
}
        
    