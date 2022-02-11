package com.example.Jari;

//import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString; 

@Setter 
@Getter
@ToString

    public class Employee {

    private String name;
    
    private Long age;
    
    private String location;

    private String email;

    private String department;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


}
