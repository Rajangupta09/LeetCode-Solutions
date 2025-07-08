package NeetCode.DP1D;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        int result = solve(coins, amount, n-1, dp);
        return result == Integer.MAX_VALUE? -1 : result;
    }

    static int solve(int[] coins, int amount, int n, int[][] dp) {
        if (amount == 0) return 0;

        if (n < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[n][amount] != -1) return dp[n][amount];
        int notTake = 0 + solve(coins, amount, n-1, dp);
        int take = Integer.MAX_VALUE;
        if (amount - coins[n] >= 0) {
            int curr = solve(coins, amount-coins[n], n, dp);
            if (curr != Integer.MAX_VALUE) {
                take = 1 +curr;
            }
        }
        return dp[n][amount] = Math.min(take,notTake);
    
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,5,10}, 12));
    }
}
