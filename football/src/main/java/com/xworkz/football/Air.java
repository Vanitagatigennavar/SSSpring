package com.xworkz.football;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Air {
	@Value("35")
	 int a;

	public Air() {
		System.out.println(this.getClass().getSimpleName() +"air is created");
	}

	@Override
	public String toString() {
		return "Air [a=" + a + "]";
	}
	
	

}
