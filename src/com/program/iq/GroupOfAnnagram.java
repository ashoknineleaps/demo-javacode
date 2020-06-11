package com.program.iq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnnagram {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("eat");
		list.add("tea");
		list.add("tan");
		list.add("ate");
		list.add("nat");
		list.add("bat");
		
		System.out.println(findAnagaram(list));
	}

	private static List<List<String>> findAnagaram(List<String> list) {

		Map<Map<Character, Integer>, List<String>> map =  new HashMap<Map<Character,Integer>, List<String>>();
		
		for(String str : list)
		{
			Map<Character, Integer> tempMap = new HashMap<>();
			
			for(int i=0; i<str.length(); i++)
			{
				if(tempMap.containsKey(str.charAt(i)))
				{
					int x = tempMap.get(str.charAt(i));
					
					tempMap.put(str.charAt(i), x++);
				}
				else
				{
					tempMap.put(str.charAt(i), 1);
				}
			}
			
			if(map.containsKey(tempMap))
			{
				map.get(tempMap).add(str);
			}
			else
			{
				List<String> tempList = new ArrayList<>();
				tempList.add(str);
				
				map.put(tempMap, tempList);
			}
			
		}
		
		List<List<String>> result = new ArrayList<>();
		
		for(Map<Character, Integer> tempMP : map.keySet())
		{
			result.add(map.get(tempMP));
		}
		
		return result;
	}
}
