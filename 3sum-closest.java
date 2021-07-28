class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++){
            int l = i+1,r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(diff > Math.abs(target-sum)){
                    diff = Math.min(diff, Math.abs(target-sum));
                    res = sum;
                }
                if(sum==target){
                    return target;
                }
                if(sum>target)r--;
                else l++;
            }
        }
        return res;
    }
}