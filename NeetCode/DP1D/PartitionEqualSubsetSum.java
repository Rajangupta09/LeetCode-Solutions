package NeetCode.DP1D;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if ((sum & 1) == 1) return false;
        int target = sum/2;
        int[][] dp = new int[n][target+1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solve(nums, n-1, target, dp);
    }

    public static boolean solve(int[] nums, int n, int target, int[][] dp) {
        if (target == 0) return true;
        if (n <= 0) return false;

        if (dp[n][target] != -1) return dp[n][target] == 1;
        boolean result = solve(nums, n-1, target, dp);
        if (nums[n]<= target) {
            result |= solve(nums, n-1, target-nums[n], dp);
        }
        dp[n][target] = result?1:0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1,2,3,4}));
    }
}
