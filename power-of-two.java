class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<=0)return false;
        int temp = n&(n-1);
        if(temp == 0)return true;
        return false;
    }
}