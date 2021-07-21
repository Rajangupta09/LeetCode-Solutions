class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n];
        lis[0] = 1;
        int l = lis[0];
        for(int i=1;i<n;i++){
            int res = 1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    res = Math.max(lis[j]+1, res);
                }
            }
            lis[i] =res;
            l = Math.max(l, lis[i]);
        }
        return l;
    }
}