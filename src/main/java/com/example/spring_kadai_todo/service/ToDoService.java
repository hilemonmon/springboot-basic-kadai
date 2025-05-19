package com.example.spring_kadai_todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_kadai_todo.entity.ToDo;
import com.example.spring_kadai_todo.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository toDoRepository;
	
	// 依存性の注入（DI）を行う（コンストラクタインジェクション）
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
	
 // ToDoの一括取得メソッド
    public List<ToDo> getAllTodos() {
        return toDoRepository.findAll();
    }
}
