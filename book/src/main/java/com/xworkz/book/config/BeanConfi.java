package com.xworkz.book.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.book.Book;

@Configuration
@ComponentScan(basePackages="com.xworkz.book")
public class BeanConfi {
	@Bean
public PropertyPlaceholderConfigurer createBean() {
	System.out.println("invoked createBean()");
	PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
//	configurer.setLocation("book.properties");
	return configurer;
}
}
