package NeetCode.SlidingWindow;

public class BestTimetoBuyandSellStock {
    
    static int maxProfit(int[] prices) {
        int n = prices.length;
        int result = 0;
        int buy = prices[0];
        for (int i=1;i<n;i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            result = Math.max(prices[i] - buy, result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{10,1,5,6,7,1}));
    }
}
