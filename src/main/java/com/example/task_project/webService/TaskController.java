package com.example.task_project.webService;


import com.example.task_project.bean.Task;
import com.example.task_project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService ;

    @GetMapping("/list")
    public List<Task> getList() {
        return taskService.getList();
    }

    @PostMapping("/add")
    public int addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable int id) {
        return taskService.delete(id);
    }
}
