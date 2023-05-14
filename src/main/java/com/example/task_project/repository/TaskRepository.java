package com.example.task_project.repository;

import com.example.task_project.bean.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task , Integer> {

}
