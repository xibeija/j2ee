package filter;
  
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
  
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
public class AuthFilter implements Filter {
  
    @Override
    public void destroy() {
  
    }
  
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
  
        String uri = request.getRequestURI();
         
        //如果访问的资源是以css或者js结尾的，那么就不需要判断是否登录
        if (uri.endsWith(".css") || uri.endsWith(".js")) {
            chain.doFilter(request, response);
            return;        
        }
         
        if (uri.endsWith("login.html") || uri.endsWith("login")) {
            chain.doFilter(request, response);
            return;
        }
         
        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("login.html");
            return;
        }
  
        chain.doFilter(request, response);
    }
  
    @Override
    public void init(FilterConfig arg0) throws ServletException {
  
    }
  
}