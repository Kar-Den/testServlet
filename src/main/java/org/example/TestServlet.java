package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String[] id = req.getParameterValues("id");
        String path = req.getContextPath();
        String context = getServletContext().getInitParameter("allApp");

        try {
            writer.println("<h2>Hello from HelloServlet</h2>");
            writer.print("<h2>Id:" );
            for (String element: id) writer.println(element);
            writer.println("</h2>");
            writer.println("<h3>путь к текущему приложению " + path + "</h3>");
            writer.println("<h3>парметр контекста для всего приложения allApp " + context + "</h3>");

        } finally {
            writer.close();

        }
    }
}
