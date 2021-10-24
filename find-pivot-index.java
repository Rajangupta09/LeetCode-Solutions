class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            prefixSum[i] = sum;
        }
        for(int i=0;i<nums.length;i++){
            int lSum = i>0?prefixSum[i-1]:0;
            if(lSum == prefixSum[nums.length-1]-prefixSum[i])
                return i;
        }
        return -1;
    }
}