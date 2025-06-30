class Solution {
//     Memoization
    // public int lcs(String s1, String s2, int m, int n, int[][] memo){
    //     if(memo[m][n] != -1)return memo[m][n];
    //     if(m==0||n==0)memo[m][n] = 0;
    //     else if(s1.charAt(m-1) == s2.charAt(n-1))memo[m][n] = 1 + lcs(s1, s2, m-1,n-1, memo);
    //     else memo[m][n] = Math.max(lcs(s1,s2,m-1,n, memo), lcs(s1,s2,m,n-1, memo));
    //     return memo[m][n];
    // }
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m = text1.length(),n = text2.length();
    //     int[][] memo = new int[m+1][n+1];
    //     for(int[] row: memo){
    //         Arrays.fill(row,-1);
    //     }
    //     return lcs(text1, text2, m, n, memo);
    // }
//     Tabulation
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] tab = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1))tab[i][j] = 1+tab[i-1][j-1];
                else tab[i][j] = Math.max(tab[i-1][j], tab[i][j-1]);
            } 
        }
        return tab[m][n];
    }

}