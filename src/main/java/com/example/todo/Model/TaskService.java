package com.example.todo.Model;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private TaskRepository repo ;

    public TaskService(TaskRepository repo) {
        this.repo = repo ;
    }

    public void addTask (Task t1) {
        repo.save(t1) ;
    }

    public void deleteTask (Long id) {
        repo.deleteById(id);
    }
    public List<Task> findAll() { return repo.findAll(); }
}
