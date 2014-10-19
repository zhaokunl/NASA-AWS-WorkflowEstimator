
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Carnegie Mellon University Sensor Data Storage")/*4.56*/{_display_(Seq[Any](format.raw/*4.57*/("""

	<div class="jumbotron">
		<div class="row">
			<div class="col-lg-6">

				<img src='"""),_display_(Seq[Any](/*10.16*/routes/*10.22*/.Assets.at("images/fireimp_small.jpg"))),format.raw/*10.60*/("""' style="padding-bottom: 0;">

			</div>
			<div class="col-lg-6">
				<h1>Internet of Things Data Service Platform</h1>
				<p>A federated cloud platform for mobile data-centric service
					development and sharing.</p>
				<p>
					<a class="btn btn-lg btn-default"
						href="https://drive.google.com/file/d/0B9nWqnYxEA3HSEo3Zkx2QWJEVlE/edit?usp=sharing">Getting Started &raquo;</a>
				</p>
			</div>
		</div>
	</div>

	<!-- Content -->
	<div class="row">
		<div class="col-lg-4">
			<h2>Tutorial</h2>
			<p>
			Here is a simple guide on <a 
				href="https://drive.google.com/file/d/0B0uwbnoOCGhEWGVuZjMtcDljcFE/edit?usp=sharing"
				>how to use the platform</a>.
			</p>
		</div>
		<div class="col-lg-4">
			<h2>Visualization</h2>
			<p>
				A <a href="http://sensorserviceplatform.github.io/Visualization/">visualization</a> of the sensor network.
			</p>
		</div>
		<div class="col-lg-4">
			<h2>Virtual Sensor</h2>
			<p>
				A <a href="http://sensorserviceplatform.github.io/VirtualSensorEditor/">virtual sensor</a> tour.
			</p>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-4">
			<h2>Open Source</h2>
			<p>
				All the code is currently hosted on Github. Feel free to contribute
				to this <a href="https://github.com/cmusv-sc">community</a>.
			</p>
		</div>
		<div class="col-lg-4">
			<h2>To Dos</h2>
			<p>
				Check the open <a
					href="https://github.com/cmusv-sc/ArchF2013-Project3-FT/issues?page=1&state=open">issues</a>
				on Github.
			</p>
		</div>
		<div class="col-lg-4">
			<h2>More information</h2>
			<p>
				For more information about this project, and a good general
				overview, see the <a
					href="https://docs.google.com/open?id=0B6VEjpK6RPgVN2Q1aDhRRjJid0U">slide
					deck</a> covering relevant features.
			</p>
		</div>
	</div>
""")))})),format.raw/*74.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:33 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/index.scala.html
                    HASH: 874a2a17ddcc601b66fcfafa305781e4f1d4f421
                    MATRIX: 872->19|908->21|970->75|1008->76|1133->165|1148->171|1208->209|3026->1996
                    LINES: 30->3|31->4|31->4|31->4|37->10|37->10|37->10|101->74
                    -- GENERATED --
                */
            