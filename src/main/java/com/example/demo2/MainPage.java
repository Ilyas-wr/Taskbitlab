package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
@WebServlet("/")
public class MainPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Items> items = DBManager.getAllItems();
        request.setAttribute("itemList", items);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
