package com.neto.crud_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

        @RequestMapping
        public String hello(){
            return "hello";
        }
}
