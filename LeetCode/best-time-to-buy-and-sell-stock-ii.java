class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int profit = 0;
        while(i<prices.length){
            while(i!=prices.length-1 && prices[i+1]<=prices[i])
                i++;
            int val = prices[i];
            while(i!=prices.length-1 && prices[i+1]>=prices[i])
                i++;
            profit += prices[i]-val;
            i++;
        } 
        return profit;
    }
}