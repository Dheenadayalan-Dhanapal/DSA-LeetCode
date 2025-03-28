class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int stock = 0;
        for(int i = 0; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            stock = Math.max(stock, prices[i] - min);
        }
        
        return stock;
    }
}