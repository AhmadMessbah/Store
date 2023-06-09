package ir.store.controller.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

//@WebFilter(urlPatterns = "/dashboard")
public class PanelFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(servletRequest.getRemoteAddr());
        System.out.println(((HttpServletRequest)servletRequest).getSession().getId());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
