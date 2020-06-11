package com.program.iq;

public class HappyNumber {

	public static void main(String[] args) {
		
		int num = 19;
		
		System.out.println(findHappyNum(num));
	}

	private static boolean findHappyNum(int num) {
		
		int count = 6; //check 6 time number should not repeat
		int val = 0;
		int index = 0;
		
		while(count > 1)
		{
			val = 0;
			while(num > 0)
			{
				index = num % 10;
				val = val +index * index;
				num = num / 10;
			}
			
			if(val == 1)
			{
				return true;
			}
			
			num = val;
			count--;
		}
		
		return false;
	}
}
