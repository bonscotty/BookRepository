package com.bookrepository.BookRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome")
    public String Welcome(){
     return "Roger tuan";
    }
}
