package com.xworkz.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.xworkz.book.config.BeanConfi;
import com.xworkz.book.dao.ConnectionConfi;
@Component
public class BookRunner {

	public static void main(String[] args) {
		
	//ApplicationContext context = new ClassPathXmlApplicationContext("contextconf.xml");//using xml container
		//Book book = context.getBean(Book.class);
		// book.toString();
		//System.out.println(context);
//Annotation based configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfi.class);
		System.out.println("bean created");
		Book book = context.getBean(Book.class);
		book.toString();
		ConnectionConfi confi = context.getBean(ConnectionConfi.class);
		String string = confi.toString();
		System.out.println(string);
		ClassPathXmlApplicationContext c=(ClassPathXmlApplicationContext)context;
	
		
	}

}
