
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
object sayHello extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(name: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),_display_(Seq[Any](/*2.2*/main("Say Hello")/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
	<p>Welcome  --> """),_display_(Seq[Any](/*3.19*/{name})),format.raw/*3.25*/("""</p>
""")))})))}
    }
    
    def render(name:String): play.api.templates.HtmlFormat.Appendable = apply(name)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (name) => apply(name)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:33 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/sayHello.scala.html
                    HASH: e526fde17eb4cf7a654aced0ef9c69e6f6f61d37
                    MATRIX: 777->1|885->15|921->17|946->34|984->35|1038->54|1065->60
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3
                    -- GENERATED --
                */
            