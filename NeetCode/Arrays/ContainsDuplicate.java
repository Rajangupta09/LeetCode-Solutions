package NeetCode.Arrays;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

class ContainsDuplicate {

    static boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        st.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return st.size()!= nums.length;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1,2,3,3}));
    }

}