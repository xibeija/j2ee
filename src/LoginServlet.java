import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		String html = null;
		if ("admin".equals(name) && "123".equals(password)) {
			html = "<div style='color:green'>µÇÂ¼³É¹¦</div>";
		} else {
			html = "<div style='color:red'>µÇÂ¼Ê§°Ü</div>";
		}
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.println(html);
		
		System.out.println("name:"+name);
		System.out.println("password:"+password);
	}
	
}
