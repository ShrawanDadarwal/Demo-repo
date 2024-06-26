package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<?> getTest() {
        // I am making mock service
        return ResponseEntity.ok("First custom App from Spring boot");
    }
    @PostMapping("/mock")
    public ResponseEntity<?> postData(@RequestBody String content) {
        // I am making mock service
        return ResponseEntity.ok(content);
    }
}
