
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
object accountSummary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.20*/("""
<br>"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Estimator")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""


<div class="jumbotron">
	<div class="row">

		<div class="col-lg-6">
			<h2>User: """),_display_(Seq[Any](/*11.15*/userName)),format.raw/*11.23*/("""</h2>
			<h1>Account Summary</h1>
			<table cellspacing='0'
				class="table table-striped table-bordered table-condensed"
				align="center">
				<!-- cellspacing='0' is important, must stay -->

				<!-- Table Header -->
				<thead>
					<tr>
						<th>Start Date</th>
						<th>Start Time</th>
						<th>AMI Instance</th>
						<th>Duration</th>
						<th>Cost</th>
					</tr>
				</thead>

				<tbody>

					<tr class="pure-table-odd">
						<td>04/08/2014</td>
						<td>9:34</td>
						<td>m3.large</td>
						<td>36 hours 5 minute</td>
						<td>$36</td>
					</tr>
					<tr class="pure-table-odd">
						<td>04/12/2014</td>
						<td>16:26</td>
						<td>m3.medium</td>
						<td>24 hours 17 minute</td>
						<td>$24</td>
					</tr>
					<tr class="pure-table-odd">
						<td>04/15/2014</td>
						<td>13:24</td>
						<td>m3.large</td>
						<td>10 hours 23 minute</td>
						<td>$11</td>
					</tr>
					<tr class="pure-table-odd">
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>Total: $89</td>
					</tr>
					<tr class="pure-table-odd">
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>Budget left: $111</td>
					</tr>
				</tbody>
			</table>
		<button>New Task</button>
		</div>
		
	<div class="col-lg-6" style = "padding-top: 2cm; padding-left: 2cm">
		<img src="/assets/images/NASA_logo.png">
	</div>
	</div>

</div>


""")))})),format.raw/*79.2*/("""
"""))}
    }
    
    def render(userName:String): play.api.templates.HtmlFormat.Appendable = apply(userName)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (userName) => apply(userName)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 18:36:21 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/climate/accountSummary.scala.html
                    HASH: 04d5eef4a8c7eac8808696f1ca39951bbd14086f
                    MATRIX: 791->1|919->19|950->41|986->43|1011->60|1050->62|1172->148|1202->156|2623->1546
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|39->11|39->11|107->79
                    -- GENERATED --
                */
            