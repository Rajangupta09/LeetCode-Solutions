class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i =0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l = j+1,r = n-1;
                while(l<r){
                    int sum = nums[j]+nums[i]+nums[l]+nums[r];
                    if(sum==target){
                        List<Integer> ls = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                    
                        if(res.contains(ls)==false){
                            res.add(ls);
                        }
                         r--;l++;
                    }
                    else if(sum>target)r--;
                    else l++;
                }
            }
        }
        return res;
    }
}