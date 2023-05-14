package com.example.task_project.service;

import com.example.task_project.bean.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getList();
    public int addTask(Task task);
    public int delete(int id);
}
