package NeetCode.Arrays;
import java.util.*;
public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0;i<nums.length;i++) {
            int curr = target - nums[i];
            if (mp.containsKey(curr)){
                return new int[]{mp.get(curr), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3,4,5,6}, 7));
    }
}
