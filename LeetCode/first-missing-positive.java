class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int j = nums[i];
            nums[i]=0;
            if(j>0){ 
                while(true){
                    if(j<=0 || j>n||j==nums[j-1]){
                        break;
                    }
                    else{
                        int x = nums[j-1];
                        nums[j-1] = j;
                        j = x;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0)return i+1; 
        }
        return n+1;
    }
}