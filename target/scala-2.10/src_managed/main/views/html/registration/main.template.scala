
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

		"""),_display_(Seq[Any](/*44.4*/content)),format.raw/*44.11*/("""

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
                    DATE: Sat Oct 18 18:36:22 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/registration/main.scala.html
                    HASH: 251f585c46a35d0321eaf3c13168ae58c434c31f
                    MATRIX: 796->1|950->61|1027->104|1053->109|1277->298|1292->304|1353->343|1422->377|1437->383|1505->429|1574->463|1589->469|1647->505|1731->554|1746->560|1802->594|1891->648|1906->654|1960->686|2015->705|2030->711|2100->759|2174->797|2189->803|2256->848|2342->898|2357->904|2421->946|2508->997|2523->1003|2596->1054|2644->1067|2677->1078|2731->1097|2761->1105|2828->1137|2857->1144
                    LINES: 26->1|29->1|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|50->22|50->22|50->22|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|62->34|62->34|62->34|63->35|63->35|67->39|67->39|72->44|72->44
                    -- GENERATED --
                */
            