class Solution {
    public int maxSubArray(int[] nums) {
        int sum= nums[0];
        int tempsum = 0;
        for (int i=0;i<nums.length;i++){
            tempsum += nums[i];
            if (tempsum>sum)
                sum = tempsum;
            if(tempsum<0){
                tempsum = 0;
            }
        }
        return sum;
    }
}