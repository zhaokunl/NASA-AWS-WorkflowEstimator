
package views.html.climate

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
object estimate3 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Estimator")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

<ol class="breadcrumb">
	<li><a href="/estimator/tutorial">Tutorial</a></li>
	<li><a href="/estimator">Collect Data</a></li>
	<li><a href="/estimator/1">Input Preference</a></li>
	<li><a href="/estimator/2">Workflow Summary</a></li>
	<li class="active">Recommendation</li>
</ol>



<body>
	
	
	<div class="container">
	<p>Virtual Machine Recommendation</p>
<table cellspacing='0' class="table table-striped table-bordered table-condensed" align="center">
                    <!-- cellspacing='0' is important, must stay -->

                    <!-- Table Header -->
                    <thead>
                        <tr>
                            <th></th>
                            <th>vCPU</th>
                            <th>ECU</th>
                            <th>Memory(GiB)</th>
                            <th>Storage</th>
                            <th>Price</th>
                            <th>Estimated Total Cost</th>
                            <th></th>
                        </tr>
                    </thead>

                    <tbody>
                        
                        <tr class="pure-table-odd">
                            <td>
                                m3.large
                            </td>
                            <td>
                                2
                            </td>
                            <td>
                                6.5
                            </td>
                            <td>
                                7.5
                            </td>
                            <td>
                               1*32 SSD
                            </td>
                            <td>
                            $.225 per hour
                            </td>
                            <td>
                            $88,000
                            </td>
                            <td>
                            <button type="button" class="btn" onclick="" method="get">Use it</button>
                            </td>
                            
                        </tr>


                    </tbody>

                </table>
	
	</div>
	
	<div class="container">
	
	<p><br><br>Other options</p>
<table cellspacing='0' class="table table-striped table-bordered table-condensed" align="center" id="pubvalues">
                    <!-- cellspacing='0' is important, must stay -->

                    <!-- Table Header -->
                    <thead>
                        <tr>
                            <th></th>
                            <th>vCPU</th>
                            <th>ECU</th>
                            <th>Memory(GiB)</th>
                            <th>Storage</th>
                            <th>Price</th>
                            <th>Estimated Total Cost</th>
                            <th></th>
                        </tr>
                    </thead>

                    <tbody>
                        
                        <tr class="pure-table-odd">
                            <td>
                                m3.medium
                            </td>
                            <td>
                                1
                            </td>
                            <td>
                                3
                            </td>
                            <td>
                                3.75
                            </td>
                            <td>
                               1*4 SSD
                            </td>
                            <td>
                            $.113 per hour
                            </td>
                            <td>
                            $68,000
                            </td>
                            <td>
                            <button type="button" class="btn" onclick="" method="get">Use it</button>
                            </td>
                            
                        </tr>


                    </tbody>
                    
                    <tbody>
                        
                        <tr class="pure-table-odd">
                            <td>
                                m3.xlarge
                            </td>
                            <td>
                                4
                            </td>
                            <td>
                                13
                            </td>
                            <td>
                                15
                            </td>
                            <td>
                               4*40 SSD
                            </td>
                            <td>
                            $.450 per hour
                            </td>
                            <td>
                            $128,000
                            </td>
                            <td>
                            <button type="button" class="btn" onclick="" method="get">Use it</button>
                            </td>
                            
                        </tr>


                    </tbody>

                </table>
                 <div class="actions" style="width: 571px; ">
			<input type="submit" class="btn btn-primary"
				value="I still want to check price manually">
		</div>
	
	</div>
			
	
	
</body>
""")))})),format.raw/*171.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:34 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/climate/estimate3.scala.html
                    HASH: e8d85c6c0a22c0fd76b67935d1b1c88114278bc5
                    MATRIX: 883->17|919->19|944->36|983->38|6385->5408
                    LINES: 30->2|31->3|31->3|31->3|199->171
                    -- GENERATED --
                */
            