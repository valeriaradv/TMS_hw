package com.tms;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter
public class CarFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (((HttpServletRequest) request).getMethod().equalsIgnoreCase("GET")) {
            System.out.println(((HttpServletRequest) request).getRequestURL());
            chain.doFilter(request, response);
        }
        String language = ((HttpServletRequest) request).getHeader("Language");
        if (language == null || language.isEmpty()) {
            throw new ServletException("problems with header Language");
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
    }
}
