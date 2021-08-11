package com.injamam11;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServletProgram extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var out = resp.getOutputStream();
        out.println("<h1>Hello from first Program-servlet");
        resp.setContentType("text/html");
    }
}
