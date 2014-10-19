
package views.html.estimator

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

					
					<li class="dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown">Account Management<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href=""""),_display_(Seq[Any](/*23.22*/routes/*23.28*/.NasaRegistrationController.updateForm())),format.raw/*23.68*/("""">Update User Details</a></li>
							<li><a href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.NasaRegistrationController.deleteForm())),format.raw/*24.68*/("""">Delete User</a></li>
							<li><a href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.EstimateController.accountSummary(session.get("username")))),format.raw/*25.87*/("""">Account Summary</a></li>
						</ul>
						</li>

										<li><a>About Us</a></li>

					
						
					"""),_display_(Seq[Any](/*33.7*/if(!session.get("username"))/*33.35*/{_display_(Seq[Any](format.raw/*33.36*/("""
					
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*35.55*/routes/*35.61*/.EstimateController.login())),format.raw/*35.88*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*38.7*/else/*38.11*/{_display_(Seq[Any](format.raw/*38.12*/("""
						<li><a href="/estimator/tutorial">Estimator</a></li>
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*40.55*/routes/*40.61*/.EstimateController.logout())),format.raw/*40.89*/("""">
							<button type="submit" class="btn btn-success">Log out</button>
						</form>
					""")))})),format.raw/*43.7*/("""	
					
					"""),_display_(Seq[Any](/*45.7*/if(session.get("username") && session.get("username").equals("admin"))/*45.77*/{_display_(Seq[Any](format.raw/*45.78*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*46.55*/routes/*46.61*/.NasaRegistrationController.adminPage())),format.raw/*46.100*/("""">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))})),format.raw/*49.7*/("""						
					
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
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/estimator/header.scala.html
                    HASH: 3ea5c94c519bcd8ebae0adedf68d1bb074fe5e90
                    MATRIX: 778->2|873->4|1398->493|1413->499|1464->528|1845->873|1860->879|1922->919|2010->971|2025->977|2087->1017|2167->1061|2182->1067|2263->1126|2405->1233|2442->1261|2481->1262|2578->1323|2593->1329|2642->1356|2752->1448|2765->1452|2804->1453|2954->1567|2969->1573|3019->1601|3143->1694|3192->1708|3271->1778|3310->1779|3401->1834|3416->1840|3478->1879|3608->1978
                    LINES: 26->2|29->2|40->13|40->13|40->13|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|60->33|60->33|60->33|62->35|62->35|62->35|65->38|65->38|65->38|67->40|67->40|67->40|70->43|72->45|72->45|72->45|73->46|73->46|73->46|76->49
                    -- GENERATED --
                */
            