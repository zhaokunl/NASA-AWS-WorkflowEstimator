
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
object estimate2 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Estimator")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""

<ol class="breadcrumb">
	<li><a href="/estimator/tutorial">Tutorial</a></li>
	<li><a href="/estimator">Collect Data</a></li>
	<li><a href="/estimator/1">Input preference</a></li>
	<li class="active">Workflow Summary</li>
	<li><a href="/estimator/3">Recommendation</a></li>
</ol>

<form method="GET" role="form" action="/estimator/3">

<fieldset>
	<div class="container">
	<p>Here is the workflow summary</p>
	<img alt="workflow summary" src='"""),_display_(Seq[Any](/*19.36*/routes/*19.42*/.Assets.at("images/workflow_1.png"))),format.raw/*19.77*/("""'  height="500" width="700">
	<img alt="workflow summary" src='"""),_display_(Seq[Any](/*20.36*/routes/*20.42*/.Assets.at("images/workflow_2.png"))),format.raw/*20.77*/("""' height="500" width="700">
	</div>
	
</fieldset>	
	<br></br>
	<div class="actions">
		<input type="submit" class="btn btn-primary" value="See Recommendation" action="/estimator/3" style="position: relative; left: 15px">
	</div>
    
</form>           
		
	
	""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/estimator/estimate2.scala.html
                    HASH: 40df6b8695ed91e2799791f8722bafa10070aadd
                    MATRIX: 885->18|921->20|946->37|985->39|1466->484|1481->490|1538->525|1638->589|1653->595|1710->630
                    LINES: 30->3|31->4|31->4|31->4|46->19|46->19|46->19|47->20|47->20|47->20
                    -- GENERATED --
                */
            