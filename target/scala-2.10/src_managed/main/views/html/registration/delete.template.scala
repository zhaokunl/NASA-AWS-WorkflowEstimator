
package views.html.registration

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
object delete extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[NasaRegistration],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[NasaRegistration]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.36*/("""
"""),_display_(Seq[Any](/*4.2*/main("Nasa Update Form")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""



    <div class="clearfix  " id="name_field">
       
                    
    <legend>User Deletion Form</legend>
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.NasaRegistrationController.delete())/*12.70*/{_display_(Seq[Any](format.raw/*12.71*/("""
    <fieldset>
    """),_display_(Seq[Any](/*14.6*/helper/*14.12*/.inputText(userForm("userNameField"),'_label -> "User Name*"))),format.raw/*14.73*/("""
    """),_display_(Seq[Any](/*15.6*/helper/*15.12*/.inputPassword(userForm("passwordField"), '_label -> "Password*"))),format.raw/*15.77*/("""
    
    
    <input type="submit" class="btn btn-primary" value="Delete">
    <fieldset>
    </div>
""")))})),format.raw/*21.2*/("""
""")))})),format.raw/*22.2*/("""

"""))}
    }
    
    def render(userForm:Form[NasaRegistration]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[NasaRegistration]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:35 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/registration/delete.scala.html
                    HASH: 079bb8f92d475fc9850b84d1912eebe8b393c975
                    MATRIX: 804->1|982->35|1018->88|1050->112|1088->113|1246->236|1261->242|1328->300|1367->301|1423->322|1438->328|1521->389|1562->395|1577->401|1664->466|1798->569|1831->571
                    LINES: 26->1|32->1|33->4|33->4|33->4|41->12|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|50->21|51->22
                    -- GENERATED --
                */
            