package com.example.demo; // Указывает, что класс находится в пакете com.example.demo

import java.util.ArrayList; // Импорт аннотаций для обработки HTTP-запросов
import java.util.List; // Импорт класса ArrayList для хранения пользователей

import org.springframework.web.bind.annotation.GetMapping; // Импорт интерфейса List
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Аннотация @RestController указывает, что этот класс является контроллером REST
@RestController
@RequestMapping("/users") // Все методы в этом контроллере будут обрабатывать запросы на путь /users
public class UserController {

    // Объявляем поле users как final, чтобы оно не могло быть переназначено
    // Это список пользователей, который будет хранить имена пользователей
    private final List<String> users = new ArrayList<>(); // Инициализация списка пользователей

    // Метод для получения всех пользователей
    // Аннотация @GetMapping указывает, что этот метод будет обрабатывать GET-запросы на путь /users
    @GetMapping
    public List<String> getAllUsers() {
        // Возвращает список всех пользователей
        return users; // Возвращает текущее состояние списка пользователей
    }

    // Метод для добавления нового пользователя
    // Аннотация @PostMapping указывает, что этот метод будет обрабатывать POST-запросы на путь /users
    @PostMapping
    public void addUser(@RequestBody String user) {
        // Добавляет нового пользователя в список
        // @RequestBody указывает, что данные пользователя будут переданы в теле запроса
        users.add(user); // Добавляет имя пользователя в список
    }
}
