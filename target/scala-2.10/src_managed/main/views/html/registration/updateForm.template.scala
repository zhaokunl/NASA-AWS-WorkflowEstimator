
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
object updateForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[NasaRegistration],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[NasaRegistration]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.36*/("""
"""),_display_(Seq[Any](/*4.2*/main("Nasa Update Form")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""



    <div class="clearfix  " id="name_field">
       
                    
    <legend>User Update Form</legend>
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.NasaRegistrationController.update())/*12.70*/{_display_(Seq[Any](format.raw/*12.71*/("""
    <fieldset>
    """),_display_(Seq[Any](/*14.6*/helper/*14.12*/.inputText(userForm("userNameField"),'_label -> "User Name*"))),format.raw/*14.73*/("""
    """),_display_(Seq[Any](/*15.6*/helper/*15.12*/.inputPassword(userForm("passwordField"), '_label -> "Password*"))),format.raw/*15.77*/("""
    """),_display_(Seq[Any](/*16.6*/helper/*16.12*/.inputText(userForm("fNameField"), '_label -> "First Name*"))),format.raw/*16.72*/("""
    """),_display_(Seq[Any](/*17.6*/helper/*17.12*/.inputText(userForm("mNameField"), '_label -> "Middle Name"))),format.raw/*17.72*/("""
    """),_display_(Seq[Any](/*18.6*/helper/*18.12*/.inputText(userForm("lNameField"), '_label -> "Last Name"))),format.raw/*18.70*/("""

    """),_display_(Seq[Any](/*20.6*/textarea(
                userForm("affliationField"), 
                '_label -> "Affliation", 'cols -> 50, 'rows -> 5
            ))),format.raw/*23.14*/("""
    """),_display_(Seq[Any](/*24.6*/helper/*24.12*/.inputText(userForm("emailField"), '_label -> "Email"))),format.raw/*24.66*/("""
    """),_display_(Seq[Any](/*25.6*/helper/*25.12*/.inputText(userForm("rAreaField"),  '_label -> "Research Area"))),format.raw/*25.75*/("""
    """),_display_(Seq[Any](/*26.6*/textarea(
                userForm("goalField"), 
                '_label -> "Goal", 'cols -> 50, 'rows -> 5
            ))),format.raw/*29.14*/("""
    """),_display_(Seq[Any](/*30.6*/helper/*30.12*/.inputText(userForm("algoField"), '_label -> "Algo"))),format.raw/*30.64*/("""
        """),_display_(Seq[Any](/*31.10*/textarea(
                userForm("bConcernsField"), 
                '_label -> "Budget Concerns", 'cols -> 50, 'rows -> 5
            ))),format.raw/*34.14*/("""
    
    """),_display_(Seq[Any](/*36.6*/select(
                userForm("awsFamiliarityField"), 
                options = options(NasaAWSFamiliarity.list),
                '_default -> "--- AWS Familiarity ---",
                '_label -> "AWS Familarity",
                '_error -> userForm("profile.country").error.map(_.withMessage("Please select your country"))
            ))),format.raw/*42.14*/("""
    <input type="submit" class="btn btn-primary" value="Update">
    <fieldset>
    </div>
""")))})),format.raw/*46.2*/("""
""")))})),format.raw/*47.2*/("""

"""))}
    }
    
    def render(userForm:Form[NasaRegistration]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[NasaRegistration]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 18:36:22 EDT 2014
                    SOURCE: /Users/zhaokunli/Downloads/ArchF2013-Project3-FT-master/app/views/registration/updateForm.scala.html
                    HASH: 344e3cef43d28cca991533e6776df6d0a0e9dc72
                    MATRIX: 808->1|986->35|1022->88|1054->112|1092->113|1248->234|1263->240|1330->298|1369->299|1425->320|1440->326|1523->387|1564->393|1579->399|1666->464|1707->470|1722->476|1804->536|1845->542|1860->548|1942->608|1983->614|1998->620|2078->678|2120->685|2276->819|2317->825|2332->831|2408->885|2449->891|2464->897|2549->960|2590->966|2734->1088|2775->1094|2790->1100|2864->1152|2910->1162|3070->1300|3116->1311|3480->1653|3604->1746|3637->1748
                    LINES: 26->1|32->1|33->4|33->4|33->4|41->12|41->12|41->12|41->12|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|49->20|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|58->29|59->30|59->30|59->30|60->31|63->34|65->36|71->42|75->46|76->47
                    -- GENERATED --
                */
            