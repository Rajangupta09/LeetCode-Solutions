class Solution {
    public void reverse(int[] nums, int l, int r){
        int temp = 0;
        while(l<r){
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;r--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if(n<2||nums==null)return;
        k = k % nums.length;
        reverse(nums,0,n-k-1);reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}