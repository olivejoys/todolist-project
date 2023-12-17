package com.olivejoys.todolist.controller;
//This is a class to create controls of to do list application and has access
// to the web browser
// our web layer

import com.olivejoys.todolist.entity.Todo;
import com.olivejoys.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    @Autowired //it was saying that it could not autowire
    //fixed
    public TodoController(TodoService todoService) { // what is wrong here?
        this.todoService = todoService;
    }

//    @GetMapping("/ping")
//    public String ping() {
//        return "pong";
//    }
    //create the todo list and is using the post method
    //also is requesting body
    @PostMapping
    List<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    //listing the list
    @GetMapping
    List<Todo> list() {
        return todoService.list();

    }

    //updating the list
    @PutMapping
    List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);

    }


    @DeleteMapping("{id}") //the id is the parameter
    // the value that will be re
    List<Todo> delete(@PathVariable Long id) { //i didn't create the id yet that's why it's getting an error
        return todoService.delete(id);

    }
}
