package com.wimdeblauwe.examples.valueobjectswithrestapiuuid.todo.web;

import com.wimdeblauwe.examples.valueobjectswithrestapiuuid.todo.CreateTodoParameters;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTodo(@RequestBody CreateTodoParameters parameters) {
        System.out.println("parameters = " + parameters);
    }
}
