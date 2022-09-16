package com.xworkz.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BathroomUtil {
	
	private static EntityManagerFactory factory;
	public static EntityManagerFactory getfactory() {
		
		return factory;
		
	}
	static{
		factory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("init emf in static block EMFUTILL");
		
	}

}
