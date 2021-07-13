public class Solution {
    // you need treat n as an unsigned value
    public int getBit(int n){
        return (n & 1);
    }
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0;i<31;i++){
            res |= getBit(n);
            res <<=1;
            n>>=1;
        }
        res |= getBit(n);
        return res;
    }
}