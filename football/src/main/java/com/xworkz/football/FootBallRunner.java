package com.xworkz.football;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootBallRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextconf.xml");
	
		Football football = context.getBean(Football.class);
	
		System.out.println(football.toString());

	}

}
