package com.guru.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	private static final Logger log=LoggerFactory.getLogger(Demo.class);
	
	@RequestMapping("home")
	public String serv()
	{
		System.out.println("Project executing");
		log.info("Welcome to cognizant");
		log.warn("Exception can be arise");
		log.debug("Debugging is going on");
		try
		{
			int num=10;
			int num2=0;
			int div=num/num2;
			log.info("Result :"+div);
		}
		catch(ArithmeticException e)
		{
			log.error("ArithmeticExceptoion /zero");
		}
		return "Hello everyone";
	}
}
