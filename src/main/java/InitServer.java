 package uptime;
// TEST 
 import java.io.IOException;
 import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Date;
 import javax.servlet.ServletConfig;
 import javax.servlet.ServletContext;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.jsp.JspEngineInfo;
 import javax.servlet.jsp.JspFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
 
 public class InitServer extends HttpServlet
 {
   private static final long serialVersionUID = -3720115042877301162L;
   private String message;
 
   public void init()
     throws ServletException
   {
    System.setProperty("start", new Long(new Date().getTime()).toString());
   }
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException
   {
     response.setContentType("text/html");
 
     PrintWriter out = response.getWriter();
     String x = System.getProperty("start");
     String Node = "Application";
     long milliSeconds = Long.parseLong(x);
     Date start = new Date(milliSeconds);
     Date now = new Date();
					String hostname = System.getProperty("hostname");
 
	    if (hostname == null || hostname.length() == 0)
						hostname = "localhost";
					
     long diff = Math.abs(now.getTime() - start.getTime()) / 1000L;
						
						this.message = "<html>\n";
						this.message += "<head><meta http-equiv=\"refresh\" content=\"2\"></head>\n";
						this.message += "<body>\n";
						this.message += "<iframe id=\"inlineFrameExample\"\n";
						this.message += "    title=\"Inline Frame Example\"\n";
						this.message += "    width=\"500\"\n";
						this.message += "    height=\"380\"\n";
						this.message += "    src=\"http://" + hostname + ":9191/InitServer\">\n";
						this.message += "</iframe>\n";
						this.message += "<iframe id=\"inlineFrameExample\"\n";
						this.message += "    title=\"Inline Frame Example\"\n";
						this.message += "    width=\"500\"\n";
						this.message += "    height=\"380\"\n";
						this.message += "    src=\"http://" + hostname + ":9292/InitServer\">\n";
						this.message += "</iframe>\n";
						this.message += "<iframe id=\"inlineFrameExample\"\n";
						this.message += "    title=\"Inline Frame Example\"\n";
						this.message += "    width=\"500\"\n";
						this.message += "    height=\"380\"\n";
						this.message += "    src=\"http://" + hostname + ":9393/InitServer\">\n";
						this.message += "</iframe>\n";
						this.message += "<iframe id=\"inlineFrameExample\"\n";
						this.message += "    title=\"Inline Frame Example\"\n";
						this.message += "    width=\"500\"\n";
						this.message += "    height=\"380\"\n";
						this.message += "    src=\"http://" + hostname + ":9494/InitServer\">\n";
						this.message += "</iframe>\n";
						this.message += "</body>\n";
						this.message += "</html>\n";
     out.println(this.message);
   }
 
   public void destroy()
   {
   }
 }

