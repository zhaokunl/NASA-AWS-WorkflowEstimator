
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
object sensorCategories extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[metadata.SensorCategory],play.data.Form[metadata.SensorCategory],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(sensorCategories: List[metadata.SensorCategory], sensorCategoryForm: play.data.Form[metadata.SensorCategory]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*6.2*/scripts/*6.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
	<script src='"""),_display_(Seq[Any](/*7.16*/routes/*7.22*/.Assets.at("javascripts/edit_button.js"))),format.raw/*7.62*/("""'></script>
""")))};
Seq[Any](format.raw/*2.112*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main("Sensor Categories", scripts)/*10.36*/ {_display_(Seq[Any](format.raw/*10.38*/("""
	
	"""),_display_(Seq[Any](/*12.3*/flash_message())),format.raw/*12.18*/("""    

    <h1>"""),_display_(Seq[Any](/*14.10*/sensorCategories/*14.26*/.size())),format.raw/*14.33*/(""" Sensor Categories</h1>
		<table class="table table-striped table-bordered table-condensed">
	<tr>
		<td>Sensor Category Name</td>
		<td>Purpose</td> 
		"""),_display_(Seq[Any](/*19.4*/if(session.get("email"))/*19.28*/{_display_(Seq[Any](format.raw/*19.29*/("""
			<td>Operation</td> 
		""")))})),format.raw/*21.4*/("""
	</tr>

	"""),_display_(Seq[Any](/*24.3*/for(sensorCategory <- sensorCategories) yield /*24.42*/ {_display_(Seq[Any](format.raw/*24.44*/("""
	<tr>
		<td>"""),_display_(Seq[Any](/*26.8*/sensorCategory/*26.22*/.getSensorCategoryName())),format.raw/*26.46*/("""</td>

		<td><span class=""""),_display_(Seq[Any](/*28.21*/sensorCategory/*28.35*/.getSensorCategoryName())),format.raw/*28.59*/(""" editable" data-name='purpose'>
				"""),_display_(Seq[Any](/*29.6*/sensorCategory/*29.20*/.getPurpose())),format.raw/*29.33*/(""" </span></td>

		"""),_display_(Seq[Any](/*31.4*/if(session.get("email"))/*31.28*/{_display_(Seq[Any](format.raw/*31.29*/("""
			<td class="operation">
				<input type="button" class="edit-btn btn btn-primary" value="Edit" 
					data-pk='"""),_display_(Seq[Any](/*34.16*/sensorCategory/*34.30*/.getSensorCategoryName())),format.raw/*34.54*/("""' 
					data-url='"""),_display_(Seq[Any](/*35.17*/routes/*35.23*/.SensorCategoryController.editSensorCategory())),format.raw/*35.69*/("""' 
				>
				"""),_display_(Seq[Any](/*37.6*/form(routes.SensorCategoryController.deleteSensorCategory())/*37.66*/{_display_(Seq[Any](format.raw/*37.67*/(""" 
					<input
						name="idHolder" class="hidden" type="hidden"
						value=""""),_display_(Seq[Any](/*40.15*/sensorCategory/*40.29*/.getSensorCategoryName())),format.raw/*40.53*/(""""> 
					<input
						type="submit" class="btn btn-danger delete-btn" value="Delete"
						onclick="return confirm('Are you sure you want to delete this item?')">
				""")))})),format.raw/*44.6*/("""
			</td> 
		""")))})),format.raw/*46.4*/("""
	</tr>
	""")))})),format.raw/*48.3*/("""
    </table>
    
     """),_display_(Seq[Any](/*51.7*/if(session.get("email"))/*51.31*/{_display_(Seq[Any](format.raw/*51.32*/("""
	    <h2>Add a new sensor category</h2>
	    
	    """),_display_(Seq[Any](/*54.7*/form(routes.SensorCategoryController.newSensorCategory())/*54.64*/ {_display_(Seq[Any](format.raw/*54.66*/("""
	        
	        """),_display_(Seq[Any](/*56.11*/inputText(
	        	sensorCategoryForm("Name"),
	        	'_label -> "Name * (Please DO NOT contain spaces)"
	        ))),format.raw/*59.11*/("""
	        """),_display_(Seq[Any](/*60.11*/inputText(
	        	sensorCategoryForm("Purpose"),
	        	'_label -> "Purpose"
	        ))),format.raw/*63.11*/(""" 
	
	        <input class="btn" type="submit" value="Create">
	        <a href=""""),_display_(Seq[Any](/*66.20*/routes/*66.26*/.SensorCategoryController.sensorCategories())),format.raw/*66.70*/("""" class="btn">Cancel</a>
	    """)))})),format.raw/*67.7*/("""
	
		<br>
		    
	    """),_display_(Seq[Any](/*71.7*/form(routes.SensorCategoryController.downloadSensorCategory(), 'class -> "form-horizontal", 'role -> "form")/*71.115*/ {_display_(Seq[Any](format.raw/*71.117*/("""
	
	        <button type="submit" name="action" value="download">Download</button>
	    """)))})),format.raw/*74.7*/("""
    """)))})),format.raw/*75.6*/("""
""")))})))}
    }
    
    def render(sensorCategories:List[metadata.SensorCategory],sensorCategoryForm:play.data.Form[metadata.SensorCategory]): play.api.templates.HtmlFormat.Appendable = apply(sensorCategories,sensorCategoryForm)
    
    def f:((List[metadata.SensorCategory],play.data.Form[metadata.SensorCategory]) => play.api.templates.HtmlFormat.Appendable) = (sensorCategories,sensorCategoryForm) => apply(sensorCategories,sensorCategoryForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 18:36:21 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/sensorCategories.scala.html
                    HASH: 283203f8783813a21a5fcffb27291d39a2e36364
                    MATRIX: 848->2|1051->133|1065->140|1149->144|1200->160|1214->166|1275->206|1328->112|1356->131|1383->219|1421->222|1464->256|1504->258|1544->263|1581->278|1632->293|1657->309|1686->316|1875->470|1908->494|1947->495|2005->522|2051->533|2106->572|2146->574|2195->588|2218->602|2264->626|2327->653|2350->667|2396->691|2468->728|2491->742|2526->755|2579->773|2612->797|2651->798|2801->912|2824->926|2870->950|2925->969|2940->975|3008->1021|3057->1035|3126->1095|3165->1096|3280->1175|3303->1189|3349->1213|3548->1381|3593->1395|3634->1405|3694->1430|3727->1454|3766->1455|3854->1508|3920->1565|3960->1567|4017->1588|4159->1708|4206->1719|4321->1812|4438->1893|4453->1899|4519->1943|4581->1974|4639->1997|4757->2105|4798->2107|4918->2196|4955->2202
                    LINES: 26->2|29->6|29->6|31->6|32->7|32->7|32->7|34->2|36->5|37->8|39->10|39->10|39->10|41->12|41->12|43->14|43->14|43->14|48->19|48->19|48->19|50->21|53->24|53->24|53->24|55->26|55->26|55->26|57->28|57->28|57->28|58->29|58->29|58->29|60->31|60->31|60->31|63->34|63->34|63->34|64->35|64->35|64->35|66->37|66->37|66->37|69->40|69->40|69->40|73->44|75->46|77->48|80->51|80->51|80->51|83->54|83->54|83->54|85->56|88->59|89->60|92->63|95->66|95->66|95->66|96->67|100->71|100->71|100->71|103->74|104->75
                    -- GENERATED --
                */
            