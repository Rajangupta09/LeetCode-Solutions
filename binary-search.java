class Solution {
    public int bsearch(int[] nums, int l, int r, int target){
        if(l<=r){
         
            int mid = l+(r-l)/2;
            if(nums[mid] == target)return mid;
            else if(target<nums[mid])return bsearch(nums,l,mid-1,target);
            else if(target>nums[mid])return bsearch(nums,mid+1,r,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return bsearch(nums, 0, nums.length-1,target);
    }
}