import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("LoginServlet 构造方法 被调用");
	}
	public void init(ServletConfig config) {
        System.out.println("init(ServletConfig)");
    }
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if ("admin".equals(name) && "123".equals(password)) {
            req.getRequestDispatcher("success.html").forward(req, resp);
        }else{
            
        	resp.setStatus(301);
            resp.setHeader("Location", "fail.html");
        	/*resp.sendRedirect("fail.html");*/
        }
		
		/*String html = null;
		if ("admin".equals(name) && "123".equals(password)) {
			html = "<div style='color:green'>登录成功</div>";
		} else {
			html = "<div style='color:red'>登录失败</div>";
		}
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.println(html);*/
		
		System.out.println("name:"+name);
		System.out.println("password:"+password);
	}
	
}
