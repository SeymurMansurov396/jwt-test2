package com.seymur.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/vehicles")
public class TestController {


    @GetMapping("/mercedes/")
    public ResponseEntity<?> all() {
        return new ResponseEntity("Mercedes",HttpStatus.OK);
    }



    @GetMapping("/bmw/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
       return new ResponseEntity("BMW",HttpStatus.OK);
    }




}
