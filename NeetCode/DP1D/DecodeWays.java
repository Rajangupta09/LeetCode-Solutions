package NeetCode.DP1D;

import java.util.Arrays;

public class DecodeWays {

    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(s.toCharArray(), 0, n, dp);
    }

    static int solve(char[] nums, int i, int n, int[] dp) {
        if ( i == n) return 1;
        if (nums[i] == '0') return 0;

        if (dp[i] != -1) return dp[i];

        int result = solve(nums, i+1, n, dp);
        if (i < n-1 && (nums[i] == '1' || nums[i] == '2' && nums[i+1] < '7')) {
            result +=  solve(nums, i+2, n, dp);
        }
        return dp[i] = result;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("2611055971756562"));
    }
}
