package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.util.Objects.isNull;


public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        Object logado = session.getAttribute("logado");
        if(isNull(logado)){
            response.sendRedirect("login.jsp");

        }else {
            request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);

        }
    }
}
