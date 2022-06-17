package com.example.apache_tomcat_demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "add-name", value = "/add-name")
public class AddNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String friendName = request.getParameter("friend_name");
        if (friendName == null || friendName.trim().length() == 0) {
            response.sendRedirect("./add-name.html");
            return;
        }

        HttpSession session = request.getSession();
    }
}
