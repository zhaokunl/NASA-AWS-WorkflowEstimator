
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
object deviceTypes extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.DeviceType],play.data.Form[metadata.DeviceType],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(deviceTypes: List[metadata.DeviceType], deviceTypeForm: play.data.Form[metadata.DeviceType]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*6.2*/scripts/*6.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
	<script src='"""),_display_(Seq[Any](/*7.16*/routes/*7.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*7.62*/("""'></script>
""")))};
Seq[Any](format.raw/*2.95*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main("DeviceTypes", scripts)/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
    
    """),_display_(Seq[Any](/*12.6*/flash_message())),format.raw/*12.21*/("""
    
    <h1>"""),_display_(Seq[Any](/*14.10*/deviceTypes/*14.21*/.size())),format.raw/*14.28*/(""" Devices Types</h1>
    <table class="table table-striped table-bordered table-condensed">
	    <tr>
	    	<td>Device Type Name</td>   
	    	<td>Manufacturer</td>
	    	<td>Version</td>
	    	<td>Sensor Type Names</td>
	        <td>User Defined Fields</td>
	    						
	    	"""),_display_(Seq[Any](/*23.8*/if(session.get("email"))/*23.32*/{_display_(Seq[Any](format.raw/*23.33*/("""
	    		<td>Operation</td>
	    	""")))})),format.raw/*25.8*/("""
	    </tr>

    	"""),_display_(Seq[Any](/*28.7*/for(deviceType <- deviceTypes) yield /*28.37*/ {_display_(Seq[Any](format.raw/*28.39*/("""
    	<tr>
            <td>"""),_display_(Seq[Any](/*30.18*/deviceType/*30.28*/.getDeviceTypeName())),format.raw/*30.48*/("""</td>
            <td>"""),_display_(Seq[Any](/*31.18*/deviceType/*31.28*/.getManufacturer())),format.raw/*31.46*/("""</td>
            <td>"""),_display_(Seq[Any](/*32.18*/deviceType/*32.28*/.getVersion())),format.raw/*32.41*/("""</td>
	    	<td>"""),_display_(Seq[Any](/*33.12*/deviceType/*33.22*/.getSensorTypeNames())),format.raw/*33.43*/("""</td>
            <td>
            <span class=""""),_display_(Seq[Any](/*35.27*/deviceType/*35.37*/.getDeviceTypeName())),format.raw/*35.57*/(""" editable"
            	data-name='deviceTypeUserDefinedFields'>
            	"""),_display_(Seq[Any](/*37.15*/deviceType/*37.25*/.getDeviceTypeUserDefinedFields())),format.raw/*37.58*/("""
            </span>
            </td>
	    	"""),_display_(Seq[Any](/*40.8*/if(session.get("email"))/*40.32*/{_display_(Seq[Any](format.raw/*40.33*/("""
            		
	              	<td class="operation">
						<input type="button" class="edit-btn btn btn-primary" value="Edit" 
							data-pk='"""),_display_(Seq[Any](/*44.18*/deviceType/*44.28*/.getDeviceTypeName())),format.raw/*44.48*/("""' 
							data-url='"""),_display_(Seq[Any](/*45.19*/routes/*45.25*/.DeviceTypeController.editDeviceType())),format.raw/*45.63*/("""' 
						>						
             			"""),_display_(Seq[Any](/*47.18*/form(routes.DeviceTypeController.deleteDeviceType())/*47.70*/{_display_(Seq[Any](format.raw/*47.71*/("""
               		 		<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*48.66*/deviceType/*48.76*/.getDeviceTypeName())),format.raw/*48.96*/("""">
        							<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this item?')">
            			""")))})),format.raw/*50.17*/("""
               			
            		</td>
            """)))})),format.raw/*53.14*/("""
    	</tr>
        """)))})),format.raw/*55.10*/("""
    </table>
    
    """),_display_(Seq[Any](/*58.6*/if(session.get("email"))/*58.30*/{_display_(Seq[Any](format.raw/*58.31*/("""
    <h2>Add a new device type</h2>

	    """),_display_(Seq[Any](/*61.7*/form(action = routes.DeviceTypeController.newDeviceType())/*61.65*/ {_display_(Seq[Any](format.raw/*61.67*/("""
	        
	            """),_display_(Seq[Any](/*63.15*/inputText(
	                deviceTypeForm("deviceTypeName"), 
	                '_label -> "Device Type Name * (Please DO NOT contain spaces)",                 
	                '_error -> deviceTypeForm.globalError                                
	            ))),format.raw/*67.15*/("""
	            """),_display_(Seq[Any](/*68.15*/inputText(
	                deviceTypeForm("manufacturer"), 
	                '_label -> "Manufacturer", 
	                '_error -> deviceTypeForm.globalError                                
	            ))),format.raw/*72.15*/("""
	            """),_display_(Seq[Any](/*73.15*/inputText(
	                deviceTypeForm("version"), 
	                '_label -> "Version",
	                '_error -> deviceTypeForm.globalError                                
	            ))),format.raw/*77.15*/("""
	            """),_display_(Seq[Any](/*78.15*/inputText(
	            	deviceTypeForm("deviceTypeUserDefinedFields"),
	            	'_label -> "User Defined Fields",
	            	'_error -> deviceTypeForm.globalError
	            ))),format.raw/*82.15*/("""
	            <dt>
	            	<label>Sensor Type Name</label>
	            </dt>
	            <dd>
		            <select id="sensorTypeNames" name="sensorTypeNames" multiple>
		            	"""),_display_(Seq[Any](/*88.17*/for(sensorTypeName <- metadata.SensorType.allSensorTypeName()) yield /*88.79*/ {_display_(Seq[Any](format.raw/*88.81*/("""
		            		<option value=""""),_display_(Seq[Any](/*89.33*/sensorTypeName)),format.raw/*89.47*/("""">"""),_display_(Seq[Any](/*89.50*/sensorTypeName)),format.raw/*89.64*/("""</option>
		            	""")))})),format.raw/*90.17*/("""
		            </select>
	            </dd>
	           
	      
	        <div class="actions">
	            <input type="submit" class="btn primary" value="Register">
	            <a href=""""),_display_(Seq[Any](/*97.24*/routes/*97.30*/.DeviceTypeController.deviceTypes())),format.raw/*97.65*/("""" class="btn">Cancel</a>
	        </div>
	        
	    """)))})),format.raw/*100.7*/("""
	""")))})),format.raw/*101.3*/("""
""")))})))}
    }
    
    def render(deviceTypes:List[metadata.DeviceType],deviceTypeForm:play.data.Form[metadata.DeviceType]): play.api.templates.HtmlFormat.Appendable = apply(deviceTypes,deviceTypeForm)
    
    def f:((List[metadata.DeviceType],play.data.Form[metadata.DeviceType]) => play.api.templates.HtmlFormat.Appendable) = (deviceTypes,deviceTypeForm) => apply(deviceTypes,deviceTypeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 18:36:21 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/deviceTypes.scala.html
                    HASH: 452dcfa50f7bdf2df60a2872eff8da4d51351b14
                    MATRIX: 835->2|1021->116|1035->123|1119->127|1170->143|1184->149|1245->189|1297->95|1325->114|1352->202|1390->205|1427->233|1467->235|1513->246|1550->261|1601->276|1621->287|1650->294|1962->571|1995->595|2034->596|2099->630|2153->649|2199->679|2239->681|2303->709|2322->719|2364->739|2423->762|2442->772|2482->790|2541->813|2560->823|2595->836|2648->853|2667->863|2710->884|2795->933|2814->943|2856->963|2971->1042|2990->1052|3045->1085|3126->1131|3159->1155|3198->1156|3380->1302|3399->1312|3441->1332|3498->1353|3513->1359|3573->1397|3643->1431|3704->1483|3743->1484|3845->1550|3864->1560|3906->1580|4104->1746|4189->1799|4242->1820|4301->1844|4334->1868|4373->1869|4451->1912|4518->1970|4558->1972|4619->1997|4903->2259|4954->2274|5183->2481|5234->2496|5452->2692|5503->2707|5711->2893|5941->3087|6019->3149|6059->3151|6128->3184|6164->3198|6203->3201|6239->3215|6297->3241|6524->3432|6539->3438|6596->3473|6685->3530|6720->3533
                    LINES: 26->2|29->6|29->6|31->6|32->7|32->7|32->7|34->2|36->5|37->8|39->10|39->10|39->10|41->12|41->12|43->14|43->14|43->14|52->23|52->23|52->23|54->25|57->28|57->28|57->28|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33|64->35|64->35|64->35|66->37|66->37|66->37|69->40|69->40|69->40|73->44|73->44|73->44|74->45|74->45|74->45|76->47|76->47|76->47|77->48|77->48|77->48|79->50|82->53|84->55|87->58|87->58|87->58|90->61|90->61|90->61|92->63|96->67|97->68|101->72|102->73|106->77|107->78|111->82|117->88|117->88|117->88|118->89|118->89|118->89|118->89|119->90|126->97|126->97|126->97|129->100|130->101
                    -- GENERATED --
                */
            