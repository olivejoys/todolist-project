package com.olivejoys.todolist.service;

import com.olivejoys.todolist.entity.Task;
import com.olivejoys.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//core
@Service
public class TodoService {
    private static TodoRepository todoRepository; // all operations will return
    // a to do list

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    /*public static TodoService TodoService() {
        this.todoRepository = todoRepository;
    } */


    public List<Task> create(Task todo) {
        todoRepository.save(todo);
        return list(); //this will make this method also list
    }


    //Sorting to put this in a high priority of the list
    public  List<Task> list() { //the list doesn't return anything,
        // so it's returning the sort to sort the list
        //in a priority in descending order and the name in ascending
        Task task = new Task();
        task.setId(1L);
        task.setName("Assignment");
        task.setDescription("Bla bla bla");
        task.setPriority(1);
        task.setStatus(false);

        Task task1 = new Task();
        task1.setId(2L);
        task1.setName("Assignment 2");
        task1.setDescription("La la la ");
        task1.setPriority(2);
        task1.setStatus(true);

        List <Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task);

        return taskList;
//      Sort sort = Sort.by("Priority").descending()
//                .and(Sort.by("name").ascending());
//        return todoRepository.findAll(sort);
    }

    public List<Task> update(Task todo) {
        todoRepository.save(todo); // save the update
        return list();

    }


    public List<Task> delete(Long id) {
        todoRepository.deleteById(id); // will delete only by id
        return list();
    }
}
