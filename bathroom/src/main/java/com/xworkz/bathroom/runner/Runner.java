package com.xworkz.bathroom.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.bathroom.dao.BathroomDAO;
import com.xworkz.bathroom.dao.BathroomDAOImpl;
import com.xworkz.bathroom.entity.BathroomEntity;
import com.xworkz.bathroom.service1.BathroomService;
import com.xworkz.bathroom.service1.BathroomServiceImpl;

public class Runner {

	public static void main(String[] args) {
//		BathroomEntity Entity = new BathroomEntity("indian","banglore","male","public",1000D,,"guru",LocalDate.now(),"raju",LocalDate.now());
		BathroomEntity  entity1=new BathroomEntity();
		entity1.setId(1);
		entity1.setName("vimala");
		entity1.setLocation("manglore");
		entity1.setGender("male");
		entity1.setType("public");
		entity1.setCost(4000D);
		entity1.setDuration(LocalTime.now());
		entity1.setCreatedBy("harish");
		entity1.setCreatedDate(LocalDate.of(2021, 8, 9));
		entity1.setUpdateBy("radha");
		entity1.setUpdateDate(LocalDate.of(2022, 3, 4));
		
		BathroomService dao=new BathroomServiceImpl();
		dao.save(entity1);
		
		
	}
	
		
}
