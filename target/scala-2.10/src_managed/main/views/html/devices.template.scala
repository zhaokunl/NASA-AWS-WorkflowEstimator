
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
object devices extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.Device],play.data.Form[metadata.Device],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(devices: List[metadata.Device], deviceForm: play.data.Form[metadata.Device]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*6.2*/scripts/*6.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
	<script src='"""),_display_(Seq[Any](/*7.16*/routes/*7.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*7.62*/("""'></script>
	<script src='"""),_display_(Seq[Any](/*8.16*/routes/*8.22*/.Assets.at("javascripts/device_search.js"))),format.raw/*8.64*/("""'></script>
""")))};
Seq[Any](format.raw/*2.79*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/main("Devices", scripts)/*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/("""
    
    """),_display_(Seq[Any](/*13.6*/flash_message())),format.raw/*13.21*/("""
    
    <div class="visual_search"></div>
    
    <h1>"""),_display_(Seq[Any](/*17.10*/devices/*17.17*/.size())),format.raw/*17.24*/(""" Devices</h1>
		<table class="table table-striped table-bordered table-condensed">
			<tr>
	    	<td>URI</td>
	    	<td>Device Type</td>
	    	<td>Sensor Type Names within device</td>
	    	<td>Sensor Names within device</td>
	    	
	    	<td>Location: Longitude</td>
	    	<td>Location: Latitude</td>
	    	<td>Location: Altitude</td>
	    	<td>Location: Interpreter</td>
	    	
	    	<td>User Defined Fields</td>
	    	
	    	"""),_display_(Seq[Any](/*32.8*/if(session.get("email"))/*32.32*/{_display_(Seq[Any](format.raw/*32.33*/("""
	    	<td>Operation</td>
	    	""")))})),format.raw/*34.8*/("""
	    	</tr>

    	"""),_display_(Seq[Any](/*37.7*/for(device <- devices) yield /*37.29*/ {_display_(Seq[Any](format.raw/*37.31*/("""
    	<tr id=""""),_display_(Seq[Any](/*38.15*/device/*38.21*/.getId())),format.raw/*38.29*/("""" class="devices">
            <td class="deviceUri">"""),_display_(Seq[Any](/*39.36*/device/*39.42*/.getDeviceUri())),format.raw/*39.57*/("""</td>
            <td class="deviceTypeName">"""),_display_(Seq[Any](/*40.41*/device/*40.47*/.getDeviceTypeName())),format.raw/*40.67*/("""</td>
       		<td class="sensorTypeNames">"""),_display_(Seq[Any](/*41.39*/device/*41.45*/.getSensorTypeNames())),format.raw/*41.66*/("""</td>
       		<td class="sensorNames">"""),_display_(Seq[Any](/*42.35*/device/*42.41*/.getSensorNames())),format.raw/*42.58*/("""</td>
       		
       		<td class="longitude">
	       		<span class=""""),_display_(Seq[Any](/*45.25*/device/*45.31*/.getDeviceUri())),format.raw/*45.46*/(""" editable" data-name="longitude">
	       		"""),_display_(Seq[Any](/*46.12*/device/*46.18*/.getLongitude())),format.raw/*46.33*/("""
	       		</span>
       		</td>
       		<td class="latitude">
       			<span class=""""),_display_(Seq[Any](/*50.25*/device/*50.31*/.getDeviceUri())),format.raw/*50.46*/(""" editable" data-name="latitude">
       			"""),_display_(Seq[Any](/*51.12*/device/*51.18*/.getLatitude())),format.raw/*51.32*/("""
       			</span>
       		</td>
       		<td class="altitude">
       			<span class=""""),_display_(Seq[Any](/*55.25*/device/*55.31*/.getDeviceUri())),format.raw/*55.46*/(""" editable" data-name="altitude">
       			"""),_display_(Seq[Any](/*56.12*/device/*56.18*/.getAltitude())),format.raw/*56.32*/("""
       			</span>
       		</td>
       		<td class="representation">
       			<span class=""""),_display_(Seq[Any](/*60.25*/device/*60.31*/.getDeviceUri())),format.raw/*60.46*/(""" editable" data-name="representation">
       			"""),_display_(Seq[Any](/*61.12*/device/*61.18*/.getRepresentation())),format.raw/*61.38*/("""
       			</span>
       		</td>
       		
       		<td class="deviceUserDefinedFields">
       			<span class=""""),_display_(Seq[Any](/*66.25*/device/*66.31*/.getDeviceUri())),format.raw/*66.46*/(""" editable"
       				data-name='deviceUserDefinedFields'>
            		"""),_display_(Seq[Any](/*68.16*/device/*68.22*/.getDeviceUserDefinedFields())),format.raw/*68.51*/("""
       			</span>
       		</td>

			"""),_display_(Seq[Any](/*72.5*/if(session.get("email"))/*72.29*/{_display_(Seq[Any](format.raw/*72.30*/("""
				<td class="operation">
						<input type="button" class="edit-btn btn btn-primary" value="Edit" 
							data-pk='"""),_display_(Seq[Any](/*75.18*/device/*75.24*/.getDeviceUri())),format.raw/*75.39*/("""' 
							data-url='"""),_display_(Seq[Any](/*76.19*/routes/*76.25*/.DeviceController.editDevice())),format.raw/*76.55*/("""'>		
					"""),_display_(Seq[Any](/*77.7*/form(routes.DeviceController.deleteDevice())/*77.51*/{_display_(Seq[Any](format.raw/*77.52*/("""
              		 	<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*78.64*/device/*78.70*/.getDeviceUri())),format.raw/*78.85*/("""">
       					<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this item?')">
           			""")))})),format.raw/*80.16*/("""
						
				</td>
			""")))})),format.raw/*83.5*/("""
    	</tr>
        """)))})),format.raw/*85.10*/("""
    </table>
    
    """),_display_(Seq[Any](/*88.6*/if(session.get("email"))/*88.30*/{_display_(Seq[Any](format.raw/*88.31*/("""
    <h2>Add a new device</h2>
    
    """),_display_(Seq[Any](/*91.6*/form(routes.DeviceController.newDevice())/*91.47*/ {_display_(Seq[Any](format.raw/*91.49*/("""
        		
        		"""),_display_(Seq[Any](/*93.12*/inputText(
	                deviceForm("uri"), 
	                '_label -> "URI *(Please DO NOT contain spaces)",
	                '_error -> deviceForm.globalError                                
            	))),format.raw/*97.15*/("""
        		"""),_display_(Seq[Any](/*98.12*/select(
        			deviceForm("deviceTypeName"), 
                	options(metadata.DeviceType.allDeviceTypeName()),
        			'_label -> "Device Type Name",
              	  	'_error -> deviceForm.globalError
        		))),format.raw/*103.12*/("""
		        		
		        """),_display_(Seq[Any](/*105.12*/inputText(
	                deviceForm("representation"), 
	                '_label -> "Location Interpreter",
	                'placeholder-> "GPS",                 
	                '_error -> deviceForm.globalError                                
		        ))),format.raw/*110.12*/("""
		        """),_display_(Seq[Any](/*111.12*/inputText(
	                deviceForm("longitude"), 
	                '_label -> "Location Longitude",
	                'placeholder-> "37.410355",                 
	                '_error -> deviceForm.globalError                                
		        ))),format.raw/*116.12*/("""
		        """),_display_(Seq[Any](/*117.12*/inputText(
	                deviceForm("latitude"), 
	                '_label -> "Location Latitude",                 
	                'placeholder-> "-122.059661",                 
	                '_error -> deviceForm.globalError                                
		        ))),format.raw/*122.12*/("""
		        """),_display_(Seq[Any](/*123.12*/inputText(
	                deviceForm("altitude"), 
	                '_label -> "Location Altitude",                 
	                'placeholder-> "0",                 
	                '_error -> deviceForm.globalError                                
		        ))),format.raw/*128.12*/("""       		
        		
        		"""),_display_(Seq[Any](/*130.12*/inputText(
	                deviceForm("deviceUserDefinedFields"), 
	                '_label -> "User Defined Fields",
	                '_error -> deviceForm.globalError                                
            	))),format.raw/*134.15*/("""
        <div class="actions">
            <input type="submit" class="btn primary" value="Register">
            <a href=""""),_display_(Seq[Any](/*137.23*/routes/*137.29*/.DeviceController.devices())),format.raw/*137.56*/("""" class="btn">Cancel</a>
        </div>
    """)))})),format.raw/*139.6*/("""
    """)))})),format.raw/*140.6*/("""
""")))})))}
    }
    
    def render(devices:List[metadata.Device],deviceForm:play.data.Form[metadata.Device]): play.api.templates.HtmlFormat.Appendable = apply(devices,deviceForm)
    
    def f:((List[metadata.Device],play.data.Form[metadata.Device]) => play.api.templates.HtmlFormat.Appendable) = (devices,deviceForm) => apply(devices,deviceForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:32 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/devices.scala.html
                    HASH: 709845ffbb0bbc2a841ea8a08c68079d2d9ee57c
                    MATRIX: 823->2|993->100|1007->107|1091->111|1142->127|1156->133|1217->173|1279->200|1293->206|1356->248|1408->79|1436->98|1463->261|1501->264|1534->288|1574->290|1620->301|1657->316|1751->374|1767->381|1796->388|2260->817|2293->841|2332->842|2396->875|2451->895|2489->917|2529->919|2580->934|2595->940|2625->948|2715->1002|2730->1008|2767->1023|2849->1069|2864->1075|2906->1095|2986->1139|3001->1145|3044->1166|3120->1206|3135->1212|3174->1229|3282->1301|3297->1307|3334->1322|3415->1367|3430->1373|3467->1388|3592->1477|3607->1483|3644->1498|3724->1542|3739->1548|3775->1562|3900->1651|3915->1657|3952->1672|4032->1716|4047->1722|4083->1736|4214->1831|4229->1837|4266->1852|4352->1902|4367->1908|4409->1928|4559->2042|4574->2048|4611->2063|4721->2137|4736->2143|4787->2172|4861->2211|4894->2235|4933->2236|5088->2355|5103->2361|5140->2376|5197->2397|5212->2403|5264->2433|5310->2444|5363->2488|5402->2489|5502->2553|5517->2559|5554->2574|5748->2736|5801->2758|5854->2779|5913->2803|5946->2827|5985->2828|6061->2869|6111->2910|6151->2912|6210->2935|6444->3147|6492->3159|6737->3381|6799->3406|7083->3667|7132->3679|7415->3939|7464->3951|7764->4228|7813->4240|8103->4507|8172->4539|8411->4755|8572->4879|8588->4885|8638->4912|8715->4957|8753->4963
                    LINES: 26->2|29->6|29->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->2|37->5|38->9|40->11|40->11|40->11|42->13|42->13|46->17|46->17|46->17|61->32|61->32|61->32|63->34|66->37|66->37|66->37|67->38|67->38|67->38|68->39|68->39|68->39|69->40|69->40|69->40|70->41|70->41|70->41|71->42|71->42|71->42|74->45|74->45|74->45|75->46|75->46|75->46|79->50|79->50|79->50|80->51|80->51|80->51|84->55|84->55|84->55|85->56|85->56|85->56|89->60|89->60|89->60|90->61|90->61|90->61|95->66|95->66|95->66|97->68|97->68|97->68|101->72|101->72|101->72|104->75|104->75|104->75|105->76|105->76|105->76|106->77|106->77|106->77|107->78|107->78|107->78|109->80|112->83|114->85|117->88|117->88|117->88|120->91|120->91|120->91|122->93|126->97|127->98|132->103|134->105|139->110|140->111|145->116|146->117|151->122|152->123|157->128|159->130|163->134|166->137|166->137|166->137|168->139|169->140
                    -- GENERATED --
                */
            