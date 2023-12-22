package com.herman87.springsecuritybyamigoscode2023.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleResources {

    @GetMapping("/hello-world")
    public ResponseEntity<String> HelloWorld() {
        return ResponseEntity.ok("Hello world");

    }


    @GetMapping("/good-bye")
    public ResponseEntity<String> goodBye() {
        return ResponseEntity.ok("Happy To See You");
    }
}
