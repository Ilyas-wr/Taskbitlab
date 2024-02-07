package com.example.demo2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AddTaskServlet")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String deadlineDate = req.getParameter("deadlineDate");

        // Создание новой задачи
        Tasks task = new Tasks(null, name, description, deadlineDate);
        // Добавление задачи в базу данных
        DBManager.addTask(task);

        // Перенаправление на страницу со списком задач
        resp.sendRedirect("TaskList.jsp");
    }
}
