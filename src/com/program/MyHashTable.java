package com.program;

import java.util.ArrayList;

public class MyHashTable<K, V> {
	
	private static final int INITIAL_CAPACITY = 10;

	private ArrayList<HashNode<K, V>> bucketsArray;
	
	private int numOfBuckets;
	
	private int size;
	
	private final double loadFactor = 0.75;
	
	public MyHashTable() {
		this.bucketsArray = new ArrayList<>();
		this.numOfBuckets = INITIAL_CAPACITY;
		this.size = 0;
		
		for(int i=0; i<numOfBuckets; i++)
		{
			this.bucketsArray.add(null);
		}
	}
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return getSize() == 0;
	}
	
	public void add(K key, V value)
	{
		//Create the New Node
		HashNode<K, V> hashNode = new HashNode<>(key, value, null, 0);
		
		//Get the hash code for Key
		int hash = getHashValue(key);
		
		//set the hash code value in new node object
		hashNode.setHash(hash);
		
		//find the bucket location - it means compute the bucket index using modulo of size
		int bucketIndex = hash % INITIAL_CAPACITY;
		
		//Search the bucket in existing buckets
		HashNode<K, V> bucket = this.bucketsArray.get(bucketIndex);
		
		//check the searched bucket null, then bucket is not there in existing buckets
		if(bucket == null)
		{
			//set the bucket in new node
			hashNode.setNext(bucket);
			//set the bucket(new Hash Node) is exiting bucket location 
			this.bucketsArray.set(bucketIndex, hashNode);
			
			//increase the size
			this.size++;
		}
		else //if bucket is not null then, bucket already existing in buckets
		{
			//loop the bucket with next node
			while(bucket.getNext() != null) 
			{
				//check the given bucket key and coming key is equal or not, if key is same the override the value and return
				if(bucket.getKey().equals(key))
				{
					bucket.setValue(value);
					return;
				}
				bucket = bucket.getNext();
			}
			
			//check the given bucket key and coming key is equal or not, if key is same the override the value and return
			if(bucket.getKey().equals(key))
			{
				bucket.setValue(value);
			}
			else
			{
				//If key is not same then add the new node in existing buckets.
				bucket.setNext(hashNode);
				
				//increase the size
				this.size++;
			}
		}
		
		// If load factor goes beyond threshold, then 
        // double hash table size
		double currentLoadFactor = (1.0*size)/numOfBuckets ;
		
		if(currentLoadFactor >= loadFactor)
		{
			ArrayList<HashNode<K, V>> temp = this.bucketsArray;
			
			this.bucketsArray = new ArrayList<>();
			
			numOfBuckets = numOfBuckets * 2;
			
			size = 0;
			
			for(int i=0; i<numOfBuckets; i++)
			{
				this.bucketsArray.add(null);
			}
			
			for(HashNode<K, V> node : temp)
			{
				while(node != null)
				{
					add(node.getKey(), node.getValue());
					node = node.getNext();
				}
			}
		}
	}
	
	public V get(K key)
	{
		int hash = getHashValue(key);
		
		int bucketIndex = hash % INITIAL_CAPACITY;
		HashNode<K, V> bucket = this.bucketsArray.get(bucketIndex);
		
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
		int hash = getHashValue(key);
		int bucketIndex = hash % INITIAL_CAPACITY;
		
		HashNode<K, V> bucket = this.bucketsArray.get(bucketIndex);
		
		HashNode<K, V> prev = null;
		
		while(bucket != null)
		{
			if(bucket.getKey().equals(key))
			{
				break;
			}
			
			bucket = bucket.getNext();
			prev = bucket;
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
			this.bucketsArray.set(bucketIndex, bucket.getNext());
		}
		
		return bucket.getValue();
	}
	
	private int getHashValue(K key) {
		return key == null ? 0 : key.hashCode() & 0x7fffffff ;
	}

	public static void main(String[] args) {
	
		MyHashTable<String, Integer> hashTable = new MyHashTable<>();
		hashTable.add("Bangalore", 101);
		hashTable.add("Delhi", 102);
		hashTable.add("Lucknow", 103);
		hashTable.add("Allahabad", 105);
		hashTable.add("Mumabi", 104);
		hashTable.add("Hydarabad", 106);
		hashTable.add("Panjab", 107);
		hashTable.add("Chennai", 109);
		hashTable.add("Varansi", 108);
		hashTable.add("Patna", 110);
		hashTable.add("Ballia", 120);
		
		
		hashTable.bucketsArray.stream().filter(f -> f != null).forEach(System.out::println);
		
		System.out.println("=============================================================");
		
		System.out.println("Get: "+"Key: Delhi"+", Value: "+hashTable.get("Delhi"));
		
		System.out.println("Remove: "+"Key: Delhi"+", Value: "+hashTable.remove("Delhi"));
		
		System.out.println("=============================================================");
		
		hashTable.bucketsArray.stream().filter(f -> f != null).forEach(System.out::println);
		
	}
}
