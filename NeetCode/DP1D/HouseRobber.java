package NeetCode.DP1D;

import java.util.Arrays;

public class HouseRobber {
    public static int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1); 
        return Math.max(solve(nums, n-1, dp), solve(nums, n-2, dp));
    }

    static int solve(int[] nums, int n, int[] dp) {
        if (n<0) {
            return 0;
        }
        if (dp[n]!=-1) return dp[n];
        int take = nums[n] + solve(nums, n-2, dp);
        int notTake = 0 + solve(nums, n-1, dp);
        return dp[n] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,1,3,3}));
    }
}
