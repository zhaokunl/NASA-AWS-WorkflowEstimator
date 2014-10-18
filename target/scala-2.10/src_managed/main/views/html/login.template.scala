
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/(""" 

"""),_display_(Seq[Any](/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""    
    
    """),_display_(Seq[Any](/*5.6*/helper/*5.12*/.form(routes.Application.authenticate)/*5.50*/ {_display_(Seq[Any](format.raw/*5.52*/("""
        
        <h1>Sign in</h1>
        
        """),_display_(Seq[Any](/*9.10*/if(form.hasGlobalErrors)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/(""" 
            <p class="error">
                """),_display_(Seq[Any](/*11.18*/form/*11.22*/.globalError.message)),format.raw/*11.42*/("""
            </p>
        """)))})),format.raw/*13.10*/("""
        
        """),_display_(Seq[Any](/*15.10*/if(flash.contains("success"))/*15.39*/ {_display_(Seq[Any](format.raw/*15.41*/("""
            <p class="success">
                """),_display_(Seq[Any](/*17.18*/flash/*17.23*/.get("success"))),format.raw/*17.38*/("""
            </p>
        """)))})),format.raw/*19.10*/("""
        
        <p>
            <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*22.74*/form("email")/*22.87*/.value)),format.raw/*22.93*/("""">
        </p>

        <p>
            <input type="password" name="password" placeholder="Password">
        </p>
        <p>
            <button type="submit" class="btn btn-primary">Login</button>
        </p>
        
    """)))})),format.raw/*32.6*/("""
            
""")))})),format.raw/*34.2*/("""
    

"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 18:36:21 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/login.scala.html
                    HASH: addce7ed776ce50cd0802e63f1ab2859c5df5cf1
                    MATRIX: 791->1|916->32|954->36|975->49|1014->51|1063->66|1077->72|1123->110|1162->112|1250->165|1282->189|1321->191|1406->240|1419->244|1461->264|1520->291|1575->310|1613->339|1653->341|1739->391|1753->396|1790->411|1849->438|1980->533|2002->546|2030->552|2290->781|2336->796
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|37->9|37->9|37->9|39->11|39->11|39->11|41->13|43->15|43->15|43->15|45->17|45->17|45->17|47->19|50->22|50->22|50->22|60->32|62->34
                    -- GENERATED --
                */
            