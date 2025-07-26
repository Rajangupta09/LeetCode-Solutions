package NeetCode.DP1D;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        int prefix = 1, sufix = 1;

        for (int i=0;i<n;i++) {
            prefix = nums[i] * prefix;
            sufix = nums[n-i-1] * sufix;
            result = Math.max(result, Math.max(prefix, sufix)); 
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {1,2,-3,4}));
    }
}