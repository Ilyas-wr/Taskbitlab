package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/TaskListServlet")
public class TaskListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Tasks> tasksList = DBManager.getAllTasks();

        // Сохранение списка задач в атрибуте запроса
        req.setAttribute("tasksList", tasksList);

        // Перенаправление на страницу со списком задач
        req.getRequestDispatcher("TaskList.jsp").forward(req, resp);
    }
}
