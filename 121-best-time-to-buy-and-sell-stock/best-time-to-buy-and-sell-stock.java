class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int i = 0;
        int j = 1;
        int max = 0;
        while(j < size){
            int profit = prices[j] - prices[i];
            if(profit > max){
                max = profit;
            }
            if(prices[j] < prices[i]){
                i = j;
            }
            j++;
        }
        return max;
    }
}