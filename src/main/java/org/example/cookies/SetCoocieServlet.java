package org.example.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet ("/setCookie")
public class SetCoocieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie myCookie = new Cookie("myCookie", "Cookie Denis'a");
        myCookie.setMaxAge(24*60*60);
        resp.addCookie(myCookie);

        resp.getWriter().println("куки созданы");
    }
}
