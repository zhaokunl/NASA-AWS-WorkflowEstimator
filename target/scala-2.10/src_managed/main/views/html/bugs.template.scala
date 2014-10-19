
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
object bugs extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[LinkedList[BugReport],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(bugReports: LinkedList[BugReport]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.37*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("Bug Reports")/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
    
    """),_display_(Seq[Any](/*8.6*/flash_message())),format.raw/*8.21*/("""
        
    <h1> Bug Reports(s)</h1>
		<table class="table table-striped table-bordered ">
			<thead ">
			<tr>
	    	  <td>Solved</td>
	    	  <td>Report Title</td>
	    	  <td>Reporter Name</td>
	    	  <td>Reporter's email</td>
	    	  <td>Reporter's organization</td>
	    	  <td>Bug content</td>
	    	  <td>Operation</td>
	        </tr>
			</thead>
			
			<tbody>
            <tr>
               """),_display_(Seq[Any](/*26.17*/for(bugReport <- bugReports) yield /*26.45*/ {_display_(Seq[Any](format.raw/*26.47*/("""
                    <tr>
                    	<td>
                    		"""),_display_(Seq[Any](/*29.24*/{if(bugReport.getSolved()==1){"Yes"}
                    			else{"No"}
                    		})),format.raw/*31.24*/("""
                    			
                    	</td>
                        <td>
                            """),_display_(Seq[Any](/*35.30*/bugReport/*35.39*/.getTitle())),format.raw/*35.50*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*38.30*/bugReport/*38.39*/.getName())),format.raw/*38.49*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*41.30*/bugReport/*41.39*/.getEmail())),format.raw/*41.50*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*44.30*/bugReport/*44.39*/.getOrganization())),format.raw/*44.57*/("""
                        </td>
                        <td> 
                            """),_display_(Seq[Any](/*47.30*/bugReport/*47.39*/.getDescription())),format.raw/*47.56*/("""
                        </td>
                        
                        
                        <td>
                        <div class="input-group input-group-sm">
                        <span>
						"""),_display_(Seq[Any](/*54.8*/form(routes.BugReportController.solveReport())/*54.54*/{_display_(Seq[Any](format.raw/*54.55*/("""
               		 		<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*55.66*/bugReport/*55.75*/.getId())),format.raw/*55.83*/("""">
        					<input type="submit"  class="btn btn-success" value="Solve" onclick="return confirm('Are you sure you want to solve this issue?')">
        				""")))})),format.raw/*57.14*/("""	
        				</span>
                        <span>
						"""),_display_(Seq[Any](/*60.8*/form(routes.BugReportController.deleteReport())/*60.55*/{_display_(Seq[Any](format.raw/*60.56*/("""
               		 		<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*61.66*/bugReport/*61.75*/.getId())),format.raw/*61.83*/("""">
        					<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this issue?')">
        				""")))})),format.raw/*63.14*/("""	
        				</span>
        				</div>
           				
						
						</td>
                    </tr>
                """)))})),format.raw/*70.18*/("""
            </tr>
            </tbody>

    </table>
    
""")))})))}
    }
    
    def render(bugReports:LinkedList[BugReport]): play.api.templates.HtmlFormat.Appendable = apply(bugReports)
    
    def f:((LinkedList[BugReport]) => play.api.templates.HtmlFormat.Appendable) = (bugReports) => apply(bugReports)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:31 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/bugs.scala.html
                    HASH: c90c24c4197cb333e0d3582f38d8d6dd25d1fb39
                    MATRIX: 788->2|933->37|961->56|997->58|1024->77|1063->79|1108->90|1144->105|1585->510|1629->538|1669->540|1780->615|1896->709|2042->819|2060->828|2093->839|2219->929|2237->938|2269->948|2395->1038|2413->1047|2446->1058|2572->1148|2590->1157|2630->1175|2756->1265|2774->1274|2813->1291|3061->1504|3116->1550|3155->1551|3257->1617|3275->1626|3305->1634|3498->1795|3593->1855|3649->1902|3688->1903|3790->1969|3808->1978|3838->1986|4032->2148|4183->2267
                    LINES: 26->2|30->2|32->5|33->6|33->6|33->6|35->8|35->8|53->26|53->26|53->26|56->29|58->31|62->35|62->35|62->35|65->38|65->38|65->38|68->41|68->41|68->41|71->44|71->44|71->44|74->47|74->47|74->47|81->54|81->54|81->54|82->55|82->55|82->55|84->57|87->60|87->60|87->60|88->61|88->61|88->61|90->63|97->70
                    -- GENERATED --
                */
            