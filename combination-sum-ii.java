class Solution {
    public void getCombinations(int[] nums, int i, int target, List<Integer> res, List<List<Integer>> ls){
        if(target == 0){
            if(!ls.contains(res)){
                ls.add(new ArrayList<Integer>(res));
            }
            return;
        }
        for(int l = i;l<nums.length;l++){
            if(l>i && nums[l] == nums[l-1])continue;
            if(target<nums[l])break;
            res.add(nums[l]);
            getCombinations(nums, l+1, target-nums[l], res, ls);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        getCombinations(candidates, 0, target, temp, ls);
        return ls;
    }
}