class Solution {
//    Tabulation- 
    // public int fib(int n) {
    //     if(n ==0||n==1)return n;
    //     int[] res = new int[n+1];
    //     res[0] = 0;res[1] = 1;
    //     for(int i=2;i<=n;i++)res[i] = res[i-1]+res[i-2];
    //     return res[n];
    // }
//Memoization-
    public int getFib(int n, int[] memo){
        if(n ==0||n==1)memo[n]=n;
        if(memo[n] == -1){
            int res = fib(n-1)+fib(n-2);
            memo[n] = res;
        }
       return memo[n];
    }
    
    public int fib(int n) {
        if(n ==0||n==1)return n;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return getFib(n,memo);
    }
}