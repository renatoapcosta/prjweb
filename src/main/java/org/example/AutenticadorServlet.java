package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.util.Objects.isNull;


public class AutenticadorServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String user = request.getParameter("user");
        String password = request.getParameter("pass");



        if (isNull(user) || isNull(password) || user.trim().isEmpty() || password.trim().isEmpty()) {
            String path =  "/login.jsp";
            System.out.println("-------------------" + path);
            request.getRequestDispatcher(path).forward(request, response);
        } else {
            if("ma".equals(user) && "123".equals(password) ){
                HttpSession session = request.getSession(true);
                System.out.println("id sessão" + session.getId());
                session.setAttribute("permissao", "sobre");
                session.setAttribute("logado","true");
                request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
            }else if("mi".equals(user) && "321".equals(password) ){
                HttpSession session = request.getSession(true);
                System.out.println("id sessão" + session.getId());
                session.setAttribute("permissao", "index");
                session.setAttribute("logado","true");
                request.getRequestDispatcher("/WEB-INF/jsp/home.jsp").forward(request, response);
            }else {
                String path =  "/login.jsp";
                request.getRequestDispatcher(path).forward(request, response);
            }

        }
    }
}
