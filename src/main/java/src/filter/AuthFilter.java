package src.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        out.println("before auth");
        filterChain.doFilter(servletRequest,servletResponse);
        out.println("after auth");

    }

    public void destroy() {

    }
}
