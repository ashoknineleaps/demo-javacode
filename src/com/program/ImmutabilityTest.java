package com.program;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ImmutabilityTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("Spring");
		HashMap<String, String> map = new HashMap<>();
		map.put("Zuul", "ZL");
		map.put("Ribban", "RN");
		map.put("Netflix", "NX");
		Address address = new Address(201, "Bangalore", "India");
		
		Employee emp = new Employee(101, "Ashok", new Date(), list, map, address);
		
		System.out.println(emp);
		
		address.setCity("Delhi");
		
		System.out.println(emp);
		
		map.put("test", "test");
		
		System.out.println(emp);
		
		list.add("Lang");
		System.out.println(emp);
	}
}
