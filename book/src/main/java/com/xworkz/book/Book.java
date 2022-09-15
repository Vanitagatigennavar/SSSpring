package com.xworkz.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Value("${bn}")
	private String brand;
	@Value("${color}")
	private String color;
	
	private double price;

	public Book() {
		System.out.println("constructor invoked");
	}

	public Book(String brand, String color, double price) {

		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

}
