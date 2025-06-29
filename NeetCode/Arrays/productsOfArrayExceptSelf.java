package NeetCode.Arrays;

import java.util.Arrays;

public class productsOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        if (n < 2) return nums;
        int[] lp = new int[n];
        int[] rp = new int[n];

        lp[0] = nums[0];
        rp[n-1] = nums[n-1];

        for (int i = 1;i< n-1;i++) {
            lp[i] = lp[i-1] * nums[i];
            rp[n-i-1] = rp[n-i] * nums[n-i-1];
        }

        int[] result = new int[n];
        result[0] = rp[1];
        result[n-1] = lp[n-2];

        for (int i=1;i<n-1;i++) {
            result[i] = lp[i-1] * rp[i+1];
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,4,6})));
    }
}
