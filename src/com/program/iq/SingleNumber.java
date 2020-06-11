package com.program.iq;

public class SingleNumber {

	public static void main(String[] args) {
		
		//one number should be unique
		int[] arr = {2, 2, 1, 4, 1, 5, 4, 5, 9};
		
		int result = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			result ^= arr[i];
		}
		
		System.out.println(result);
	}
}
