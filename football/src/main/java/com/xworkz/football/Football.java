package com.xworkz.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Football {
	@Value("Puma")
	private String brand;
	@Value("354D")
	private double price;
	private Air air;


	public Football() {
		System.out.println("Default constructor invoked");
	}
    @Autowired
	public Football(Air air) {
		System.out.println("air is invoked");
		this.air = air;
	}

	public Football(String brand) {
		super();
		this.brand = brand;
	}

	public Football(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Football [brand=" + brand + ", price=" + price + ", air=" + air + "]";
	}

	
}
