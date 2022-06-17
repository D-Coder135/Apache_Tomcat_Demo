package com.example.apache_tomcat_demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "print-result", value = "/print-result")
public class PrintResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        Object obj = request.getAttribute("result");
        if (obj != null) {
            double result = Double.parseDouble(obj.toString());
        }
    }
}
