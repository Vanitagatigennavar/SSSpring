package com.xworkz.blanket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("priya")
	String name;

	public User() {
		System.out.println(this.getClass().getSimpleName() + ":user is created");

	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
