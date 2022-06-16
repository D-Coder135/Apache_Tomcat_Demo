package com.example.apache_tomcat_demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TableServlet", value = "/table")
public class TableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("num");

        if (input == null) {
            response.sendRedirect("table.html");
        }

        int num = Integer.parseInt(input);

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();

        output.println("<h3> Table for " + num + ": </h3>");
        for(int  i  = 1; i <= 10; i++) {
            output.printf("%d X %d = %d <br>", num, i, num * i);
        }
        output.close();
    }
}
