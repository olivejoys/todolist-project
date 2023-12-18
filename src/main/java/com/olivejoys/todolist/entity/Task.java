package com.olivejoys.todolist.entity;

import java.util.Objects;

public class Task {
    private Long id;
    private String name;
    private String description;
    private boolean status;
    private int priority;

    public Task() {
    }

    public Task(Long id, String name, String description,
                boolean status, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name='" + name + '\'' + "," +
                " description='" + description + '\'' + ", status=" + status +
                ", priority=" + priority + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return isStatus() == task.isStatus() && getPriority()
                == task.getPriority() && getId().equals(task.getId())
                && getName().equals(task.getName())
                && getDescription().equals(task.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(),
                getDescription(), isStatus(), getPriority());
    }
}
