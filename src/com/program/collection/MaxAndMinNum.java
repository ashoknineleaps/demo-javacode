package com.program.collection;

public class MaxAndMinNum {

	public static void main(String[] args) {
		
		int[] arr = {12, 45, 23, 78, 45, 24, -1};
		
		int l = 0;
		int r = arr.length-1;
		int max = arr[0];
		int min = arr[0];
		while(l < r)
		{
			if(arr[l] >= max)
			{
				max = arr[l];
			}
			else if(arr[l] <= min)
			{
				min = arr[l];
			}
			
			l++;
		}
		
		System.out.println(max+" : "+min);
	}
}
