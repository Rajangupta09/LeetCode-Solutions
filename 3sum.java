class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++){
            int l = i+1,r = n-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);temp.add(nums[l]);temp.add(nums[r]);
                    if(ls.contains(temp) == false)ls.add(temp);
                }

                if(sum>0)r--;
                else l++;
            }
        }
        return ls;
    
    }
}



