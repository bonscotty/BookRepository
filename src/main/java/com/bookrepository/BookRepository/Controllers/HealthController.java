package com.bookrepository.BookRepository.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

//purpose: to monitor app health
public class HealthController {

    @GetMapping("/")
    public ResponseEntity<?> ebHealth() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<?> health() {
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
