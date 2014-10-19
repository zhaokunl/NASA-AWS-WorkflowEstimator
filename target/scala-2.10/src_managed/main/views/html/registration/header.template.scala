
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

					"""),_display_(Seq[Any](/*31.7*/if(!session.get("username"))/*31.35*/{_display_(Seq[Any](format.raw/*31.36*/("""
					
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*33.55*/routes/*33.61*/.EstimateController.login())),format.raw/*33.88*/("""">
							<button type="submit" class="btn btn-success">Log in</button>
						</form>
					""")))}/*36.7*/else/*36.11*/{_display_(Seq[Any](format.raw/*36.12*/("""
						<li><a href="/estimator/tutorial">Estimator</a></li>
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*38.55*/routes/*38.61*/.EstimateController.logout())),format.raw/*38.89*/("""">
							<button type="submit" class="btn btn-success">Log out</button>
						</form>
					""")))})),format.raw/*41.7*/("""
					
					"""),_display_(Seq[Any](/*43.7*/if(session.get("username") && session.get("username").equals("admin"))/*43.77*/{_display_(Seq[Any](format.raw/*43.78*/("""
						<form class="navbar-form navbar-right" action=""""),_display_(Seq[Any](/*44.55*/routes/*44.61*/.NasaRegistrationController.adminPage())),format.raw/*44.100*/("""">
							<button type="submit" class="btn btn-success">Admin Console</button>
						</form>
					""")))})),format.raw/*47.7*/("""	
					
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
                    DATE: Sat Oct 18 20:55:35 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/registration/header.scala.html
                    HASH: ef27b6a4f8c8ef3565d6685c27a4e383520ab4b0
                    MATRIX: 781->2|876->4|1401->493|1416->499|1467->528|1848->873|1863->879|1925->919|2013->971|2028->977|2090->1017|2170->1061|2185->1067|2266->1126|2395->1220|2432->1248|2471->1249|2568->1310|2583->1316|2632->1343|2742->1435|2755->1439|2794->1440|2944->1554|2959->1560|3009->1588|3133->1681|3181->1694|3260->1764|3299->1765|3390->1820|3405->1826|3467->1865|3597->1964
                    LINES: 26->2|29->2|40->13|40->13|40->13|50->23|50->23|50->23|51->24|51->24|51->24|52->25|52->25|52->25|58->31|58->31|58->31|60->33|60->33|60->33|63->36|63->36|63->36|65->38|65->38|65->38|68->41|70->43|70->43|70->43|71->44|71->44|71->44|74->47
                    -- GENERATED --
                */
            