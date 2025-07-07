package NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        solve(nums, 0, n, result, new ArrayList<>());
        return result;
    }

    static void solve(int[] nums,int i, int n, List<List<Integer>> result, List<Integer> curr) {
        if (i==n) {
            result.add(new ArrayList<>(curr));
            return;
        }
        
        
        curr.add(nums[i]);
        solve(nums, i+1 , n, result, curr);
        curr.remove(curr.size()-1);
    solve(nums, i+1, n, result, curr);
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
