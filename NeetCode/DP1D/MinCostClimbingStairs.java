package NeetCode.DP1D;

import java.util.Arrays;

public class MinCostClimbingStairs {


    public static int MinCostClimbingStairs0(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return Math.min(solve(cost, 0, n, dp), solve(cost, 1, n, dp));
    }

    static int solve(int[] cost, int i, int n, int[] dp) {
        if (i>=n) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }


        return dp[i] =  cost[i] + Math.min(solve(cost, i+1, n, dp), solve(cost, i+2, n, dp));
    }

    public static void main(String[] args) {
        System.out.println(MinCostClimbingStairs0(new int[]{1,2,3}));
    }
}
