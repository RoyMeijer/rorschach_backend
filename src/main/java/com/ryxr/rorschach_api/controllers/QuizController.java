package com.ryxr.rorschach_api.controllers;

import com.ryxr.rorschach_api.models.User;
import com.ryxr.rorschach_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/quiz")
public class QuizController {
    private final UserService userService;

    public QuizController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<User> startQuiz() {
        User user = userService.createUser();
        return ResponseEntity.ok(user);
    }
}
