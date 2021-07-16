class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1)return true;
        long l = 0, r = num;
        while(l<=r){
            long mid = l + (r-l)/2;
            long sum = mid*mid;
         
            if(sum == num)return true;
            
            if(sum<num){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return false;
    }
}