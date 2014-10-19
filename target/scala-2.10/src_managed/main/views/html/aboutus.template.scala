
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
object aboutus extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

   <h1>About Us</h1>
   	<div class="jumbotron">
   <h3><strong>Project Overview</strong></h3>
   <p>Sensor Data Platform is a platform to display sensor data in CMU-SV's sensor networks and an integration of many platforms like Virtual Sensor Editor, Mobile Sensor Platforms</p>
   <h3><strong>Current Contributors</strong></h3>
   <p>Lyman Cao		<a href="http://www.linkedin.com/in/lymancao">LinkedIn</a></p>
   <p>Ting Yu 	<a href="http://www.linkedin.com/pub/ting-yu/6a/76a/50b/">LinkedIn</a></p>
   <h3><strong>Other Contributors</strong></h3>
   <p>Bo Liu: build API interface for CMUSV Sensor Data and Service Platform</p>
   <p><a href="http://www.linkedin.com/pub/bo-liu/20/a60/111">LinkedIn</a></p>
   <p><a href="https://github.com/cmusv-sc/ArchF2013-Project2-FT#23">Current API: API v1.3</a></p>
   <p><a href="https://github.com/SensorServicePlatform/APIs/tree/v1.1">Previous API: API v1.1</a></p>
   <p>Chris Lee: maintain einstein<p>
   <p>Xueqiao Xu: virtual sensor editor<p>
   <h3><strong>Advisors</strong></h3>
   <p>Jia Zhang		<a href="http://www.andrew.cmu.edu/user/jiaz/">Personal Website</a></p>
   <p>Bob Iannucci		<a href="http://works.bepress.com/bob/">Personal Websitee</a></p> 
   <h3><strong>Previous Contributors</strong></h3>
   <p>Arie Radilla Laureano</p> 
   <p>Isil Demir</p> 
   <p>Yazhisai Gowthaman</p> 
   <p>Anubhav Aeron</p>
   <p>Geetima Rai</p>
   <p>Gonghan Wang</p> 
   

   <h3><strong>Publications</strong></h3>
   <b>2014</b>
   <p>1. J. Zhang, C. Lee, S. Xiao, P. Votava, T.J. Lee, R. Nemani and I. Foster, "A Community-Driven Workflow Recommendations and Reuse Infrastructure", accepted by The 8th IEEE International Symposium on Service-Oriented System Engineering (SOSE 2014).</p>
   <p>2. J. Zhang, D. Kuc, and S. Lu, "Confucius: A Tool Supporting Collaborative Scientific Workflow Composition", IEEE Transactions on Services Computing (TSC), 7(1), Jan.-Mar, 2014.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-Confucius-TSC.pdf">[pdf]</a></p>
   <b>2013</b>
   <p>3. J. Zhang, Z. Li, O. Sandoval, N. Xin, Y. Ren, B. Iannucci, M. Griss, S. Rosernberg, R.A. Martin, J. Cao, A. Rowe, "Supporting Personizable Virtual Internet of Things", in Proceedings of The 10th IEEE International Conference on Ubiquitous Intelligence and Computing (UIC-2013), Dec. 18-20, 2013, Vietri sul Mare, Italy.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-VirtualSensorEditor.pdf">[pdf]</a></p>
   <p>4. J. Zhang, N. Radia, Z. Li, N. Xin, Y. Ren, P. Sachdeva, P. Subramanyam, S. Hu, S. Luan, L. Lee, B. Xing, D. Li, J. Cao, T. Selker, B. Iannucci, M. Griss, A. Rowe, "An Infrastructure Supporting Considerate Sensor Service Provisioning", in Proceedings of the 6th IEEE International Conference on Service Oriented Computing and Applications (SOCA 2013), Dec. 16-18, 2013, Kauai, HA, USA.<a href="http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-SocialSensors.pdf">[pdf]</a></p>
   <p>5. L.-J. Zhang and J. Zhang, "Service Oriented Solution Modeling and Variation Propagation Analysis based on Architectural Building Blocks", International Journal of Web Services Research (JWSR), 10(4), 2013.</p>
   <p>6. J. Wang, Z. Feng, J. Zhang, P.C.K. Hung, K. He, and L.-J. Zhang, "A Unified RGPS-Based Approach Supporting Service-Oriented Process Customization", accepted as a book chapter in Web Services Foundations, edited by Athman Bouguettaya and Schahram Dustdar, Springer Verlag, pp. 657-682.</p>
   <p>7. J. Zhang, P. Votava, T.J. Lee, S. Adhikarla, I. Kulkumjon, M. Schlau, D. Natesan, R. Nemani, "A Technique of Analyzing Trust Relationships to Facilitate Scientific Service Discovery and Recommendation", in Proceedings of 2013 IEEE 10th International Conference on Services Computing (SCC), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, pp. 57-64. (acceptance rate: 18%)<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-TrustServiceDiscovery.pdf">[pdf]</a></p>
   <p>8. J. Zhang, B. Iannucci, M. Hennessy, K. Gopal, S. Xiao, S. Kumar, D. Pfeffer, B. Aljedia, Y. Ren, M. Griss, S. Rosenberg, J. Cao, A. Rowe, "Sensor Data as a Service - A Federated Platform for Mobile Data-Centric Service Development and Sharing", in Proceedings of 2013 IEEE 10th International Conference on Services Computing (SCC), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, pp. 446-453.<a href="http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-SensorServicePlatform.pdf">[pdf]</a></p>
   <p>9. J. Zhang, P. Votava, T.J. Lee, O. Chu, C. Li, D. Liu, K. Liu, N. Xin, R. Nemani, "Bridging VisTrails Scientific Workflow Management System to High Performance Computing", IEEE 2013 7th International Workshop on Scientific Workflows (SWF), in Proceedings of 2013 IEEE 9th World Congress on Services (SERVICES), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, pp. 29-36.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-VisTrails-HECC.pdf">[pdf]</a></p>
   <p>10. B. Plale, M.R. Lyu, J. Zhang (Eds.), 2013 IEEE 20th International Conference on Web Services (ICWS), Jun. 27-Jul. 2, 2013, Santa Clara, CA, USA, IEEE 2013.</p>
   <p>11. L.-J. Zhang and J. Zhang, "Technical Architecture of Enabling Body of Knowledge System for Effective Learning and Information Dissemination", International Journal of Web Services Research (JWSR), 10(2), 2013, pp. 41-62.<a href = "http://www.andrew.cmu.edu/user/jiaz/Papers/JiaZhang-BoK.pdf">[pdf]</a></p>
   <p>12. I. Bojanova, J. Zhang, J.M. Voas, "Cloud Computing", IEEE IT Professional, 15(2), 2013, pp. 12-14.</p>
</div>
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 18 20:55:31 EDT 2014
                    SOURCE: /Users/zhaokunli/NASA-AWS-WorkflowEstimator/app/views/aboutus.scala.html
                    HASH: 578fa11f8b3621f747db28764fca22dd2146e817
                    MATRIX: 776->1|887->18|926->23|957->46|996->48
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            