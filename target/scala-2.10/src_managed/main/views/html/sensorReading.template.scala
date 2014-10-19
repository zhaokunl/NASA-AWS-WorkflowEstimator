
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
object sensorReading extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[play.data.Form[SensorReading],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sensorReadingForm: play.data.Form[SensorReading]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.52*/(""" 
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("Sensor Reading")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/(""" 

"""),_display_(Seq[Any](/*7.2*/flash_message())),format.raw/*7.17*/(""" 
    
    

"""),_display_(Seq[Any](/*11.2*/helper/*11.8*/.form(action = routes.SensorReadingController.getSensorReadingsWithinRange)/*11.83*/ {_display_(Seq[Any](format.raw/*11.85*/("""
<fieldset>
	<legend>Sensor Reading within a time range</legend>


	"""),_display_(Seq[Any](/*16.3*/select( 
		sensorReadingForm("sensorName"),
		options(metadata.Sensor.allSensorNames()),
	 	'_label -> "Sensor Name",
		'_error -> sensorReadingForm.globalError
	))),format.raw/*21.3*/("""
	<div class="ui-picker">

		<p>
			<label>Start Date</label> <input class="startDate" type="date"
				name="startDate" />
		</p>
		<p>
			<label>Start Time</label> <input class="startTime" name="startTime"
				type="text" value="10:59:00" />
		</p>

		<p>
			<label>End Date</label> <input class="endDate" type="date"
				name="endDate" />
		</p>
		<p>
			<label>End Time</label> <input class="endTime" name="endTime"
				type="text" value="11:00:00" />
		</p>
	</div>

</fieldset>


<div class="actions">
	<p>
		<button type="submit" class="btn primary" name="action" value="Download">Download Json File</button>
		 <a
		href=""""),_display_(Seq[Any](/*50.10*/routes/*50.16*/.Application.index)),format.raw/*50.34*/("""" class="btn">Cancel</a>
	</p>
</div>

""")))})),format.raw/*54.2*/("""

"""),_display_(Seq[Any](/*56.2*/helper/*56.8*/.form(action = routes.SensorReadingController.getSensorReadingsAtTimestamp)/*56.83*/ {_display_(Seq[Any](format.raw/*56.85*/("""
<fieldset>
	<legend>Sensor Reading at a Specific Timestamp</legend>


	"""),_display_(Seq[Any](/*61.3*/select( 
		sensorReadingForm("sensorName2"),
		options(metadata.Sensor.allSensorNames()),
	 	'_label -> "Sensor Name",
		'_error -> sensorReadingForm.globalError
	))),format.raw/*66.3*/("""
	<div class="ui-picker">

		<p>
			<label>Date</label> <input class="startDate" type="date"
				name="Date" />
		</p>
		<p>
			<label>Time</label> <input class="startTime" name="Time"
				type="text" value="10:59:00" />
		</p>

	</div>

</fieldset>


<div class="actions">
	<p>
		<button type="submit" class="btn primary" name="action" value="Download">Download Json File</button>
		<a
		href=""""),_display_(Seq[Any](/*87.10*/routes/*87.16*/.Application.index)),format.raw/*87.34*/("""" class="btn">Cancel</a>
	</p>
</div>
""")))})),format.raw/*90.2*/("""



"""),_display_(Seq[Any](/*94.2*/helper/*94.8*/.form(action = routes.SensorReadingController.getLatestSensorReadings())/*94.80*/ {_display_(Seq[Any](format.raw/*94.82*/("""
<fieldset>
	<legend>Latest Sensor Reading at a Specific Timestamp for one type in all registered devices</legend>


	"""),_display_(Seq[Any](/*99.3*/select( 
		sensorReadingForm("sensorType"),
		options(metadata.SensorType.allSensorTypeName()),
	 	'_label -> "Sensor Type Name",
		'_error -> sensorReadingForm.globalError
	))),format.raw/*104.3*/("""
</fieldset>


<div class="actions">
	<p>
		<button type="submit" class="btn primary" name="action" value="Download">Download Json File</button>
		<a
		href=""""),_display_(Seq[Any](/*112.10*/routes/*112.16*/.Application.index)),format.raw/*112.34*/("""" class="btn">Cancel</a>
	</p>
</div>

""")))})),format.raw/*116.2*/("""

	<script type="text/javascript">

	$(function() """),format.raw/*120.15*/("""{"""),format.raw/*120.16*/("""
		Date.prototype.toDateInputValue = (function() """),format.raw/*121.49*/("""{"""),format.raw/*121.50*/("""
			var local = new Date(this);
			local.setMinutes(this.getMinutes() - this.getTimezoneOffset());
			return local.toJSON().slice(0, 10);
		"""),format.raw/*125.3*/("""}"""),format.raw/*125.4*/(""");
		
		
		var curTimestamp = new Date();
		$('.startDate').val(curTimestamp.toDateInputValue());
		$('.endDate').val(curTimestamp.toDateInputValue());
		$('.startTime').val("09:00:00");
		$('.endTime').val("18:00:00");
		
		
		"""),format.raw/*135.3*/("""}"""),format.raw/*135.4*/(""");
	</script>

""")))})),format.raw/*138.2*/("""
"""))}
    }
    
    def render(sensorReadingForm:play.data.Form[SensorReading]): play.api.templates.HtmlFormat.Appendable = apply(sensorReadingForm)
    
    def f:((play.data.Form[SensorReading]) => play.api.templates.HtmlFormat.Appendable) = (sensorReadingForm) => apply(sensorReadingForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:33 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/sensorReading.scala.html
                    HASH: 3b249aaac9dfe712b65b17a783914bc4cf4d56a5
                    MATRIX: 805->1|965->51|993->70|1030->73|1060->95|1099->97|1137->101|1173->116|1222->130|1236->136|1320->211|1360->213|1464->282|1648->445|2314->1075|2329->1081|2369->1099|2440->1139|2478->1142|2492->1148|2576->1223|2616->1225|2724->1298|2909->1462|3341->1858|3356->1864|3396->1882|3466->1921|3506->1926|3520->1932|3601->2004|3641->2006|3795->2125|3992->2300|4188->2459|4204->2465|4245->2483|4317->2523|4396->2573|4426->2574|4504->2623|4534->2624|4702->2764|4731->2765|4987->2993|5016->2994|5064->3010
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|39->11|39->11|39->11|39->11|44->16|49->21|78->50|78->50|78->50|82->54|84->56|84->56|84->56|84->56|89->61|94->66|115->87|115->87|115->87|118->90|122->94|122->94|122->94|122->94|127->99|132->104|140->112|140->112|140->112|144->116|148->120|148->120|149->121|149->121|153->125|153->125|163->135|163->135|166->138
                    -- GENERATED --
                */
            