class Solution {
    public int majorityElement(int[] nums) {
        int count = 1; 
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == nums[ind])
                count++;
            else
                count--;
            if(count == 0){
                ind = i;
                count = 1;
            }
            
        }
        return nums[ind];
    }
}