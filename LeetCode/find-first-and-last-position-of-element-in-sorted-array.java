class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        int[] res = new int[]{-1,-1};
        if(nums.length == 0)return res;
        if(nums.length == 1){
            if(nums[0] == target){
                res[0] = 0;res[1] = 0;
                return res;
            }else{
                return res;
            }
        }
        while(l>=h){
            int mid = l + (h-l)/2;
            if(nums[mid] == target){
                break;
            }
            else if(nums[mid]>target){
                l=mid+1;
            }else{
                h = mid-1;
            }
        }
        
        for(int i = l;i<=h;i++){
            if(nums[i] == target){
                if(res[0] == -1)res[0] = i;
                res[1] = Math.max(res[1],i);
            }
        }
        return res;
    }
}