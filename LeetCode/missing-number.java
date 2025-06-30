class Solution {
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(i != nums[i]&&nums[i]<nums.length){
                swap(i,nums[i], nums);
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(i!=nums[i])return i;
        }
        return nums.length;
    }
}