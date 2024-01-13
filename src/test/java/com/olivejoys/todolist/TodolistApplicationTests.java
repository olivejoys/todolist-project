package com.olivejoys.todolist;

import com.olivejoys.todolist.entity.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.time.LocalDate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTaskSuccess() { // checkiing if  creating a task is working properly or not
		Task task = new Task("task1", "first description",
				LocalDate.now(), LocalDate.now(), LocalDate.now(), true,
				1);
		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(task)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].name").isEqualTo(task.getName())
				.jsonPath("$[0].description").isEqualTo(task.getDescription())
				.jsonPath("$[0].startDate").isEqualTo(task.getStartDate())
				.jsonPath("$[0].dueDate").isEqualTo(task.getDueDate())
				.jsonPath("$[0].endDate").isEqualTo(task.getEndDate())
				.jsonPath("$[0].status").isEqualTo((task.isStatus()))
				.jsonPath("$[0].priority").isEqualTo(task.getPriority());
	}

}














