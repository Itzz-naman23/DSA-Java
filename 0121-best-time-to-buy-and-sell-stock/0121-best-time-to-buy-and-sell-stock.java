class Solution {
    public int maxProfit(int[] prices) {
        
       int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
               int profit = prices[i] - buyPrice;
               maxprofit = Math.max(maxprofit,profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxprofit;
    }
}