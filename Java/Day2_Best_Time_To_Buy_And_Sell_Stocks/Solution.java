class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int maxprofit=0;
        for(int i=1;i<=prices.length-1;i++){
            int profit=prices[i]-mini;
            mini=Math.min(mini,prices[i]);
            maxprofit=Math.max(profit, maxprofit);
        }
        return maxprofit;
        
    }
}
