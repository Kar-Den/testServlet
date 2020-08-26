package org.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class ServletStart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("cp1251");
        String context = getServletContext().getInitParameter("allApp");

        ServletConfig config = getServletConfig();
        PrintWriter outWeb = resp.getWriter();

        outWeb.println("<h1>сервлет ServletStart ../star </h1>");
        outWeb.println("<h3>парметр контекста для всего приложения allApp =" + context + "</h3>");
        outWeb.println("<h3>начальные данные текщего сервлета =" + config.getInitParameter("startServlet") + "</h3>");
    }
}
