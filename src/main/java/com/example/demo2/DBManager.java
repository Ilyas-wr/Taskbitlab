package com.example.demo2;

import java.util.ArrayList;

public class DBManager {

    public static ArrayList<Tasks> tasksList = new ArrayList<>();
    private static Long idCounter = 1L;

    public static void addTask(Tasks task) {
        task.setId(idCounter++);
        tasksList.add(task);
    }

    public static Tasks getTask(Long id) {
        for (Tasks task : tasksList) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public static ArrayList<Tasks> getAllTasks() {
        return tasksList;
    }

    public static void deleteTask(Long id) {
        tasksList.removeIf(task -> task.getId().equals(id));
    }
}
