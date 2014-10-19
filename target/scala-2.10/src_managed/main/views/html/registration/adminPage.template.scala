
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
object adminPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.NasaRegistration],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[models.NasaRegistration]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Admin Page")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""





<body>
	
	
	<div class="container">
	<div class="container">
	<legend>Current Usage Summary</legend>
	<h1>"""),_display_(Seq[Any](/*17.7*/users/*17.12*/.size())),format.raw/*17.19*/(""" Active Users</h1>
	<div><p><img alt="workflow summary" src='"""),_display_(Seq[Any](/*18.44*/routes/*18.50*/.Assets.at("images/UsageSummart.png"))),format.raw/*18.87*/("""'  height="250" width="250" align="left">
	<h4> - 86 Slots available</h4><br></br>
	<h4> - $14560 budget available</h4><br></br>
	<h4>- 57% of 200 slots have been used</h4><br></br></p>
	</div>
	
	<legend>Current Usage Details</legend>
<table cellspacing='0' class="table table-striped table-bordered table-condensed" align="center">
                    <!-- cellspacing='0' is important, must stay -->

                    <!-- Table Header -->
                    <thead>
                        <tr>
                            <th>User Name</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Organization</th>
                            <th>Occupation</th>
                            <th>Highest Education</th>
                            <th>Email</th>
                            <th>Register Date</th>
                            <th>Goal</th>
                            <th>Usage</th>
                            <th>Action</th>
                            
                        </tr>
                    </thead>

                    <tbody>
                        <br></br>
                        
                        """),_display_(Seq[Any](/*49.26*/for(user <- users) yield /*49.44*/ {_display_(Seq[Any](format.raw/*49.46*/("""
						<tr>
						<td>"""),_display_(Seq[Any](/*51.12*/user/*51.16*/.getUserNameField)),format.raw/*51.33*/("""</td>
						<td>"""),_display_(Seq[Any](/*52.12*/user/*52.16*/.getfNameField())),format.raw/*52.32*/("""</td>
						<td>Last Name</td>
						<td>Organization</td>
						<td>Occupation</td>
						<td>Occupation</td>
						<td>"""),_display_(Seq[Any](/*57.12*/user/*57.16*/.getEmail())),format.raw/*57.27*/("""</td>
						<td>Registration Date</td>
						<td>"""),_display_(Seq[Any](/*59.12*/user/*59.16*/.getGoal())),format.raw/*59.26*/("""</td>
						<td>Usage</td>
						<td>
                            <button type="button" class="btn" onclick="" method="POST" action = "">Cease</button>
                            </td>
						</tr>
						""")))})),format.raw/*65.8*/("""
                        
                        <tr>
                            <td>
                                02
                            </td>
                            <td>
                                Jane
                            </td>
                            <td>
                                Green
                            </td>
                            <td>
                                CMU
                            </td>
                            <td>
                              Faculty
                            </td>
                            <td>
                            Master
                            </td>
                            <td>
                            jane.gmail.com
                            </td>
                            <td>
                            04/09/2014
                            </td>
                            <td>
                            landscape data research
                            </td>
                            <td>
                            100% of $200
                            </td>
                            <td>
                            <button type="button" class="btn" onclick="" method="get">Fund</button>
                            </td>
                            
                        </tr>


                    </tbody>

                </table>
	
	</div>
	
	
			
	
	
</body>
""")))})),format.raw/*116.2*/("""
"""))}
    }
    
    def render(users:List[models.NasaRegistration]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[models.NasaRegistration]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/registration/adminPage.scala.html
                    HASH: 5c22bb374b5cab20896e678b1ae1e30518d94afb
                    MATRIX: 814->1|996->39|1023->91|1059->93|1085->111|1124->113|1272->226|1286->231|1315->238|1413->300|1428->306|1487->343|2745->1565|2779->1583|2819->1585|2878->1608|2891->1612|2930->1629|2983->1646|2996->1650|3034->1666|3192->1788|3205->1792|3238->1803|3324->1853|3337->1857|3369->1867|3605->2072|5070->3505
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|46->17|46->17|46->17|47->18|47->18|47->18|78->49|78->49|78->49|80->51|80->51|80->51|81->52|81->52|81->52|86->57|86->57|86->57|88->59|88->59|88->59|94->65|145->116
                    -- GENERATED --
                */
            