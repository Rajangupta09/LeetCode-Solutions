class Solution {
    public void getPermute(int[] nums, int i, List<List<Integer>> ls){
        if(i==nums.length){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j:nums){
                arr.add(j);
            }
            if(!ls.contains(arr))ls.add(arr);
            return;
        }
        for(int j = i;j<nums.length;j++){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            getPermute(nums, i+1, ls);
            
            int temp2 = nums[j];
            nums[j] = nums[i];
            nums[i] = temp2;
        }
        return;
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        getPermute(nums,0,ls);
        return ls;
    
    }
}