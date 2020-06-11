package com.program.iq;

public class MaxStockProfit {

	public static void main(String[] args) {
		
		int[] stockPrice = {1, 2, 3, 4, 5};
		
		int n = stockPrice.length;
		
		int diff = 0;
		
		for(int i=1; i<n; i++)
		{
			if(stockPrice[i] > stockPrice[i-1])
			{
				diff = diff + stockPrice[i] - stockPrice[i-1];
			}
		}
		
		System.out.println(diff);
	}
}
