package com.olivejoys.todolist.repository;

import com.olivejoys.todolist.entity.Task;
import com.olivejoys.todolist.service.TodoService;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<Task, Long> {


}
