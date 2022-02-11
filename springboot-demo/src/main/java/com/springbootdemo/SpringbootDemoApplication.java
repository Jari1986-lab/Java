package com.springbootdemo;

//import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	applicationContext = SpringApplication.run(SpringbootDemoApplication.class, args);
	SpringComponent component = applicationContext.getBean(SpringComponent.class);
	System.out.println(component);
	//System.out.println("Spring boot hello world");
	}

}
