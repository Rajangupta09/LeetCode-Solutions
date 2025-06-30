class Solution {
    public boolean isPowerOfThree(int n) {
        if (n<=0)return false;
        //max 32 bit value is 3^19
        return (1162261467%n==0)?true:false;
    }
}