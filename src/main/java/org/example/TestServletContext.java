package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet ("/test2")
public class TestServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("cp1251");
        String context = getServletContext().getInitParameter("allApp");

        PrintWriter writer = resp.getWriter();
        writer.println("<h2>сервлет TestServletContext /test2 </h2>");
        writer.println("<h3>парметр контекста для всего приложения allApp " + context + "</h3>");
    }
}
