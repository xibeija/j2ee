import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void init(ServletConfig config) {
		System.out.println("init of Hello Servlet");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String header = headerNames.nextElement();
			String value = request.getHeader(header);
			System.out.printf("%s\t%s%n", header, value);
		}

		try {
			response.setContentType("text/html; charset=UTF-8");
//          response.setCharacterEncoding("UTF-8");
 
			response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("pragma", "no-cache");
			
            PrintWriter pw = response.getWriter();
            pw.println("<h1>第一次 使用 Servlet</h1>");
            
            
			System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
			System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
			System.out.println("请求行中的参数部分: " + request.getQueryString());
			System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
			System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
			System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
			System.out.println("服务器的IP地址: " + request.getLocalAddr());
			System.out.println("服务器的主机名: " + request.getLocalName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
