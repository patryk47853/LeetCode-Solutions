public class Solution {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        System.out.println(maxProfit(prices)); // should return 5
        System.out.println(maxProfit(prices2)); // should return 0
    }

    public static int maxProfit(int[] prices) {

        int buyValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++) {
            if(prices[i] < buyValue) {
                buyValue = prices[i];
            } else if (prices[i] - buyValue > maxProfit ) {
                maxProfit = prices[i] - buyValue;
            }
        }

        return maxProfit;
    }
}