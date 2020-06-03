package com.program;

import java.util.Arrays;

public class MyHashMap<K, V> {

	private Entry<K, V>[] buckets;
	
	private static final int DEFAULT_CAPACITY = 16;
	
	private int size;
	
	public MyHashMap() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public MyHashMap(int defaultCapacity) {
		this.buckets = new Entry[defaultCapacity];
	}

	public void put(K key, V value)
	{
		Entry<K, V> entry = new Entry<K, V>(key, value, null, 0);
		
		int hash = getHash(key);
		
		entry.setHash(hash);
		int bucket = hash % getDefaultSize();
		
		Entry<K, V> existing = this.buckets[bucket];
		
		if(existing == null)
		{
			this.buckets[bucket] = entry;
			this.size++;
		}
		else
		{
			while(existing.getNext() != null)
			{
				if(existing.getKey().equals(key))
				{
					existing.setValue(value);
					return;
				}
				
				existing = existing.getNext();
			}
			
			if(existing.getKey().equals(key))
			{
				existing.setValue(value);
			}
			else
			{
				existing.setNext(entry);
				this.size++;
			}
		}
	}
	
	private int getDefaultSize() {
		return DEFAULT_CAPACITY;
	}

	private int getHash(K key) {
		
		return key == null ? 0 : key.hashCode() & 0x7fffffff;
	}
	
	public V get(K key)
	{
		Entry<K, V> bucket = this.buckets[getHash(key) % getDefaultSize()];
		
		while(bucket != null)
		{
			if(bucket.getKey().equals(key))
			{
				return bucket.getValue();
			}
			
			bucket = bucket.getNext();
		}
		return null;
	}

	public V remove(K key)
	{
		int index = getHash(key) % getDefaultSize();
		Entry<K, V> bucket = this.buckets[index];
		
		Entry<K, V> prev = null;
		
		while(bucket != null)
		{
			if(bucket.getKey().equals(key))
			{
				break;
			}
			
			prev = bucket;
			bucket = bucket.getNext();
		}
		
		if(bucket == null)
		{
			return null;
		}
		
		this.size--;
		
		if(prev != null)
		{
			prev.setNext(bucket.getNext());
		}
		else
		{
			this.buckets[index] = bucket.getNext();
		}
		
		return bucket.getValue();
	}
	
	public boolean containsKey(K key)
	{
		int hash = getHash(key);
		
		int bucketIndex = hash % getDefaultSize();
		
		Entry<K, V> buckets = this.buckets[bucketIndex];
		
		if(buckets == null)
		{
			return false;
		}
		else
		{
			while(buckets != null)
			{
				if(buckets.getKey().equals(key))
				{
					return true;
				}
				buckets = buckets.getNext();
			}
		}
		return false;
	}
	
	public boolean containsValue(V value)
	{
		Entry<K, V>[] buckets = this.buckets;
		
		if(buckets != null && size > 0)
		{
			for(int i=0; i<buckets.length; i++)
			{
				Entry<K, V> entry = buckets[i];
				
				while(entry != null)
				{
					if(entry.getValue().equals(value))
					{
						return true;
					}
					entry = entry.getNext();
				}
			}
		}
		
		return false;
	}
	
	public void display()
	{
		Arrays.asList(buckets).stream().filter(f -> f != null).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		MyHashMap<String, Integer> map = new MyHashMap<>();
		map.put("Bangalore", 101);
		map.put("Delhi", 201);
		map.put("Delhi", 401);
		map.put("Delhi", 501);
		map.put("Allahabad", 506);
		map.put("Lucknow", 509);
		
		System.out.println("Get: "+"Key: Delhi"+", Value: "+map.get("Delhi"));
		
		System.out.println("Remove: "+"Key: Delhi"+", Value: "+map.remove("Delhi"));
		
		map.display();
		
		System.out.println("Check Key contains: "+map.containsKey("Lucknow"));
		System.out.println("Check Value contains: "+map.containsValue(509));
		
	}
	
}
