
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.62*/(""" 


<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(Seq[Any](/*9.9*/title)),format.raw/*9.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*15.9*/routes/*15.15*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*15.54*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*17.9*/routes/*17.15*/.Assets.at("stylesheets/navbar-fixed-top.css"))),format.raw/*17.61*/("""'>
<link rel="stylesheet"
	href='"""),_display_(Seq[Any](/*19.9*/routes/*19.15*/.Assets.at("stylesheets/custom.css"))),format.raw/*19.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(Seq[Any](/*21.9*/routes/*21.15*/.Assets.at("stylesheets/main.css"))),format.raw/*21.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(Seq[Any](/*23.9*/routes/*23.15*/.Assets.at("images/favicon.png"))),format.raw/*23.47*/("""'>



<link
	href='"""),_display_(Seq[Any](/*28.9*/routes/*28.15*/.Assets.at("stylesheets/bootstrap-editable.css"))),format.raw/*28.63*/("""'
	rel="stylesheet" />
<!--[if (!IE)|(gte IE 8)]><!-->
  <link href='"""),_display_(Seq[Any](/*31.16*/routes/*31.22*/.Assets.at("stylesheets/visualsearch-datauri.css"))),format.raw/*31.72*/("""' media="screen" rel="stylesheet" type="text/css" />
<!--<![endif]-->
<!--[if lte IE 7]><!-->
  <link href='"""),_display_(Seq[Any](/*34.16*/routes/*34.22*/.Assets.at("stylesheets/visualsearch.css"))),format.raw/*34.64*/("""' media="screen" rel="stylesheet" type="text/css" />
<!--<![endif]-->

<script src='"""),_display_(Seq[Any](/*37.15*/routes/*37.21*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*37.66*/("""'
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*39.15*/routes/*39.21*/.Assets.at("javascripts/jquery-ui-1.10.4.min.js"))),format.raw/*39.70*/("""'
	type="text/javascript"></script>
	
<script src='"""),_display_(Seq[Any](/*42.15*/routes/*42.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*42.63*/("""'
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*44.15*/routes/*44.21*/.Assets.at("javascripts/bootstrap-editable.min.js"))),format.raw/*44.72*/("""' 
	type="text/javascript"></script>
	
<script src='"""),_display_(Seq[Any](/*47.15*/routes/*47.21*/.Assets.at("javascripts/underscore-1.5.2.js"))),format.raw/*47.66*/("""' 
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*49.15*/routes/*49.21*/.Assets.at("javascripts/backbone-1.1.0.js"))),format.raw/*49.64*/("""' 
	type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*51.15*/routes/*51.21*/.Assets.at("javascripts/visualsearch.js"))),format.raw/*51.62*/("""' 
	type="text/javascript"></script>
"""),_display_(Seq[Any](/*53.2*/moreScripts)),format.raw/*53.13*/("""
</head>

<body>
	"""),_display_(Seq[Any](/*57.3*/header())),format.raw/*57.11*/("""
	<div class="container">

		"""),_display_(Seq[Any](/*60.4*/content)),format.raw/*60.11*/("""

		<!-- Footer -->
		<div class="footer">
			<div class="row">
				<div class="col-md-4">
					<div class="row">
						<p class="text-muted" style="text-align: left;"https://github.com/sdscmusv">
							<img src='"""),_display_(Seq[Any](/*68.19*/routes/*68.25*/.Assets.at("images/github.png"))),format.raw/*68.56*/("""'
								style="width: 32px;"></a> Follow and contribute to this
							project on <a href="https://github.com/cmusv-sc/ArchF2013-Project3-FT">Github</a>
						</p>
					</div>
					<div class="row">
						<p class="text-muted" style="text-align: left;""""),_display_(Seq[Any](/*74.55*/routes/*74.61*/.BugReportController.reports())),format.raw/*74.91*/("""">
							<img src='"""),_display_(Seq[Any](/*75.19*/routes/*75.25*/.Assets.at("images/bug.png"))),format.raw/*75.53*/("""'
								style="width: 32px;"></a> Any issues? Please report bugs <a
								href=""""),_display_(Seq[Any](/*77.16*/routes/*77.22*/.BugReportController.reports())),format.raw/*77.52*/("""">here</a>
						</p>
					</div>
				</div>
				<div class="col-lg-4 col-lg-offset-4">
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
                    DATE: Sat Oct 18 20:55:33 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/main.scala.html
                    HASH: 553087c4a23f1c30ac50aeb52243d1f28a4d7158
                    MATRIX: 783->1|937->61|1015->105|1041->110|1265->299|1280->305|1341->344|1410->378|1425->384|1493->430|1562->464|1577->470|1635->506|1719->555|1734->561|1790->595|1879->649|1894->655|1948->687|2003->707|2018->713|2088->761|2194->831|2209->837|2281->887|2426->996|2441->1002|2505->1044|2626->1129|2641->1135|2708->1180|2794->1230|2809->1236|2880->1285|2968->1337|2983->1343|3047->1385|3133->1435|3148->1441|3221->1492|3310->1545|3325->1551|3392->1596|3479->1647|3494->1653|3559->1696|3646->1747|3661->1753|3724->1794|3797->1832|3830->1843|3884->1862|3914->1870|3979->1900|4008->1907|4259->2122|4274->2128|4327->2159|4618->2414|4633->2420|4685->2450|4742->2471|4757->2477|4807->2505|4928->2590|4943->2596|4995->2626
                    LINES: 26->1|29->1|37->9|37->9|43->15|43->15|43->15|45->17|45->17|45->17|47->19|47->19|47->19|49->21|49->21|49->21|51->23|51->23|51->23|56->28|56->28|56->28|59->31|59->31|59->31|62->34|62->34|62->34|65->37|65->37|65->37|67->39|67->39|67->39|70->42|70->42|70->42|72->44|72->44|72->44|75->47|75->47|75->47|77->49|77->49|77->49|79->51|79->51|79->51|81->53|81->53|85->57|85->57|88->60|88->60|96->68|96->68|96->68|102->74|102->74|102->74|103->75|103->75|103->75|105->77|105->77|105->77
                    -- GENERATED --
                */
            