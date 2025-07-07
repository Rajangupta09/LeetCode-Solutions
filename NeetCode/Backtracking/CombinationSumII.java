package NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
       public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, target, result, new ArrayList<>());
        return result;
    }

    static void solve(int[] nums, int i, int target, List<List<Integer>> result, List<Integer> curr) {
    
        if (target == 0) {
            result.add(new ArrayList<>(curr));   
            return;
        }
        if (target < 0 || i == nums.length) return;
    
    
        
        curr.add(nums[i]);
        solve(nums, i+1, target-nums[i], result, curr);
        curr.remove(curr.size()-1);
        
        while(i+1<nums.length && nums[i] == nums[i+1]) i++;

        solve(nums, i+1, target,result, curr);

    }
    
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{9,2,2,4,6,1,5}, 8));
    }
}
