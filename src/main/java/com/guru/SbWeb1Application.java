package com.guru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbWeb1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext conf=SpringApplication.run(SbWeb1Application.class, args);
	
	}

}
