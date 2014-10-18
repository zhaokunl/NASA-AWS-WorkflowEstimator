
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
object sensors extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Sensor],play.data.Form[metadata.Sensor],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(sensors: List[metadata.Sensor], sensorForm: play.data.Form[metadata.Sensor]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

def /*5.2*/scripts/*5.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
	<script src='"""),_display_(Seq[Any](/*6.16*/routes/*6.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*6.62*/("""'></script>
""")))};
Seq[Any](format.raw/*2.79*/(""" 
"""),format.raw/*4.1*/("""
"""),format.raw/*7.2*/("""

"""),_display_(Seq[Any](/*9.2*/main("Sensors",scripts)/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
	
	"""),_display_(Seq[Any](/*11.3*/flash_message())),format.raw/*11.18*/("""
	
	<h1>"""),_display_(Seq[Any](/*13.7*/sensors/*13.14*/.size())),format.raw/*13.21*/(""" Sensors</h1>
	<table class="table table-striped table-bordered table-condensed">
		<tr>
			<td>Sensor Name</td>
			<td>Sensor Type</td>
			<td>Device URI</td>
			<td>Sensor Category</td>
			<td>User Defined Fields</td>
			
    	"""),_display_(Seq[Any](/*22.7*/if(session.get("email"))/*22.31*/{_display_(Seq[Any](format.raw/*22.32*/("""
			<td>Operation</td>
			""")))})),format.raw/*24.5*/("""
		</tr>
	
		"""),_display_(Seq[Any](/*27.4*/for(sensor <- sensors) yield /*27.26*/ {_display_(Seq[Any](format.raw/*27.28*/("""
		<tr>
			<td>"""),_display_(Seq[Any](/*29.9*/sensor/*29.15*/.getSensorName())),format.raw/*29.31*/("""</td>
			<td>"""),_display_(Seq[Any](/*30.9*/sensor/*30.15*/.getSensorTypeName())),format.raw/*30.35*/("""</td>
			<td>"""),_display_(Seq[Any](/*31.9*/sensor/*31.15*/.getDeviceUri())),format.raw/*31.30*/("""</td>
			<td>"""),_display_(Seq[Any](/*32.9*/sensor/*32.15*/.getSensorCategoryName())),format.raw/*32.39*/("""</td>
			<td>
			 	<span class=""""),_display_(Seq[Any](/*34.20*/sensor/*34.26*/.getSensorName())),format.raw/*34.42*/(""" editable" 
			 		data-name='sensorUserDefinedFields'>
					"""),_display_(Seq[Any](/*36.7*/sensor/*36.13*/.getSensorUserDefinedFields())),format.raw/*36.42*/("""
				</span>
			</td>

    	"""),_display_(Seq[Any](/*40.7*/if(session.get("email"))/*40.31*/{_display_(Seq[Any](format.raw/*40.32*/("""
			
         <td class="operation">
			<input type="button" class="edit-btn btn btn-primary" value="Edit" 
				data-pk='"""),_display_(Seq[Any](/*44.15*/sensor/*44.21*/.getSensorName())),format.raw/*44.37*/("""' 
				data-url='"""),_display_(Seq[Any](/*45.16*/routes/*45.22*/.SensorController.editSensor())),format.raw/*45.52*/("""' 
			>

			"""),_display_(Seq[Any](/*48.5*/form(routes.SensorController.deleteSensor())/*48.49*/{_display_(Seq[Any](format.raw/*48.50*/("""
          		<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*49.58*/sensor/*49.64*/.getSensorName())),format.raw/*49.80*/("""">
        		<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this item?')">
       		""")))})),format.raw/*51.11*/("""
               			
		</td>
		""")))})),format.raw/*54.4*/("""
		</tr>
		""")))})),format.raw/*56.4*/("""
	</table>
	
	
    """),_display_(Seq[Any](/*60.6*/if(session.get("email"))/*60.30*/{_display_(Seq[Any](format.raw/*60.31*/("""
	<h2>Add a new sensor</h2>
	
	"""),_display_(Seq[Any](/*63.3*/helper/*63.9*/.form(action = routes.SensorController.newSensor)/*63.58*/ {_display_(Seq[Any](format.raw/*63.60*/("""
        		
        		"""),_display_(Seq[Any](/*65.12*/inputText(
		                sensorForm("sensorName"), 
		                '_label -> "Sensor Name * (Please DO NOT contain spaces)",
		                '_error -> sensorForm.globalError                                
            	))),format.raw/*69.15*/("""
            	"""),_display_(Seq[Any](/*70.15*/select(
        				sensorForm("deviceUri"), 
               			options(metadata.Device.allDeviceUri()),
        				'_label -> "Parent Device",
                		'_error -> sensorForm.globalError
        		))),format.raw/*75.12*/("""
        		"""),_display_(Seq[Any](/*76.12*/select(
		        		sensorForm("sensorTypeName"), 
		                options(metadata.SensorType.allSensorTypeName()),
		        		'_label -> "Sensor Type (Please select the sensor types belonging to the parent device)",
		                '_error -> sensorForm.globalError
        		))),format.raw/*81.12*/("""
        		
        		"""),_display_(Seq[Any](/*83.12*/inputText(
		                sensorForm("sensorUserDefinedFields"), 
		                '_label -> "User Defined Fields",
		                '_error -> sensorForm.globalError                                
            	))),format.raw/*87.15*/("""
       
      
        <div class="actions">
            <input type="submit" class="btn btn-primary" value="Create">
            <a href=""""),_display_(Seq[Any](/*92.23*/routes/*92.29*/.Application.index)),format.raw/*92.47*/("""" class="btn">Cancel</a>
        </div>
         
     """)))})),format.raw/*95.7*/("""
     """)))})),format.raw/*96.7*/("""
""")))})),format.raw/*97.2*/("""
"""))}
    }
    
    def render(sensors:List[metadata.Sensor],sensorForm:play.data.Form[metadata.Sensor]): play.api.templates.HtmlFormat.Appendable = apply(sensors,sensorForm)
    
    def f:((List[metadata.Sensor],play.data.Form[metadata.Sensor]) => play.api.templates.HtmlFormat.Appendable) = (sensors,sensorForm) => apply(sensors,sensorForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 18:36:21 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/sensors.scala.html
                    HASH: 8642d226615457ef8c73eb8f9155a180e25dd4e5
                    MATRIX: 823->2|994->101|1008->108|1092->112|1143->128|1157->134|1218->174|1270->79|1298->99|1325->187|1362->190|1393->213|1432->215|1472->220|1509->235|1553->244|1569->251|1598->258|1863->488|1896->512|1935->513|1993->540|2042->554|2080->576|2120->578|2171->594|2186->600|2224->616|2273->630|2288->636|2330->656|2379->670|2394->676|2431->691|2480->705|2495->711|2541->735|2610->768|2625->774|2663->790|2759->851|2774->857|2825->886|2889->915|2922->939|2961->940|3119->1062|3134->1068|3172->1084|3226->1102|3241->1108|3293->1138|3341->1151|3394->1195|3433->1196|3527->1254|3542->1260|3580->1276|3767->1431|3829->1462|3872->1474|3927->1494|3960->1518|3999->1519|4066->1551|4080->1557|4138->1606|4178->1608|4237->1631|4490->1862|4541->1877|4771->2085|4819->2097|5125->2381|5184->2404|5425->2623|5602->2764|5617->2770|5657->2788|5744->2844|5782->2851|5815->2853
                    LINES: 26->2|29->5|29->5|31->5|32->6|32->6|32->6|34->2|35->4|36->7|38->9|38->9|38->9|40->11|40->11|42->13|42->13|42->13|51->22|51->22|51->22|53->24|56->27|56->27|56->27|58->29|58->29|58->29|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|63->34|63->34|63->34|65->36|65->36|65->36|69->40|69->40|69->40|73->44|73->44|73->44|74->45|74->45|74->45|77->48|77->48|77->48|78->49|78->49|78->49|80->51|83->54|85->56|89->60|89->60|89->60|92->63|92->63|92->63|92->63|94->65|98->69|99->70|104->75|105->76|110->81|112->83|116->87|121->92|121->92|121->92|124->95|125->96|126->97
                    -- GENERATED --
                */
            