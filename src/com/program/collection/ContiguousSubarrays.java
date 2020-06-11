package com.program.collection;

import java.util.HashMap;

public class ContiguousSubarrays {

	public static void main(String[] args) {
		
		int[] arr = {2, 2, 5, 6, 9, 2, 11};
		int m = 2;
		int n = arr.length;
		
		countOfOddInContSubArray(arr, m, n);		
		
		countSubarrays(arr, m, n);
		
		subarraySum(arr, m);
	}

	private static void countSubarrays(int[] arr, int m, int n) {
		
		int count = 0;
		int prifix[] = new int[n];
		int odd = 0;
		
		for(int i=0; i<n; i++)
		{
			prifix[odd]++;
			
			if(arr[i] % 2 != 0)
			{
				odd++;
			}
			
			if(odd >= m)
			{
				count = count + prifix[odd-m];
			}
		}
		
		System.out.println(count);
	}

	private static void countOfOddInContSubArray(int[] arr, int m, int n) {
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			int odd = 0;
			
			for(int j = i; j<n; j++)
			{
				if(arr[j] % 2 == 0)
				{
					odd++;
				}
				
				if(odd == m)
				{
					count++;
				}
			}
		}
				
		System.out.println(count);
	}
	
	public static void subarraySum(int[] nums, int k)
	{
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        
        map.put(0, 1);
      
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
       System.out.println(count);
    }
}
