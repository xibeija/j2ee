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
            pw.println("<h1>��һ�� ʹ�� Servlet</h1>");
            
            
			System.out.println("�������������ʱ������URL������Э�� ������ �˿�(�����): " + request.getRequestURL());
			System.out.println("����������������Դ�����֣�ȥ����Э���������: " + request.getRequestURI());
			System.out.println("�������еĲ�������: " + request.getQueryString());
			System.out.println("����������ڵĿͻ�����IP��ַ: " + request.getRemoteAddr());
			System.out.println("����������ڵĿͻ�����������: " + request.getRemoteHost());
			System.out.println("����������ڵĿͻ���ʹ�õ�����˿�: " + request.getRemotePort());
			System.out.println("��������IP��ַ: " + request.getLocalAddr());
			System.out.println("��������������: " + request.getLocalName());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
