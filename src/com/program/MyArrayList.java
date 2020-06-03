package com.program;

import java.util.Arrays;

public class MyArrayList {

	private Object[] array;
	private static final int INITIAL_CAPACITY = 10;
	private int size;
	private int index;
	private int length;
	
	public MyArrayList()
	{
		this.array = new Object[INITIAL_CAPACITY];
		this.size = INITIAL_CAPACITY;
		this.length = 0;
	}
	
	public void add(Object data)
	{
		System.out.println("Index: "+index+", Size: "+this.size+", Data Size: "+this.length);
		
		if(this.index == this.size-1)
		{
			System.out.println("Index: "+index+", Now Size is Equal to Index: "+(this.size-1)+", Data Size: "+this.length);
			System.out.println("Increase the Array Size");
			//increase the memory
			increaseSizeAndReallocate();
		}
		
		this.array[this.index] = data;
		this.index++;
		length++;
	}

	private void increaseSizeAndReallocate() {
		this.size = ((this.array.length * 3)/2) + 1;
		
		Object[] newObj = new Object[this.size];
		
		for(int i=0; i<this.array.length; i++)
		{
			newObj[i] = this.array[i];
		}
		
		this.array = newObj;
		
		System.out.println("***Index: "+index+", Size: "+this.size+", Data Size: "+this.array.length);
	}
	
	public Object get(int index)
	{
		if(index > this.index-1)
		{
			throw new ArrayIndexOutOfBoundsException("Index value not valid");
		}
		
		if(index < 0)
		{
			throw new ArrayIndexOutOfBoundsException("Negative Value");
		}
		
		return this.array[index];
	}
	
	public void remove(int index)
	{
		if(index > this.index-1)
		{
			throw new ArrayIndexOutOfBoundsException("Index value not valid");
		}
		
		if(index < 0)
		{
			throw new ArrayIndexOutOfBoundsException("Negative Value");
		}
		
		System.out.println("Object Getting Removed: "+this.array[index]);
		
		for(int i=index; i<this.array.length-1; i++)
		{
			this.array[i] = this.array[i+1];
		}
		this.index--;
		this.length--;
	}
	
	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(70);
		list.add(60);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		
		System.out.println(Arrays.toString(list.array));
		
		System.out.println(list.get(10));
		
		list.remove(2);
		
		System.out.println(Arrays.toString(list.array));
		
		list.add(120);
		list.add(140);
		list.add(130);
		
		System.out.println(Arrays.toString(list.array));
		
	}

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + ", size=" + size + ", index=" + index + "]";
	}
	
	
}
