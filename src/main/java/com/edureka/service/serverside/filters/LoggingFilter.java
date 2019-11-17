package com.edureka.service.serverside.filters;


import javax.servlet.*;
import java.io.IOException;

public class LoggingFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //nothing to be done
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("called before executing the method..");
        String username = servletRequest.getParameter("username");
        System.out.println("Username "+ username);
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("**********************************");
        System.out.println("After the method has been executed..");
        System.out.println("**********************************");
        System.out.println("**********************************");

    }

    @Override
    public void destroy() {
            //nothing to be done
    }
}