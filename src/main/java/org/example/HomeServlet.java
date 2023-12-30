package org.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;


public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        Object logado = session.getAttribute("logado");

        if(isNull(logado)){
            response.sendRedirect("login.jsp");

        }else {
            request.getRequestDispatcher("WEB-INF/jsp/home.jsp").forward(request, response);

        }
    }
}
