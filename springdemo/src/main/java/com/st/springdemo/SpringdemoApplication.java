package com.st.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication implements CommandLineRunner  {
	@Autowired 
    private Hello hello;
	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        System.out.println( hello.getMessage());		
	}
	
}
