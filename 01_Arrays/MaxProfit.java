import java.util.*;

//  Given an array of stock prices where the i-th element represents the price of the stock on day i, find the maximum profit you can achieve by buying on one day and selling on another day in the future. If no profit can be made, return 0.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {

            // Update minimum price
            minPrice = Math.min(minPrice, prices[i]);

            // Calculate profit if sold today
            int profit = prices[i] - minPrice;

            // Update max profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}