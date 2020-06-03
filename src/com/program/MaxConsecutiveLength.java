package com.program;

public class MaxConsecutiveLength {

	public static void main(String[] args) {
		
		int[] arr = {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
		System.out.println(getMaxLength(arr, arr.length-1));
	}

	private static int getMaxLength(int[] arr, int n) {
		
		int count = 0;
		int result = 0;
		
		for(int i=0; i < n ; i++)
		{
			if(arr[i] == 0)
			{
				count = 0;
			}
			else if(arr[i] == 1)
			{
				count++;
				result = Math.max(result, count);
			}
		}
		
		return result;
	}
}
