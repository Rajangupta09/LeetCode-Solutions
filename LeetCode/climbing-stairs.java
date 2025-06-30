class Solution {
    public int climbStairs(int n) {
        n += 1; 
        int res[] = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= 2 && j <= i; j++)
                res[i] += res[i - j];
        }
        return res[n - 1];
    }
}