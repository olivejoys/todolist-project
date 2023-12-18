package com.olivejoys.todolist.repository;

import com.olivejoys.todolist.entity.Task;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TodoRepository {
    public void save(Task todo) {

    }

    public List<Task> findAll(Sort sort) {
        return null;
    }



    public void deleteById(Long id) {
    }
}
