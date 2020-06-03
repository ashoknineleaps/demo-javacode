package com.program;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class Employee {

	private final int id;
	
	private final String name;
	
	private final Date date;
	
	private final List<String> list;
	
	private final Map<String, String> map;
	
	private final Address address;

	public Employee(int id, String name, Date date, List<String> list, HashMap<String, String> map, Address address) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.list = new ArrayList<>(list);
		Map<String, String> maptemp = new HashMap<>();
		for(Entry<String, String> m : map.entrySet())
		{
			maptemp.put(m.getKey(), m.getValue());
		}
		this.map = maptemp;
		
		this.address = new Address(address.getId(), address.getCity(), address.getCountry());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return new Date(this.date.getTime());
	}

	public List<String> getList() {
		return list;
	}

	public Map<String, String> getMap() {
		
		Map<String, String> m = new HashMap<>();
		for(Entry<String, String> e : this.map.entrySet())
		{
			m.put(e.getKey(), e.getValue());
		}
		return m;
	}

	public Address getAddress() {
		
		Address add = new Address(this.address.getId(), this.address.getCity(), this.address.getCountry());
		
		return add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date=" + date + ", list=" + list + ", map=" + map
				+ ", address=" + address + "]";
	}

	
}
