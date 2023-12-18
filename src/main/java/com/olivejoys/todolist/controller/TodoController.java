package com.olivejoys.todolist.controller;
//This is a class to create controls of to do list application and has access
// to the web browser
// our web layer

import com.olivejoys.todolist.entity.Task;
import com.olivejoys.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;

    }

//    @GetMapping("/ping")
//    public String ping() {
//        return "pong";
//    }
    //create the todo list and is using the post method
    //also is requesting body
    @PostMapping
    List<Task> create(@RequestBody Task todo) {
        return todoService.create(todo);
    }

    //listing the list
    @GetMapping
    List <Task> list() {

        return todoService.list();

    }

    //updating the list
    @PutMapping
    List<Task> update(@RequestBody Task todo) {
        return todoService.update(todo);

    }


    @DeleteMapping("{id}") //the id is the parameter
    // the value that will be re
    List<Task> delete(@PathVariable Long id) { // id was created in TodoService already
        return todoService.delete(id);


    }
}
