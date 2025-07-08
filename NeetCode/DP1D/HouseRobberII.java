package NeetCode.DP1D;

import java.util.Arrays;

public class HouseRobberII {

    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int lh = solve(nums, 0, n-2, dp);
        Arrays.fill(dp, -1);
        int rh = solve(nums, 1, n-1, dp);
        return Math.max(lh, rh);
    }

    static int solve(int[] nums, int i, int n, int[] dp) {
        if (i > n) return 0;

        if (dp[i] != -1) return dp[i];
        int take    = nums[i] + solve(nums, i+2, n, dp);
        int notTake = 0 + solve(nums, i+1, n, dp);
        return dp[i] =  Math.max(take, notTake);
    }

    public static void main(String[] args) {
       System.out.println(rob(new int[]{2,9,8,3,6})); 
    }
}
