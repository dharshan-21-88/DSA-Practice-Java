//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stocks {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    } 
    static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){
                min = prices[i];
            }
            profit = prices[i] - min;

            if(profit>max){
                max = profit;
            }
        }
        return max;
    }
}
