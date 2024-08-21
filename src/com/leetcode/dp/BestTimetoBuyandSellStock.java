package com.leetcode.dp;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock
public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {

		int[] prices = {7,6,4,3,1 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int buyingstock = prices[0];
		int currentprofit = 0;
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (buyingstock > prices[i]) {
				buyingstock = prices[i];
			}

			currentprofit = prices[i] - buyingstock;
			maxProfit = Math.max(currentprofit, maxProfit);
		}

		return maxProfit;

	}
}
