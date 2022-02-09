package com.example.Jari;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeescontroller {
  
@GetMapping ("/employees")
@ResponseBody
public String getEmployees () {
    //System.out.println("testi");
    return "displying the lis of empoyees";
    }    

//localhost:8080/employees/3
@GetMapping("/employees/{id}")
@ResponseBody
public String getEmployee (@PathVariable("id") Long id) {
    //System.out.println("Fetching the employee details for the id: " +id);
        return "Fetching the employee details for the id: " +id;  

}   

    /*@PostMapping("/employees")
    public String saveEmployee (@RequestBody Employee employee) {
        return "saving the employee details to the database: "+employee;

    }
    */
    //localhost:8080/employees?id=3
     @DeleteMapping("/employees")
    public String deleteEmployee (@RequestParam("id") Long id){
            return "Deleting the employee details for the id: "+id;
    }


}