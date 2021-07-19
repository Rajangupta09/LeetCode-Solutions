class Solution {
    public int findComplement(int num) {
        int i = 0, ans = 0;
        while(num>0){
            int temp = num&1;
            num>>=1;
            if(temp ==0)
                ans|=(1<<i);
            i++;
        }
        return ans;
    }
}