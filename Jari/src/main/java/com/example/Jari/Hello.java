package com.example.Jari;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    
    @GetMapping("/hello")
    @ResponseBody
    public String home() {
        return "HelloBrowser";
    }

}

//serveri on 8080
//https://www.youtube.com/watch?v=99mxjnzR3Tc