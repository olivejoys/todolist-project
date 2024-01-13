package com.olivejoys.todolist.service;

import com.olivejoys.todolist.entity.Task;
import com.olivejoys.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
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
      Sort sort = Sort.by("Priority").descending()
                .and(Sort.by("name").ascending());
        return todoRepository.findAll(sort);
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
