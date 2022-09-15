package com.xworkz.blanket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BlanketRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("contextconf.xml");
		Blanket blanket = context.getBean(Blanket.class);
        System.out.println(blanket.toString());
        
        
	}

}

