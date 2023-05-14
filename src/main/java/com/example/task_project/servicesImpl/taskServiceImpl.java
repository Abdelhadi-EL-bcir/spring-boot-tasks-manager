package com.example.task_project.servicesImpl;

import com.example.task_project.bean.Task;
import com.example.task_project.repository.TaskRepository;
import com.example.task_project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class taskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository ;

    @Override
    public List<Task> getList() {
        return taskRepository.findAll();
    }

    @Override
    public int addTask(Task task) {
        taskRepository.save(task);
        return 1;
    }

    @Override
    public int delete(int id) {
        taskRepository.deleteById(id);
        return  1;
    }
}
