class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1)return nums[0];
        int first = nums[0];
        long second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i]>second && nums[i] != first){
                third = second;
                second = nums[i];
            }
            else if(nums[i]>third && nums[i] !=first && nums[i] != second){
                third = nums[i];
            }
        }
        return (third == Long.MIN_VALUE)?first:(int)third;
    }
}