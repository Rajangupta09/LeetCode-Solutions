package NeetCode.Backtracking;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SubsetsII {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, result, 0, n, new ArrayList<>());
        return result;
    }

    static void solve(int[] nums, List<List<Integer>> result, int i, int n, List<Integer> curr) {
        if (i == n) {
            result.add(new ArrayList<>(curr));
            return;
        }
               
        curr.add(nums[i]);
        solve(nums, result, i+1, n, curr);
        curr.remove(curr.size()-1);
        while ( i + 1 < n && nums[i] == nums[i+1]) {
            i++;
        }
        solve(nums, result, i+1, n, curr);
    }

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,1}));
    }
}
