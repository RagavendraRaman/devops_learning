package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sample")
@Controller
public class DemoController {

    @GetMapping("/print")
    public ResponseEntity print(){
        return new ResponseEntity("Successfull", HttpStatus.OK);
    }
}
