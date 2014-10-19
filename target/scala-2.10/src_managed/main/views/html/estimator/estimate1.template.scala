
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
object estimate1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Estimator")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

<ol class="breadcrumb">
	<li><a href="/estimator/tutorial">Tutorial</a></li>
	<li><a href="/estimator">Collect Data</a></li>
	<li class="active">Input preference</li>
	<li><a href="/estimator/2">Workflow Summary</a></li>
	<li><a href="/estimator/3">Recommendation</a></li>
</ol>

<form method="GET" role="form" action="/estimator/2">


	<fieldset>
		<legend>Tell us your preference</legend>

		<p>In general, you have two options, on-demand and batch mode.
			Under each mode, you can select CPU, memory, storage, and OS.</p>


		<div class="form-group">
			<label class="control-label" for="budget">1) Budget</label>
			<div>
				<span>$ </span><input type="text" class="input-xlarge" id="budget" placeholder="50">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label">2) Flexible start
				& end time?</label>

			<div>
				<label class="checkbox-inline"> <input type="checkbox"
					id="yes-flexible"> yes
				</label> <label class="checkbox-inline"> <input type="checkbox"
					id="no-flexible"> no
				</label>
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label">3) Estimated Usage</label>
			
			<div class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label" for="cpu"> CPU </label>
				<select id="cpu">
					<option>1</option>
					<option>2</option>
					<option>4</option>
					<option>More than 4</option>
					<option>No idea</option>
				</select>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="memory"> Memory (GiB) </label>
				<select id="cpu">
					<option>1.7</option>
					<option>3.75</option>
					<option>7.5</option>
					<option>15</option>
					<option>More than 15</option>
					<option>No idea</option>
				</select>
				
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label" for="storage"> Storage (GiB) </label>
				<select id="storage">
					<option>1*4 SSD</option>
					<option>1*32 SSD</option>
					<option>1*160</option>
					<option>1*410</option>
					<option>No idea</option>
				</select>
			</div>
			</div>
		</div>
			
		<div class="form-group">
			<label class="control-label">4) Operating System</label>
			
			<div>
				<label class="checkbox-inline"> <input type="checkbox"
					id="nix-os"> Linux/ Unix
				</label> <label class="checkbox-inline"> <input type="checkbox"
					id="windows-os"> Windows
				</label>
			</div>
		</div>

		<div class="form-group">
			<label class="control-label" for="region">5) Region</label>
			
			<div>
				<select id="region">
					<option value="US West (North California)">US West (North
						California)</option>
					<option value="US West (Oregon)">US West (Oregon)</option>
					<option value="US East (N. Virginia)">US East (N.
						Virginia)</option>
				</select>
			</div>
		</div>
	</fieldset>

	<div class="actions">
		<input type="submit" class="btn primary" value="Submit"> <a
			href="/estimator" class="btn">Cancel</a>
	</div>
</form>
""")))})),format.raw/*115.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/estimator/estimate1.scala.html
                    HASH: 95c52e3901fff98a302fa0a3d16fd1198e2e87c7
                    MATRIX: 885->17|921->19|946->36|985->38|4017->3038
                    LINES: 30->2|31->3|31->3|31->3|143->115
                    -- GENERATED --
                */
            