
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="utf-8">
    <title>Modern Web Template</title>
    <!-- Latest compiled and minified Bootstrap CSS -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
    <link rel="stylesheet" media='screen' href='"""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/main.css"))),format.raw/*9.90*/("""'>
</head>
<body>
<div class="container-fluid col-md-10 col-md-offset-1">
    <!-- Fixed navbar -->
    <header>
        <div class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#/">Modern Web Template</a>
            </div>
        </div>
    </header>

    <div ng-view></div>

    <div>
        <footer>
            <hr/>
            <div>
                <span>&copy; YourProjectName.com 2014</span>
                <span class="pull-right">version : <span app-version></span></span>
            </div>
        </footer>
    </div>
</div>
</body>

<script src='//ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular.js' type="text/javascript"></script>
<script src='//ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular-route.js' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*44.15*/routes/*44.21*/.Assets.at("javascripts/vendor/ui-bootstrap-tpls-0.10.0.js"))),format.raw/*44.81*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*46.15*/routes/*46.21*/.Assets.at("javascripts/main.js"))),format.raw/*46.54*/("""' type="text/javascript"></script>

<!-- Coffee script compilled resources-->
<script src='"""),_display_(Seq[Any](/*49.15*/routes/*49.21*/.Assets.at("javascripts/app.js"))),format.raw/*49.53*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*50.15*/routes/*50.21*/.Assets.at("javascripts/common/Config.js"))),format.raw/*50.63*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*51.15*/routes/*51.21*/.Assets.at("javascripts/directives/AppVersion.js"))),format.raw/*51.71*/("""' type="text/javascript"></script>

<script src='"""),_display_(Seq[Any](/*53.15*/routes/*53.21*/.Assets.at("javascripts/users/UserService.js"))),format.raw/*53.67*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*54.15*/routes/*54.21*/.Assets.at("javascripts/users/UserCtrl.js"))),format.raw/*54.64*/("""' type="text/javascript"></script>
<script src='"""),_display_(Seq[Any](/*55.15*/routes/*55.21*/.Assets.at("javascripts/users/CreateUserCtrl.js"))),format.raw/*55.70*/("""' type="text/javascript"></script>

</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 21:23:12 EDT 2014
                    SOURCE: /Users/zhaokunli/modern-web-template/app/views/index.scala.html
                    HASH: b08be2bd101f2ae87158ee87140f4acb56c0c2fd
                    MATRIX: 637->0|1102->430|1116->436|1171->470|2454->1717|2469->1723|2551->1783|2637->1833|2652->1839|2707->1872|2835->1964|2850->1970|2904->2002|2989->2051|3004->2057|3068->2099|3153->2148|3168->2154|3240->2204|3326->2254|3341->2260|3409->2306|3494->2355|3509->2361|3574->2404|3659->2453|3674->2459|3745->2508
                    LINES: 22->1|30->9|30->9|30->9|65->44|65->44|65->44|67->46|67->46|67->46|70->49|70->49|70->49|71->50|71->50|71->50|72->51|72->51|72->51|74->53|74->53|74->53|75->54|75->54|75->54|76->55|76->55|76->55
                    -- GENERATED --
                */
            