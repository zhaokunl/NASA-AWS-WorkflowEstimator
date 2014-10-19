
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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Dashboard,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(dashboard: Dashboard, currentTime: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*2.45*/(""" 
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Dashboard")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

<link rel="stylesheet" href='"""),_display_(Seq[Any](/*7.31*/routes/*7.37*/.Assets.at("stylesheets/jquery.jqplot.min.css"))),format.raw/*7.84*/("""'>

<script src='"""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("javascripts/jquery.jqplot.min.js"))),format.raw/*9.67*/("""'
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Assets.at("javascripts/jqplot.pieRenderer.min.js"))),format.raw/*11.72*/("""'
	type="text/javascript"></script>
	
<script class="code" type="text/javascript">
      $(document).ready(
        function()"""),format.raw/*16.19*/("""{"""),format.raw/*16.20*/("""
          active = parseInt($("#activeCount").attr("value"));
          inactive = parseInt($("#totalCount").attr("value")) - active;
          var data = [ ['Active', active],['Inactive', inactive] ];
          var plot1 = jQuery.jqplot ('healthchart', [data], 
            """),format.raw/*21.13*/("""{"""),format.raw/*21.14*/(""" 
              seriesDefaults: """),format.raw/*22.31*/("""{"""),format.raw/*22.32*/("""                
                seriesColors: [ "#dff0d8", "#f2dede", "#fcf8e3", "#4bb2c5", "#c5b47f", "#EAA228"],                
                renderer: jQuery.jqplot.PieRenderer, 
                rendererOptions: """),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""                  
                  showDataLabels: true
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/("""
              """),format.raw/*28.15*/("""}"""),format.raw/*28.16*/(""", 
              legend: """),format.raw/*29.23*/("""{"""),format.raw/*29.24*/(""" show:true, location: 'e' """),format.raw/*29.50*/("""}"""),format.raw/*29.51*/("""
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/("""
          );
      """),format.raw/*32.7*/("""}"""),format.raw/*32.8*/(""");
</script>
	
	"""),_display_(Seq[Any](/*35.3*/flash_message())),format.raw/*35.18*/("""
	<input id="activeCount" type="hidden" value=""""),_display_(Seq[Any](/*36.48*/dashboard/*36.57*/.getActiveCount())),format.raw/*36.74*/("""" />
	<input id="totalCount" type="hidden" value=""""),_display_(Seq[Any](/*37.47*/dashboard/*37.56*/.getTotalCount())),format.raw/*37.72*/("""" />
	<div class="row">
		<h2>Last Check time : """),_display_(Seq[Any](/*39.26*/currentTime)),format.raw/*39.37*/("""</h2>
	</div>
	
	<div class="row">
		<h2>Device status</h2>
		<p>You may observe the status of the devices in this table. Active devices 
		  are in green rows while inactive devices are shown in red. An inactive device is one that 
		  has not posted a sensor reading in the last 60 seconds.</p>
	</div>
	<div class="row">
		<h3>Statistics</h3>
		<p>Active devices: """),_display_(Seq[Any](/*50.23*/dashboard/*50.32*/.getActiveCount())),format.raw/*50.49*/("""</p>
		<p>Total devices: """),_display_(Seq[Any](/*51.22*/dashboard/*51.31*/.getTotalCount())),format.raw/*51.47*/("""</p>		
        <div id="healthchart" style="height:300px; width:500px;"></div>
    </div>
          
	<div class="row">
		
		<table class="table table-bordered table-condensed">
			<thead>
				<tr>
					<th>Device Uri</th>
					<th>Device Type</th>
					<th>Location</th>
					<th>Status</th>
				</tr>
			</thead>
		
			<tbody>
			

				"""),_display_(Seq[Any](/*70.6*/for(boardItem <- dashboard.getItems()) yield /*70.44*/ {_display_(Seq[Any](format.raw/*70.46*/("""
					<style>
						.active """),format.raw/*72.15*/("""{"""),format.raw/*72.16*/("""
							color: green;
							font: bold;
						"""),format.raw/*75.7*/("""}"""),format.raw/*75.8*/("""
						.inactive """),format.raw/*76.17*/("""{"""),format.raw/*76.18*/("""
							color: #f2dede;
							font: italic;
						"""),format.raw/*79.7*/("""}"""),format.raw/*79.8*/("""
						.inactiveLine"""),format.raw/*80.20*/("""{"""),format.raw/*80.21*/("""
							background-color: #fcf8e3;
						"""),format.raw/*82.7*/("""}"""),format.raw/*82.8*/("""
						.activeLine"""),format.raw/*83.18*/("""{"""),format.raw/*83.19*/("""
							background-color: #dff0d8;
						"""),format.raw/*85.7*/("""}"""),format.raw/*85.8*/("""
					</style>
					"""),_display_(Seq[Any](/*87.7*/defining(boardItem.getStatus() == 1)/*87.43*/{ isActive =>_display_(Seq[Any](format.raw/*87.56*/("""	
					"""),_display_(Seq[Any](/*88.7*/if(isActive)/*88.19*/{_display_(Seq[Any](format.raw/*88.20*/("""
						<tr class='activeLine'>
					""")))}/*90.7*/else/*90.11*/{_display_(Seq[Any](format.raw/*90.12*/("""
						<tr class='inactiveLine'>
					""")))})),format.raw/*92.7*/("""
						<td>"""),_display_(Seq[Any](/*93.12*/boardItem/*93.21*/.getDevice().getDeviceUri())),format.raw/*93.48*/("""</td>
						<td>"""),_display_(Seq[Any](/*94.12*/boardItem/*94.21*/.getDevice().getDeviceTypeName())),format.raw/*94.53*/("""</td>
						
						<td>Longitude: """),_display_(Seq[Any](/*96.23*/boardItem/*96.32*/.getDevice().getLongitude())),format.raw/*96.59*/(""", Latitude: """),_display_(Seq[Any](/*96.72*/boardItem/*96.81*/.getDevice().getLatitude())),format.raw/*96.107*/(""", Altitude: """),_display_(Seq[Any](/*96.120*/boardItem/*96.129*/.getDevice().getAltitude())),format.raw/*96.155*/("""</td>
						
						<td>
							"""),_display_(Seq[Any](/*99.9*/if(isActive)/*99.21*/{_display_(Seq[Any](format.raw/*99.22*/("""
								<span class="active">Active</span>
							""")))}/*101.9*/else/*101.13*/{_display_(Seq[Any](format.raw/*101.14*/("""
								<span class="inactive">Inactive</span>
							""")))})),format.raw/*103.9*/("""
						</td>
						</tr>
					""")))})),format.raw/*106.7*/("""				
				""")))})),format.raw/*107.6*/("""
			
			</tbody>				
		</table>
	</div>
""")))})),format.raw/*112.2*/("""
"""))}
    }
    
    def render(dashboard:Dashboard,currentTime:String): play.api.templates.HtmlFormat.Appendable = apply(dashboard,currentTime)
    
    def f:((Dashboard,String) => play.api.templates.HtmlFormat.Appendable) = (dashboard,currentTime) => apply(dashboard,currentTime)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:32 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/dashboard.scala.html
                    HASH: 625b7ef902683050054ab78c5b3da849da894344
                    MATRIX: 788->2|942->45|970->65|1006->67|1031->84|1070->86|1137->118|1151->124|1219->171|1272->189|1286->195|1353->241|1439->291|1454->297|1527->348|1681->474|1710->475|2014->751|2043->752|2103->784|2132->785|2379->1004|2408->1005|2510->1079|2539->1080|2582->1095|2611->1096|2664->1121|2693->1122|2747->1148|2776->1149|2817->1162|2846->1163|2893->1183|2921->1184|2973->1201|3010->1216|3094->1264|3112->1273|3151->1290|3238->1341|3256->1350|3294->1366|3379->1415|3412->1426|3816->1794|3834->1803|3873->1820|3935->1846|3953->1855|3991->1871|4365->2210|4419->2248|4459->2250|4515->2278|4544->2279|4618->2326|4646->2327|4691->2344|4720->2345|4798->2396|4826->2397|4874->2417|4903->2418|4971->2459|4999->2460|5045->2478|5074->2479|5142->2520|5170->2521|5226->2542|5271->2578|5322->2591|5365->2599|5386->2611|5425->2612|5480->2649|5493->2653|5532->2654|5602->2693|5650->2705|5668->2714|5717->2741|5770->2758|5788->2767|5842->2799|5913->2834|5931->2843|5980->2870|6029->2883|6047->2892|6096->2918|6146->2931|6165->2940|6214->2966|6281->2998|6302->3010|6341->3011|6412->3063|6426->3067|6466->3068|6554->3124|6617->3155|6659->3165|6732->3206
                    LINES: 26->2|30->2|31->4|32->5|32->5|32->5|34->7|34->7|34->7|36->9|36->9|36->9|38->11|38->11|38->11|43->16|43->16|48->21|48->21|49->22|49->22|52->25|52->25|54->27|54->27|55->28|55->28|56->29|56->29|56->29|56->29|57->30|57->30|59->32|59->32|62->35|62->35|63->36|63->36|63->36|64->37|64->37|64->37|66->39|66->39|77->50|77->50|77->50|78->51|78->51|78->51|97->70|97->70|97->70|99->72|99->72|102->75|102->75|103->76|103->76|106->79|106->79|107->80|107->80|109->82|109->82|110->83|110->83|112->85|112->85|114->87|114->87|114->87|115->88|115->88|115->88|117->90|117->90|117->90|119->92|120->93|120->93|120->93|121->94|121->94|121->94|123->96|123->96|123->96|123->96|123->96|123->96|123->96|123->96|123->96|126->99|126->99|126->99|128->101|128->101|128->101|130->103|133->106|134->107|139->112
                    -- GENERATED --
                */
            