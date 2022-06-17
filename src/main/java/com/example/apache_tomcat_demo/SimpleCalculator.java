package com.example.apache_tomcat_demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SimpleCalculator", value = "/SimpleCalculator")
public class SimpleCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input1 = request.getParameter("num1");
        String input2 = request.getParameter("num2");
        String output = request.getParameter("operator");

        if (input1 == null || input2 == null || output == null) {
            response.sendRedirect("./calculator.html");
            return;
        }

        try {
            double d1 = Double.parseDouble(input1);
            double d2 = Double.parseDouble(input2);

            double result = 0;

        } catch (Exception e) {

        }
    }


}
