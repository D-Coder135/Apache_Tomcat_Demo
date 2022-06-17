package com.example.apache_tomcat_demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "view-names", value = "/view-names")
public class ViewNamesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter output = response.getWriter();

        HttpSession session = request.getSession();
        List<String> names = (List<String>) session.getAttribute("nameList");

        if (names == null || names.size() == 0) {

        }
    }
}
