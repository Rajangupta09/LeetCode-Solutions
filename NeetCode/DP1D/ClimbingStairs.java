package NeetCode.DP1D;

import java.util.Arrays;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n, dp);
    }

    static int solve(int n, int[] dp) {
        
        if (n < 0) return 0;
        if (n==0) return 1;
        if (dp[n]!=-1) return dp[n];

        return dp[n] =  solve(n-1,dp) + solve(n-2, dp);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
