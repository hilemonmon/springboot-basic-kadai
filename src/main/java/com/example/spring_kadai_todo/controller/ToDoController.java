package com.example.spring_kadai_todo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.spring_kadai_todo.entity.ToDo;
import com.example.spring_kadai_todo.service.ToDoService;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/todos")
    public String todoView(Model model) {
        List<ToDo> todos = toDoService.getAllTodos();
        model.addAttribute("todos", todos); 

        return "todoView"; 
    }
}
