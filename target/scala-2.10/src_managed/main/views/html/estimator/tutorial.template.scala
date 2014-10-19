
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
object tutorial extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Tutorial")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""

<ol class="breadcrumb">
	<li class="active">Tutorial</li>
	<li><a href="/estimator">Collect Data</a></li>
	<li><a href="/estimator/1">Input Preference</a></li>
	<li><a href="/estimator/2">Workflow Summary</a></li>
	<li><a href="/estimator/3">Recommendation</a></li>
</ol>

<iframe width="600" height="400" src="http://www.youtube.com/embed/6A_KMshTN2g?rel=0" frameborder="0" allowfullscreen></iframe>

<p>
This video shows how to connect the vistrails workflow to the Einstein Website(http://einstein.sv.cmu.edu/estimator).

<ul>
<li>Run vistrails. (python VISTRAILS_PATH/vistrails/vistrails.py)</li>
<li>Import a workflow.</li>
<li>Click the menu Packages, and then Amazon Plugin. Inside that choose the 'Go to estimator'</li>
<li>Input the notification email and click Estimate. Then you can be directed to the estimator web page.</li>
</ul>
</p>

""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/estimator/tutorial.scala.html
                    HASH: 2cfc1bd7bf2de71445999358365b2baaa6d098ac
                    MATRIX: 877->1|901->17|940->19
                    LINES: 29->1|29->1|29->1
                    -- GENERATED --
                */
            