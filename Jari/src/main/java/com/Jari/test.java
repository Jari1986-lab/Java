package com.Jari;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {
    
    
        @GetMapping("/test")
        @ResponseBody
        public String home() {
            return "Working";
        }
    
}
