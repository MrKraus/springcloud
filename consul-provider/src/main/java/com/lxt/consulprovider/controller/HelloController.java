package com.lxt.consulprovider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String hello(){
        return "hello consul!";
    }
}
