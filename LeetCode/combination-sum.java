class Solution {
    public void getCombinations(int[] nums, int i, int target, List<Integer> res,int sum, List<List<Integer>> ls){
        if(sum == target){
           
                ls.add(new ArrayList<Integer>(res));
            
            return;
        }
        if(i>=nums.length||sum>target){
            return;
        }
    
        res.add(nums[i]);
        getCombinations(nums, i, target, res,sum+nums[i], ls);
        res.remove(res.size()-1);
        getCombinations(nums, i+1, target, res,sum, ls);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        
        getCombinations(candidates, 0, target, temp, 0, ls);
        return ls;
    }
}