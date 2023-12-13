package com.example.FirstSpringProgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@Scope(value="prototype")
public class FirstSpringProgramApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringProgramApplication.class, args);
		Alien a = context.getBean(Alien.class);
		Laptop laptop = context.getBean(Laptop.class);
		laptop.setId(1);
			laptop.setBrand("Lenovo");
			a.setAid(1);
			a.setAname("ABC");
			a.setLaptop(laptop);
			a.setTech("newTech");
		System.out.println(a);
	}
}
