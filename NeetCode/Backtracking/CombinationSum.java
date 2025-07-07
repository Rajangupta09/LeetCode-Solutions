package NeetCode.Backtracking;

import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
    
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, target, result, new ArrayList<>());
        return result;
    }

    static void solve(int[] nums, int i, int target, List<List<Integer>> result, List<Integer> curr) {
        if (i == nums.length) {
            if (target == 0) {
                result.add(new ArrayList<>(curr));
            }
            return;
        }
    
        solve(nums, i+1, target,result, curr);
        if (target - nums[i] >=0) {
            curr.add(nums[i]);
            solve(nums, i, target-nums[i], result, curr);
            curr.remove(curr.size()-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{3,4,5}, 16));
    }
}
