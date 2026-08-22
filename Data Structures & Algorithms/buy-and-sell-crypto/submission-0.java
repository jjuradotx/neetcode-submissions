class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxPrice = prices[0];
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int tempProfit = prices[i] - minPrice;

            if (tempProfit > profit) {
                profit = tempProfit;
                maxPrice = prices[i];
            } else if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return profit;
    }
}
