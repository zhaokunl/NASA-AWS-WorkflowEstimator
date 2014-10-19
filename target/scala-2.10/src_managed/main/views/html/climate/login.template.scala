
package views.html.climate

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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[EstimateController.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[EstimateController.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.40*/("""{"""),format.raw/*1.41*/("""

"""),_display_(Seq[Any](/*3.2*/main("Estimator")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""    
    
    """),_display_(Seq[Any](/*5.6*/helper/*5.12*/.form(routes.EstimateController.authenticate)/*5.57*/ {_display_(Seq[Any](format.raw/*5.59*/("""
        
        <h1>Sign in</h1>

        
        <p>
            <input type="text" name="username" placeholder="Username">
        </p>
        <p>
            <input type="password" name="password" placeholder="Password">
        </p>
        <p>
            <button type="submit" class="btn btn-primary">Login</button>    
        </p>
        
    """)))})),format.raw/*20.6*/("""
            
""")))})),format.raw/*22.2*/("""
    
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
"""))}
    }
    
    def render(form:Form[EstimateController.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[EstimateController.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/climate/login.scala.html
                    HASH: ec16de84265e686ae2325c2b892fddd0b34516bd
                    MATRIX: 806->1|938->39|966->40|1003->43|1028->60|1067->62|1116->77|1130->83|1183->128|1222->130|1610->487|1656->502|1689->508|1717->509
                    LINES: 26->1|29->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|48->20|50->22|52->24|52->24
                    -- GENERATED --
                */
            