package com.apachrscribe.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health")
    public ResponseEntity<String> online() {
        return (new ResponseEntity<String>("Hello World", HttpStatus.OK));
    }

}
