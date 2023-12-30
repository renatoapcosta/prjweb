package org.example;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.util.Objects.nonNull;

public class IndexFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        Object permissao = session.getAttribute("permissao");
        System.out.println("---------passando pelo filtro INDEX");
        if(nonNull(permissao)) {
            if("index".equals(permissao.toString())){
                System.out.println("--------- filtro INDEX OK");
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                response.sendRedirect("403.jsp");
            }
        } else {
            response.sendRedirect("403.jsp");
        }

    }
}
