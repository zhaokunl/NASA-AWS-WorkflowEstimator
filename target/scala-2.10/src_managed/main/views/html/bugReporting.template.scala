
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
object bugReporting extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[BugReport],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(bugReportForm: play.data.Form[BugReport]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("Bug Report")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
    
    """),_display_(Seq[Any](/*8.6*/flash_message())),format.raw/*8.21*/("""
        
    """),_display_(Seq[Any](/*10.6*/helper/*10.12*/.form(action = routes.BugReportController.newReport)/*10.64*/ {_display_(Seq[Any](format.raw/*10.66*/("""
        
        <fieldset>
            <legend>Bug Report</legend>
            
            """),_display_(Seq[Any](/*15.14*/inputText(
                bugReportForm("name"), 
                '_label -> "Your name",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*19.14*/("""
            """),_display_(Seq[Any](/*20.14*/inputText(
                bugReportForm("title"), 
                '_label -> "Bug Title",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*24.14*/("""
            """),_display_(Seq[Any](/*25.14*/inputText(
                bugReportForm("email"), 
                '_label -> "Email",
                '_helper -> "You must be a registered user to report a bug",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*30.14*/("""
            """),_display_(Seq[Any](/*31.14*/inputText(
                bugReportForm("organization"), 
                '_label -> "Organization",                 
                '_error -> bugReportForm.globalError                                
            ))),format.raw/*35.14*/("""
            """),_display_(Seq[Any](/*36.14*/textarea(
                bugReportForm("description"), 
                '_label -> "Description", 'cols -> 65, 'rows -> 7                                               
            ))),format.raw/*39.14*/("""
           
        </fieldset>
        
      
        <div class="actions">
            <input type="submit" class="btn primary" value="Submit">
            <a href=""""),_display_(Seq[Any](/*46.23*/routes/*46.29*/.Application.index)),format.raw/*46.47*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*49.6*/("""
    
""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(bugReportForm:play.data.Form[BugReport]): play.api.templates.HtmlFormat.Appendable = apply(bugReportForm)
    
    def f:((play.data.Form[BugReport]) => play.api.templates.HtmlFormat.Appendable) = (bugReportForm) => apply(bugReportForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:31 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/bugReporting.scala.html
                    HASH: a2a8551c77125252c509c04223d1c337a5fe9214
                    MATRIX: 800->1|986->43|1014->96|1050->98|1076->116|1115->118|1160->129|1196->144|1246->159|1261->165|1322->217|1362->219|1493->314|1721->520|1771->534|2000->741|2050->755|2352->1035|2402->1049|2641->1266|2691->1280|2896->1463|3102->1633|3117->1639|3157->1657|3242->1711|3280->1718
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|39->10|39->10|39->10|39->10|44->15|48->19|49->20|53->24|54->25|59->30|60->31|64->35|65->36|68->39|75->46|75->46|75->46|78->49|80->51
                    -- GENERATED --
                */
            