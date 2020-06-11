package com.program.iq;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 3, 12};
		
		int left = 0;
		int right = 0;
		int n = arr.length;
		int temp = 0;
		
		System.out.println(Arrays.toString(arr));
		while(right < n)
		{
			//skip if 0
			if(arr[right] == 0)
			{
				right++;
			}
			else
			{
				temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				
				right++;
				left++;
				
//				arr[right] = arr[right] + arr[left];
//				arr[left] = arr[right] - arr[left];
//				arr[right] = arr[right] - arr[left];
//				right++;
//				left++;
				
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
