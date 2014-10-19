
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/(""" 

<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(Seq[Any](/*8.9*/title)),format.raw/*8.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*14.9*/routes/*14.15*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*14.54*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*16.9*/routes/*16.15*/.Assets.at("stylesheets/navbar-fixed-top.css"))),format.raw/*16.61*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*18.9*/routes/*18.15*/.Assets.at("stylesheets/custom.css"))),format.raw/*18.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(Seq[Any](/*20.9*/routes/*20.15*/.Assets.at("stylesheets/main.css"))),format.raw/*20.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(Seq[Any](/*22.9*/routes/*22.15*/.Assets.at("images/favicon.png"))),format.raw/*22.47*/("""'>



<link href='"""),_display_(Seq[Any](/*26.14*/routes/*26.20*/.Assets.at("stylesheets/bootstrap-editable.css"))),format.raw/*26.68*/("""'
	rel="stylesheet" />

<script src='"""),_display_(Seq[Any](/*29.15*/routes/*29.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*29.66*/("""'
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*31.15*/routes/*31.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*31.63*/("""'
	type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*34.15*/routes/*34.21*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*34.72*/("""'></script>
"""),_display_(Seq[Any](/*35.2*/moreScripts)),format.raw/*35.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*39.3*/header())),format.raw/*39.11*/("""
	


	<div class="container">

		"""),_display_(Seq[Any](/*45.4*/content)),format.raw/*45.11*/("""

		<!-- Footer -->
		<div class="footer">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-8">
					<p class="text-muted" style="text-align: right; font-size: 14px;">&copy;
						Carnegie Mellon University. Silicon Valley. 2014</p>
				</div>
			</div>
		</div>

	</div>

</body>
</html>
"""))}
    }
    
    def render(title:String,moreScripts:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,moreScripts)(content)
    
    def f:((String,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/climate/main.scala.html
                    HASH: c500484faf4b20d20584e945a74002c61a40bed4
                    MATRIX: 791->1|945->61|1022->104|1048->109|1272->298|1287->304|1348->343|1417->377|1432->383|1500->429|1569->463|1584->469|1642->505|1726->554|1741->560|1797->594|1886->648|1901->654|1955->686|2010->705|2025->711|2095->759|2169->797|2184->803|2251->848|2337->898|2352->904|2416->946|2503->997|2518->1003|2591->1054|2639->1067|2672->1078|2726->1097|2756->1105|2825->1139|2854->1146
                    LINES: 26->1|29->1|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|62->34|62->34|62->34|63->35|63->35|67->39|67->39|73->45|73->45
                    -- GENERATED --
                */
            