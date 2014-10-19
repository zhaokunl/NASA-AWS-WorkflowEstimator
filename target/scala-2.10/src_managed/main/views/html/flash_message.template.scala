
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
object flash_message extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/if(flash.containsKey("error"))/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
        
        <div class="alert alert-danger">
                <strong>Oops!</strong> """),_display_(Seq[Any](/*7.41*/flash/*7.46*/.get("error"))),format.raw/*7.59*/("""
                <a class="close" data-dismiss="alert">x</a>
        </div>
        
""")))})),format.raw/*11.2*/("""

"""),_display_(Seq[Any](/*13.2*/if(flash.containsKey("success"))/*13.34*/ {_display_(Seq[Any](format.raw/*13.36*/("""
        
        <div class="alert alert-success">
                """),_display_(Seq[Any](/*16.18*/flash/*16.23*/.get("success"))),format.raw/*16.38*/("""
                <a class="close" data-dismiss="alert">x</a>
        </div>
        
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:33 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/flash_message.scala.html
                    HASH: 3145d5690c60f6c5b45a5a6f61f3362debaa8223
                    MATRIX: 879->18|915->20|953->50|992->52|1118->143|1131->148|1165->161|1282->247|1320->250|1361->282|1401->284|1506->353|1520->358|1557->373|1674->459
                    LINES: 30->3|31->4|31->4|31->4|34->7|34->7|34->7|38->11|40->13|40->13|40->13|43->16|43->16|43->16|47->20
                    -- GENERATED --
                */
            