package ir.store.controller.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

//@WebFilter(urlPatterns = "/api/*")
public class ApiFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("API [Remote Address] " + servletRequest.getRemoteAddr() + " [Session ID] " + ((HttpServletRequest) servletRequest).getSession().getId());
//        if (SessionManager.validateHttpSession(((HttpServletRequest) servletRequest).getSession())) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        }else {
//            if (servletResponse instanceof HttpServletResponse) {
//                HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//                httpServletResponse
//                        .setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            }
//        }
    }
}