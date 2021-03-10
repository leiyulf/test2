package com.example.linux.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class HtmlControl {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }
}
