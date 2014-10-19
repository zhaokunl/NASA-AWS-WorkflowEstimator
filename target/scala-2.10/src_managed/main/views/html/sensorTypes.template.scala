
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
object sensorTypes extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.SensorType],play.data.Form[metadata.SensorType],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(sensorTypes: List[metadata.SensorType], sensorTypeForm: play.data.Form[metadata.SensorType]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*7.2*/scripts/*7.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.13*/("""
	<script src='"""),_display_(Seq[Any](/*8.16*/routes/*8.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*8.62*/("""'></script>
""")))};
Seq[Any](format.raw/*2.95*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/main("Sensor Types", scripts)/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
    
    """),_display_(Seq[Any](/*13.6*/flash_message())),format.raw/*13.21*/("""
    
    <h1>"""),_display_(Seq[Any](/*15.10*/sensorTypes/*15.21*/.size())),format.raw/*15.28*/(""" Sensor Types</h1>
    <table class="table table-striped table-bordered table-condensed">
    <tr>
    	<td>Sensor Type Name</td>
    	<td>Manufacturer</td>
    	<td>Version</td>
    	<td>Max Value</td>
    	<td>Min Value</td>
    	<td>Unit</td>
    	<td>Interpreter</td>
    	<td>Sensor Category</td>
    	<td>User Defined Fields</td>
    	
    	
    	"""),_display_(Seq[Any](/*29.7*/if(session.get("email"))/*29.31*/{_display_(Seq[Any](format.raw/*29.32*/("""
    	<td>Operation</td>
    	""")))})),format.raw/*31.7*/("""
    </tr>

        """),_display_(Seq[Any](/*34.10*/for(sensorType <- sensorTypes) yield /*34.40*/ {_display_(Seq[Any](format.raw/*34.42*/("""
    <tr id=""""),_display_(Seq[Any](/*35.14*/sensorType/*35.24*/.getId())),format.raw/*35.32*/("""">
            <td>"""),_display_(Seq[Any](/*36.18*/sensorType/*36.28*/.getSensorTypeName())),format.raw/*36.48*/("""</td>
                <td>"""),_display_(Seq[Any](/*37.22*/sensorType/*37.32*/.getManufacturer())),format.raw/*37.50*/("""</td>
                <td>"""),_display_(Seq[Any](/*38.22*/sensorType/*38.32*/.getVersion())),format.raw/*38.45*/("""</td>
                <td>"""),_display_(Seq[Any](/*39.22*/sensorType/*39.32*/.getMaxValue())),format.raw/*39.46*/("""</td>
                <td>"""),_display_(Seq[Any](/*40.22*/sensorType/*40.32*/.getMinValue())),format.raw/*40.46*/("""</td>
                <td>"""),_display_(Seq[Any](/*41.22*/sensorType/*41.32*/.getUnit())),format.raw/*41.42*/("""</td>
                <td>"""),_display_(Seq[Any](/*42.22*/sensorType/*42.32*/.getInterpreter())),format.raw/*42.49*/("""</td>
                <td>"""),_display_(Seq[Any](/*43.22*/sensorType/*43.32*/.getSensorCategoryName())),format.raw/*43.56*/("""</td>
                <td>
	                <span class=""""),_display_(Seq[Any](/*45.32*/sensorType/*45.42*/.getSensorTypeName())),format.raw/*45.62*/(""" editable"
	                	data-name='sensorTypeUserDefinedFields'>
	                	"""),_display_(Seq[Any](/*47.20*/sensorType/*47.30*/.getSensorTypeUserDefinedFields())),format.raw/*47.63*/("""
	                </span>
                </td>
                
    			"""),_display_(Seq[Any](/*51.9*/if(session.get("email"))/*51.33*/{_display_(Seq[Any](format.raw/*51.34*/("""

	              	<td class="operation">
						
						<input type="button" class="edit-btn btn btn-primary" value="Edit" 
							data-pk='"""),_display_(Seq[Any](/*56.18*/sensorType/*56.28*/.getSensorTypeName())),format.raw/*56.48*/("""' 
							data-url='"""),_display_(Seq[Any](/*57.19*/routes/*57.25*/.SensorTypeController.editSensorType())),format.raw/*57.63*/("""' 
						>
						
						
	               		 """),_display_(Seq[Any](/*61.21*/form(routes.SensorTypeController.deleteSensorType())/*61.73*/{_display_(Seq[Any](format.raw/*61.74*/("""
	               		 	<input name="idHolder" type="hidden" value=""""),_display_(Seq[Any](/*62.66*/sensorType/*62.76*/.getSensorTypeName())),format.raw/*62.96*/("""">
	        				<input type="submit"  class="btn btn-danger" value="Delete" onclick="return confirm('Are you sure you want to delete this item?')">
	            		""")))})),format.raw/*64.17*/("""
	          		</td>
           			
            	""")))})),format.raw/*67.15*/("""
    </tr>
        """)))})),format.raw/*69.10*/("""
    </table>
    
    
    """),_display_(Seq[Any](/*73.6*/if(session.get("email"))/*73.30*/{_display_(Seq[Any](format.raw/*73.31*/("""
    <h2>Add a new sensor type</h2>
    
    """),_display_(Seq[Any](/*76.6*/form(routes.SensorTypeController.newSensorType())/*76.55*/ {_display_(Seq[Any](format.raw/*76.57*/("""
         
        """),_display_(Seq[Any](/*78.10*/inputText(
                sensorTypeForm("sensorTypeName"), 
                '_label -> "Sensor Type Name * (Please DO NOT contain spaces)",     
                'size -> 30,
                'placeholder-> "the name of this sensor type",           
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*84.10*/("""
        """),_display_(Seq[Any](/*85.10*/inputText(
                sensorTypeForm("manufacturer"), 
                '_label -> "Manufacturer",  
                'size -> 30,
                'placeholder-> "the name of Manufacturer",               
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*91.10*/("""
        """),_display_(Seq[Any](/*92.10*/inputText(
                sensorTypeForm("version"), 
                '_label -> "Version",
                'placeholder-> 1.0,                 
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*97.10*/("""
        """),_display_(Seq[Any](/*98.10*/inputText(
                sensorTypeForm("maximumValue"), 
                '_label -> "Max Value",
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*102.10*/("""
        """),_display_(Seq[Any](/*103.10*/inputText(
                sensorTypeForm("minimumValue"), 
                '_label -> "Min Value",                 
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*107.10*/("""
        """),_display_(Seq[Any](/*108.10*/inputText(
                sensorTypeForm("unit"), 
                '_label -> "Unit",                 
                'placeholder-> "Celsius",                 
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*113.10*/("""
        """),_display_(Seq[Any](/*114.10*/inputText(
                sensorTypeForm("interpreter"), 
                '_label -> "Interpreter",                 
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*118.10*/("""
        """),_display_(Seq[Any](/*119.10*/select(
        		sensorTypeForm("sensorCategoryName"), 
                options(metadata.SensorCategory.allSensorCategoryName()),
     			'_label -> "Sensor Category",
                '_error -> sensorTypeForm.globalError
        		))),format.raw/*124.12*/("""
        		
         """),_display_(Seq[Any](/*126.11*/inputText(
                sensorTypeForm("sensorTypeUserDefinedFields"), 
                '_label -> "User Defined Fields",                     
                '_error -> sensorTypeForm.globalError                                
        ))),format.raw/*130.10*/("""
        <input class="btn" type="submit" value="Register">
        <a href=""""),_display_(Seq[Any](/*132.19*/routes/*132.25*/.SensorTypeController.sensorTypes())),format.raw/*132.60*/("""" class="btn">Cancel</a>
        
    """)))})),format.raw/*134.6*/("""
 		""")))})),format.raw/*135.5*/("""   
""")))})))}
    }
    
    def render(sensorTypes:List[metadata.SensorType],sensorTypeForm:play.data.Form[metadata.SensorType]): play.api.templates.HtmlFormat.Appendable = apply(sensorTypes,sensorTypeForm)
    
    def f:((List[metadata.SensorType],play.data.Form[metadata.SensorType]) => play.api.templates.HtmlFormat.Appendable) = (sensorTypes,sensorTypeForm) => apply(sensorTypes,sensorTypeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/sensorTypes.scala.html
                    HASH: bd5137949e5ad952a56eeb4f93cb5c340720f134
                    MATRIX: 835->2|1055->150|1069->157|1153->161|1204->177|1218->183|1279->223|1331->95|1359->148|1386->236|1424->239|1462->268|1502->270|1548->281|1585->296|1636->311|1656->322|1685->329|2074->683|2107->707|2146->708|2208->739|2265->760|2311->790|2351->792|2401->806|2420->816|2450->824|2506->844|2525->854|2567->874|2630->901|2649->911|2689->929|2752->956|2771->966|2806->979|2869->1006|2888->1016|2924->1030|2987->1057|3006->1067|3042->1081|3105->1108|3124->1118|3156->1128|3219->1155|3238->1165|3277->1182|3340->1209|3359->1219|3405->1243|3499->1301|3518->1311|3560->1331|3685->1420|3704->1430|3759->1463|3867->1536|3900->1560|3939->1561|4114->1700|4133->1710|4175->1730|4232->1751|4247->1757|4307->1795|4388->1840|4449->1892|4488->1893|4590->1959|4609->1969|4651->1989|4847->2153|4928->2202|4980->2222|5044->2251|5077->2275|5116->2276|5197->2322|5255->2371|5295->2373|5351->2393|5718->2738|5764->2748|6089->3051|6135->3061|6398->3302|6444->3312|6662->3507|6709->3517|6944->3729|6991->3739|7272->3997|7319->4007|7555->4220|7602->4230|7859->4464|7918->4486|8182->4727|8297->4805|8313->4811|8371->4846|8442->4885|8479->4890
                    LINES: 26->2|31->7|31->7|33->7|34->8|34->8|34->8|36->2|38->6|39->9|41->11|41->11|41->11|43->13|43->13|45->15|45->15|45->15|59->29|59->29|59->29|61->31|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|75->45|75->45|75->45|77->47|77->47|77->47|81->51|81->51|81->51|86->56|86->56|86->56|87->57|87->57|87->57|91->61|91->61|91->61|92->62|92->62|92->62|94->64|97->67|99->69|103->73|103->73|103->73|106->76|106->76|106->76|108->78|114->84|115->85|121->91|122->92|127->97|128->98|132->102|133->103|137->107|138->108|143->113|144->114|148->118|149->119|154->124|156->126|160->130|162->132|162->132|162->132|164->134|165->135
                    -- GENERATED --
                */
            