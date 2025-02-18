package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping; // Импорт аннотации для обработки GET-запросов
import org.springframework.web.bind.annotation.RestController; // Импорт аннотации для определения контроллера REST

// Аннотация @RestController указывает, что этот класс является контроллером REST
@RestController
public class HomeController {

    // Аннотация @GetMapping указывает, что этот метод будет обрабатывать GET-запросы на корневой путь "/"
    @GetMapping("/")
    public String home() {
        // Возвращает строку, которая будет отображена пользователю
        return "Добро пожаловать в демо приложение!";
    }
}
