package com.example.linux.Control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
@RequestMapping("/index")
public class HelloControl {
    @RequestMapping("/")
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/a")
    public String helloWorld(){
        return "Hello World";
    }
}
