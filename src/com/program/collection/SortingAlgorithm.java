package com.program.collection;

import java.util.Arrays;

public class SortingAlgorithm {

	public static void main(String[] args) {
		
		int[] arr = {-1, 1, 2, 3, -2, 4};
		
		sortNegPosSwap(arr);
	}

	private static void sortNegPosSwap(int[] arr) {
		
		System.out.println(Arrays.toString(arr));
		int[] neg = new int[arr.length];
		
		int numNeg = 0;
		int numNegSoFar = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < 0)
			{
				neg[numNeg++] = arr[i];
			}
		}
		
		for(int i=arr.length-1; i>=0; i--)
		{
			if(numNegSoFar != 0 && arr[i] >= 0)
			{
				arr[i + numNegSoFar] = arr[i];
			}
			
			if(arr[i] < 0)
			{
				numNegSoFar++;
			}
		}
		
		for(int i=0; i < numNeg ; i++)
		{
			arr[i] = neg[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}	
	
}	