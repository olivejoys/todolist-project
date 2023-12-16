package com.olivejoys.todolist.controller;
//This is a class to create controlls of to do list application and has access
// to the web browser

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
