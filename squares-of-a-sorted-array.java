class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i =0,j = n-1,idx =n-1;
        while(i<=j){
            if(Math.abs(nums[i])>nums[j]){
                res[idx] = nums[i]*nums[i]; 
                idx--;i++;
            }else{
                res[idx] = nums[j]*nums[j];
                j--;idx--;
            }
        }
        return res;
    }
}