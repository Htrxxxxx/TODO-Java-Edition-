package com.example.todo.Model;
import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String description ;
    private boolean isDone ;


    public Task() {
    }

    public Task(Long id, String name, String description, boolean isDone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isDone = isDone;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsDone() {
        return this.isDone;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    public Task id(Long id) {
        setId(id);
        return this;
    }

    public Task name(String name) {
        setName(name);
        return this;
    }

    public Task description(String description) {
        setDescription(description);
        return this;
    }

    public Task isDone(boolean isDone) {
        setIsDone(isDone);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", isDone='" + isIsDone() + "'" +
            "}";
    }
    
}
