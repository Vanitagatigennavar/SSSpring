package com.xworkz.blanket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Blanket {

	private String name;
	private String type;
	private String color;
	private double price;
	private User user;

	public Blanket() {

		System.out.println(" default constructor");

	}

	@Value("${blanketname}")
	public void setName(String name) {
		this.name = name;
	}

	@Value("Cotton")
	public void setType(String type) {
		this.type = type;
	}

	@Value("violet")
	public void setColor(String color) {
		this.color = color;
	}

	@Value("5000D")
	public void setPrice(double price) {
		this.price = price;
	}

	@Autowired
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Blanket [name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + ", user=" + user
				+ "]";
	}

}
