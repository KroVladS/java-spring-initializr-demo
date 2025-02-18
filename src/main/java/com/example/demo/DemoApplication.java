package com.example.demo; // Указывает, что класс находится в пакете com.example.demo

import org.springframework.boot.SpringApplication; // Импорт класса SpringApplication для запуска приложения
import org.springframework.boot.autoconfigure.SpringBootApplication; // Импорт аннотации для автоматической настройки приложения

// Аннотация @SpringBootApplication указывает, что это основной класс приложения и включает в себя все необходимые настройки
@SpringBootApplication
public class DemoApplication {

    // Главный метод, который запускает приложение
    public static void main(String[] args) {
        // Запускает приложение, передавая текущий класс и аргументы командной строки
        SpringApplication.run(DemoApplication.class, args);
    }

}
