package com.program;

public class MyHashSet<V> {

	private MyHashMap<V, Object> map;
	
	public MyHashSet() {
		this.map = new MyHashMap<>();
	}
	
	public void add(V value)
	{
		map.put(value, null);
	}
	
	public boolean contains(V value)
	{
		return map.containsKey(value);
	}
	
	public boolean remove(V value)
	{
		Object removeObj = map.remove(value);
		
		return removeObj != null ? true : false;
	}
	
	public void displaySet()
	{
		map.display();
	}
	
	public static void main(String[] args) {
		MyHashSet<String> set = new MyHashSet<>();
		set.add("Ballia");
		set.add("Bangalore");
		set.add("Allahabad");
		set.add("Noida");
		set.add("Bangalore");
		set.add("Delhi");
		
		set.displaySet();
		
		System.out.println("Check Contains: "+set.contains("Noida"));
		
		set.remove("Noida");
		set.displaySet();
	}
}
