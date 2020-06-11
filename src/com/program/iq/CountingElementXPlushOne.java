package com.program.iq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingElementXPlushOne {

	static int  count = 0;
	
	public static void main(String[] args) {
		
		int[] a = {0, 1, 2, 5, 3, 3};
		
		usingMap(a);
		
		Arrays.sort(a);
		
		int count = 0;
		
		int right = 1;
		int left = 0;
		int n = a.length;
		
		while(right < n)
		{
			if(a[left] == a[right])
			{
				right = right + 1;
			}
			
			else if(a[left] + 1 == a[right])
			{
				count = count + (right - left);
				left = right;
				right = right + 1;
			}
			else
			{
				left = right;
				right = right + 1;
			}
		}
		
		System.out.println(count);
	}

	private static void usingMap(int[] a) {
		
		
		int n = a.length;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<n; i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			//if(map.containsKey(e.getKey()))
			//{
				if(map.containsKey(e.getKey() + 1))
				count++;
			//}
		}
		
		System.out.println(count);
	}
	
}
