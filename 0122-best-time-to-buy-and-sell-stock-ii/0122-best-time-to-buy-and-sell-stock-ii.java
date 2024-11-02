class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int result = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i-1] > prices[i]){
                buy = prices[i];
            }
            else{
                profit = Math.max(profit,prices[i] - prices[i-1]);
                result += profit;
                profit = 0;
            }
        }
        return result;
    }
}