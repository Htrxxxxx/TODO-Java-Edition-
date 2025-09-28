package com.example.todo.Model;
import com.example.todo.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
  // default JPA methods are enough for CRUD
}