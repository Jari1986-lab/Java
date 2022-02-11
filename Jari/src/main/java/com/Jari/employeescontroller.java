package com.Jari;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class employeescontroller {
    

        @Value("$(app.name)")
        private String  appName;
        
        @Value("$(app.version)")
        private String  appVersion;
    
        @GetMapping("/version")
        public String getAppDetails(){
            return appName+"-" +appVersion;  
        }
    
    @GetMapping ("/employees")
    @ResponseBody
    public String getEmployees () {
        //System.out.println("testi");
        return "displying the list of empoyees";
        }    
    
    
    @GetMapping("/employees/{id}")
    @ResponseBody
    public String getEmployee (@PathVariable("id") Long id) {
        //System.out.println("Fetching the employee details for the id: " +id);
            return "Fetching the employee details for the id: " +id;  
    
    }   
    
        @PostMapping("/employees")
        public String saveEmployee (@RequestBody Employee employee) {
            return "saving the employee details to the database: "+employee;
    
        }
        
    
        @PutMapping ("/employees/{id}")
        public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee){
            System.out.println ("updating the employee data for the id: "+id);   
            return employee;
        }
        
        
    
         @DeleteMapping("/employees")
        public String deleteEmployee (@RequestParam("id") Long id){
                return "Deleting the employee details for the id: "+id;
        }
    
        
    }
    

