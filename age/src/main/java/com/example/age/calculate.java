package com.example.age;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculateplus {
   
    //@GetMapping("/calculate")
    @RequestMapping(value = "/calculate", method = RequestMethod.POST) 
    @ResponseBody
    public  BigDecimal (Age) {


    }    



    
}
