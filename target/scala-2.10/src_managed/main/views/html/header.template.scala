
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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.4*/("""
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" style="padding-bottom: 0;" href="/"><img
					src='"""),_display_(Seq[Any](/*13.12*/routes/*13.18*/.Assets.at("images/logo.png"))),format.raw/*13.47*/("""' style="height: 28px;"></a>
			</div>
			<div class="navbar-collapse collapse" style="height:">
				<ul class="nav navbar-nav navbar-right">

					<li><a href=""""),_display_(Seq[Any](/*18.20*/routes/*18.26*/.Application.index())),format.raw/*18.46*/("""">Home</a></li>
					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Meta Data <b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.SensorCategoryController.sensorCategories())),format.raw/*24.72*/("""">1. Sensor
									Categories</a></li>
							<li><a href=""""),_display_(Seq[Any](/*26.22*/routes/*26.28*/.SensorTypeController.sensorTypes())),format.raw/*26.63*/("""">2. Sensor
									Types</a></li>
							<li><a href=""""),_display_(Seq[Any](/*28.22*/routes/*28.28*/.DeviceTypeController.deviceTypes())),format.raw/*28.63*/("""">3. Device Types</a></li>							
							<li><a href=""""),_display_(Seq[Any](/*29.22*/routes/*29.28*/.DeviceController.devices())),format.raw/*29.55*/("""">4. Devices</a></li>
							<li><a href=""""),_display_(Seq[Any](/*30.22*/routes/*30.28*/.SensorController.sensors())),format.raw/*30.55*/("""">5. Sensors</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Sensor Data<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*36.22*/routes/*36.28*/.SensorReadingController.sensorReadings())),format.raw/*36.69*/("""">Data Export</a></li>
							
						</ul></li>
						
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Console Management<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*43.22*/routes/*43.28*/.DashboardController.dashboard())),format.raw/*43.60*/("""">Dashboard</a></li>
							<li><a href="http://sensorserviceplatform.github.io/VirtualSensorEditor/">Virtual Sensor Editor</a></li>
							<li><a href="http://sensorserviceplatform.github.io/Visualization/">Virtualization</a></li>							
						</ul></li>					
											
					<li><a href=""""),_display_(Seq[Any](/*48.20*/routes/*48.26*/.AboutusController.aboutus())),format.raw/*48.54*/("""">About Us</a></li>

					"""),_display_(Seq[Any](/*50.7*/if(!session.get("email"))/*50.32*/{_display_(Seq[Any](format.raw/*50.33*/("""
					
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*52.55*/routes/*52.61*/.Application.login())),format.raw/*52.81*/("""">
							<button type="submit" class="btn btn-success">Sign in</button>
						</form>
					""")))}/*55.7*/else/*55.11*/{_display_(Seq[Any](format.raw/*55.12*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*56.55*/routes/*56.61*/.Application.logout())),format.raw/*56.82*/("""">
							<button type="submit" class="btn btn-success">Log out</button>
						</form>
					""")))})),format.raw/*59.7*/("""
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:33 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/header.scala.html
                    HASH: a413672b82513175206b6be333d8a974b9a1c119
                    MATRIX: 768->2|863->4|1388->493|1403->499|1454->528|1652->690|1667->696|1709->716|1955->926|1970->932|2036->976|2134->1038|2149->1044|2206->1079|2299->1136|2314->1142|2371->1177|2462->1232|2477->1238|2526->1265|2605->1308|2620->1314|2669->1341|2927->1563|2942->1569|3005->1610|3285->1854|3300->1860|3354->1892|3682->2184|3697->2190|3747->2218|3809->2245|3843->2270|3882->2271|3979->2332|3994->2338|4036->2358|4147->2451|4160->2455|4199->2456|4290->2511|4305->2517|4348->2538|4472->2631
                    LINES: 26->2|29->2|40->13|40->13|40->13|45->18|45->18|45->18|51->24|51->24|51->24|53->26|53->26|53->26|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|63->36|63->36|63->36|70->43|70->43|70->43|75->48|75->48|75->48|77->50|77->50|77->50|79->52|79->52|79->52|82->55|82->55|82->55|83->56|83->56|83->56|86->59
                    -- GENERATED --
                */
            