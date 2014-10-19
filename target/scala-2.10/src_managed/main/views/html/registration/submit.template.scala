
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
object submit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[NasaRegistration,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(created: NasaRegistration):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""
"""),_display_(Seq[Any](/*2.2*/main("Example")/*2.17*/{_display_(Seq[Any](format.raw/*2.18*/("""
	"""),_display_(Seq[Any](/*3.3*/created/*3.10*/.firstName)),format.raw/*3.20*/("""
	
""")))})))}
    }
    
    def render(created:NasaRegistration): play.api.templates.HtmlFormat.Appendable = apply(created)
    
    def f:((NasaRegistration) => play.api.templates.HtmlFormat.Appendable) = (created) => apply(created)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:35 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/registration/submit.scala.html
                    HASH: 0e0aced87c383fa10fa71f4c4f538069a5b5232e
                    MATRIX: 798->1|919->28|955->30|978->45|1016->46|1053->49|1068->56|1099->66
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3
                    -- GENERATED --
                */
            