package CrackYourPlacementDay2;

public class BestTimeToBuyandSellStoke {
    public static class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }

            int minP = Integer.MAX_VALUE;
            int maxP = 0;

            for (int i = 0; i < prices.length; i++) {
                // Update the minimum price encountered so far
                minP = Math.min(minP, prices[i]);
                // Calculate the profit if selling at the current price
                int curP = prices[i] - minP;
                // Update the maximum profit encountered so far
                maxP = Math.max(maxP, curP);
            }

            return maxP;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + solution.maxProfit(prices2)); // Output: 0
    }
}
