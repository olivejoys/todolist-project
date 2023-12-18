package com.olivejoys.todolist;
import com.olivejoys.todolist.service.TodoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodolistApplication {

	//to solve the @autowire problem I created the Bean to return new method here

//	@Bean
//	public TodoService todoService() {
//		return TodoService.TodoService();
//	}

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);

	}

}
