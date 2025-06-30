class Solution {
    public void swap(int[] nums,int i, int j){
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
        return;
    }
    public void sortColors(int[] nums) {
        int l =0,n=nums.length, r=n-1,mid = 0;
        while(mid<=r){
            if(nums[mid] == 0){
                swap(nums,l,mid);
                l++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,r,mid);
                r--;
            }
        }
    }
}