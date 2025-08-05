package NeetCode.DP1D;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        
        Arrays.fill(dp, -1);
        int LIS = 1;
        for (int i=0;i<nums.length;i++) {
            LIS = Math.max(LIS, dfs(nums, i, dp));
        }
        return LIS;
    }
    
    public static int dfs(int[] nums, int i, int[] dp){
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];

        int LIS = 1;
        for (int j=i+1;j<nums.length;j++) {
            if (nums[i] < nums[j]) {
                LIS =  Math.max(LIS, 1+ dfs(nums, j, dp));
            }
        }
        dp[i] = LIS;
        return LIS;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{9,1,4,2,3,3,7}));
    }
}
