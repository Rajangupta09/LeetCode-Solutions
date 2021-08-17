class Solution {
    public int maximumProduct(int[] nums) {
   int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        int thir_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr > max) {
                thir_max = sec_max;
                sec_max = max;
                max = curr;
            } else if (curr > sec_max) {
                thir_max = sec_max;
                sec_max = curr;
            } else if (curr > thir_max) {
                thir_max = curr;
            }

            if (curr < min) {
                sec_min = min;
                min = curr;
            } else if (curr < sec_min) {
                sec_min = curr;
            }
        }
        return Math.max(max * sec_max * thir_max, max * min * sec_min);
    }
}