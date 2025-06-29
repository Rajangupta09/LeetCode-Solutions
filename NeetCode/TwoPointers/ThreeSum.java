package NeetCode.TwoPointers;

import java.util.*;
public class ThreeSum {
    
public static List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    Arrays.sort(nums);
    Set<List<Integer>> result = new HashSet<>();
    for (int i=0;i<n-2;i++){
        int l = i+1, r = n-1;
        int target = -nums[i];
        if (i >0 && nums[i] == nums[i-1]) continue;
        while (l<r) {
            int sum = nums[l] + nums[r];
            if (sum < target) {
                l++;
            } else if (sum > target) {
                r--;
            } else {
                result.add(List.of(nums[i], nums[l], nums[r]));
                l++;r--;
            }
        }
    }
    return new ArrayList<>(result);
}

public static void main(String[] args) {
    System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
}
}
