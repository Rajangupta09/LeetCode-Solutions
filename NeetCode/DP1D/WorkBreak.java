package NeetCode.DP1D;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class WorkBreak {
    
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Set<String> words = new HashSet<>(wordDict);
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(s, words, 0, n, dp);
    }

    public static boolean solve(String s, Set<String> words, int i, int n, int[] dp) {
        if (i >= n){
            return true;
        }
        if (dp[i]!=-1) return dp[i]==1;

        for (int j = i;j<n;j++) {
            if (words.contains(s.substring(i, j+1))) {
                if (solve(s, words, j+1, n, dp)){
                    dp[i] = 1;
                    return true;
                }
            }
        }
        dp[i] = 0;
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(wordBreak("neetcode", List.of("neet", "code")));
    }
}
