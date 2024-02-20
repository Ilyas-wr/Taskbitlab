package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class Userpage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException, ServletException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        DBManager userAuth = new DBManager();
        if(userAuth.authenticateUser(email, password)) {
            response.sendRedirect("profile.jsp");
        } else {
            request.setAttribute("errorMessage", "Don't correct email or password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
