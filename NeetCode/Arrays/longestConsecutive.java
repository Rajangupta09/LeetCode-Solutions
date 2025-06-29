package NeetCode.Arrays;

import java.util.*;
public class longestConsecutive {
    
    public static int longestConsecutive(int[] nums) {
        Set<Integer> mp = new HashSet<>();
        int n = nums.length;
        int result = 0;
        for (int num : nums) {
            mp.add(num);
        }
        for (int num:nums) {
            int curr = 1;
            if (!mp.contains(num-1)) {
                for (int i=1;i<n;i++) {
                    if (!mp.contains(num+i)){
                        break;
                    } 
                    curr++;
                }
            }
            result = Math.max(curr, result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,2,5,4,6,1,1}));
    }
}
