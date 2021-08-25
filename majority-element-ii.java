class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = nums[0], e1c = 1, e2 = 0, e2c = 0;
        for(int i=1;i<nums.length;i++){
            if(e1 == nums[i]){
                e1c++;
            }else if(e2 == nums[i]){
                e2c++;
            }else if(e1c == 0){
                e1 = nums[i];
                e1c++;
            }else if(e2c == 0){
                e2 = nums[i];
                e2c++;
            }else{
                e1c--;
                e2c--;
            }
        }
        List<Integer> ls = new ArrayList<Integer>();
        e1c = 0;
        e2c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == e1)e1c++;
            if(nums[i]==e2)e2c++;
        }
        if(e1c>nums.length/3)ls.add(e1);
        if(e2c>nums.length/3 && e1!=e2)ls.add(e2);
        return ls;
    }
}