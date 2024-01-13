package com.olivejoys.todolist.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table(name = "task")
public class Task {
    @Id //addded notation
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @JsonFormat(pattern="yyyy-MM-dd")

    private LocalDate startDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dueDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate endDate;
    private boolean status;
    private int priority;

    public Task() {
    }

    public Task(String name, String description,
                LocalDate startDate, LocalDate dueDate, LocalDate endDate,
                boolean status, int priority) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.endDate = endDate;
        this.status = status;
        this.priority = priority;
    }


    public Long getId() {
        return id;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", dueDate=" + dueDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", priority=" + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return isStatus() == task.isStatus() && getPriority() ==
                task.getPriority() && Objects.equals(getId(), task.getId())
                && Objects.equals(getName(), task.getName()) &&
                Objects.equals(getDescription(), task.getDescription())
                && Objects.equals(getStartDate(), task.getStartDate()) &&
                Objects.equals(getDueDate(), task.getDueDate()) &&
                Objects.equals(getEndDate(), task.getEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(),
                getStartDate(), getDueDate(), getEndDate(), isStatus(),
                getPriority());
    }
}
