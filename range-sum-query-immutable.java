class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sums[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left ==0)return sums[right];
        return sums[right]-sums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */