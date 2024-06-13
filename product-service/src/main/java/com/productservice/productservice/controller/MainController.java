package com.productservice.productservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class MainController {
    
    @GetMapping("/ok")
    public ResponseEntity<?> testProduct(){
        return ResponseEntity.ok().body("Hit Ke Product");
    }

}
