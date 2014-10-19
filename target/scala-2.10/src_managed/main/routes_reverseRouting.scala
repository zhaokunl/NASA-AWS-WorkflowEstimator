// @SOURCE:/Users/zhaokunli/modern-web-template/conf/routes
// @HASH:617f0a4477d9ea8d223c07bc13a45502ea7d40c0
// @DATE:Sat Oct 18 21:23:11 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
package controllers {

// @LINE:13
// @LINE:12
class ReverseUsers {
    

// @LINE:12
def findUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:13
def createUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                                                
    
}
                          

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:9
def randomUUID(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "randomUUID")
}
                                                

// @LINE:8
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
package controllers.javascript {

// @LINE:13
// @LINE:12
class ReverseUsers {
    

// @LINE:12
def findUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.findUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:13
def createUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.createUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        
    
}
              

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:9
def randomUUID : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.randomUUID",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "randomUUID"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:13
// @LINE:12
class ReverseUsers {
    

// @LINE:12
def findUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).findUsers(), HandlerDef(this, "controllers.Users", "findUsers", Seq(), "GET", """ User management API""", _prefix + """users""")
)
                      

// @LINE:13
def createUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Users]).createUser(), HandlerDef(this, "controllers.Users", "createUser", Seq(), "POST", """""", _prefix + """user""")
)
                      
    
}
                          

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:9
def randomUUID(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).randomUUID(), HandlerDef(this, "controllers.Application", "randomUUID", Seq(), "GET", """""", _prefix + """randomUUID""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Single endpoint for serving AngularJS""", _prefix + """""")
)
                      
    
}
                          
}
        
    