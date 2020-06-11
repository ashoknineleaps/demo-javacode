package com.program.iq;

public class MaxStockProfitDP {

	public static void main(String[] args) {
		
		int[] stockPrice = {7, 1, 5, 3, 6, 4};
		
		int n = stockPrice.length;
		
		System.out.println(maxProfit(stockPrice, n));
	}

	private static int maxProfit(int[] stockPrice, int n) {
		
		if(stockPrice == null || stockPrice.length < 2)
		{
			return 0;
		}
		
		int[] left = new int[n];
		int[] right = new int[n];
		
		left[0] = 0;
		int min = stockPrice[0];
		
		for(int i=1; i<n; i++)
		{
			min = Math.min(min, stockPrice[i]);
			left[i] = Math.max(left[i-1], stockPrice[i] - min);
		}
		
		right[n-1] = 0;
		int max = stockPrice[n-1];
		
		for(int i=n-2; i>=0; i--)
		{
			max = Math.max(max,  stockPrice[i]);
			right[i] = Math.max(right[i+1], max - stockPrice[i]);
		}
		
		int profit = 0;
		
		for(int i=0; i<n; i++)
		{
			profit = Math.max(profit, left[i] + right[i]);
		}
		return profit;
	}
}
