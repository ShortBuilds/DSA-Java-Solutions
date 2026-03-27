class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], j=0;
        int maxProfit =0;
        for (int i =0; i<prices.length-1; i++){
            if (buy>prices[i]){
                buy = prices[i];
            }
            j = prices[i+1]-buy;
            if (j>maxProfit)
            maxProfit = j;
        }
        return maxProfit;
    }
}
