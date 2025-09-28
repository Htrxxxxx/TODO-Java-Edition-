package com.example.todo.Model;

import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

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
    public Optional<Task> findById(Long id) {
        return repo.findById(id);
    }
}
