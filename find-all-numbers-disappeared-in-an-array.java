class Solution {
    public void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                while(i+1!=nums[i] && nums[i] != nums[nums[i]-1])
                    swap(nums, i,nums[i]-1);
            }
        }
        for(int i=0;i<nums.length;i++){
         
            if(i+1!=nums[i])ls.add(i+1);
        }
        return  ls;
    }
}