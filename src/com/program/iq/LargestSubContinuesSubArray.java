package com.program.iq;

//Kadanes Algo
public class LargestSubContinuesSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int meh = 0; // Max Ending Here
		int msf = Integer.MIN_VALUE; // Max Far
		
		for(int i=0; i < arr.length; i++)
		{
			meh = meh + arr[i];
			if(meh < arr[i])
			{
				meh = arr[i];
			}
			
			if(msf < meh)
			{
				msf = meh;
			}
		}
		
		System.out.println("Sum of Contunues Sum of sub Array: "+msf);
	}
}
