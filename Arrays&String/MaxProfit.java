//Problem: given an array of prices of stock on ith day return the max profit we can make from that array;
//link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1693792071/?envType=study-plan-v2&envId=top-interview-150
//Source: LeetCode(121)
//Topics: Array
//Diff: Easy nhi hua

public class MaxProfit {
    //Exceeded the Time limit
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                max = Math.max(max, diff);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
