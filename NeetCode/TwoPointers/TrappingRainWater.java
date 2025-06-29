package NeetCode.TwoPointers;

public class TrappingRainWater {
    public static int trap0(int[] height) {
        int n = height.length;
        if (n < 3) return 0;
        int result = 0;
        int[] lh = new int[n];
        int[] rh = new int[n];
        
        for (int i = 0; i<n;i++) {
            if (i == 0) {
                lh[i]     = height[i];
                rh[n-i-1] = height[n-i-1];
            } else {
                lh[i]     = Math.max(lh[i-1], height[i]);
                rh[n-i-1] = Math.max(rh[n-i], height[n-i-1]);
            }
        }

        for (int i=1;i<n-1;i++) {
            result+= Math.min(lh[i], rh[i]) - height[i];
        }
        return result;
    }

    public static int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int result =0;
        int lMax = 0, rMax = 0;

        while (l <= r) {
            if (height[l] < height[r]) {
                if (lMax < height[l]) {
                    lMax = height[l];
                } else {
                    result += lMax - height[l];
                }
                l++;
            } else {
                if (rMax < height[r]) {
                    rMax = height[r];
                } else {
                    result += rMax - height[r];
                }
                r--;
            }
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,2,0,3,1,0,1,3,2,1}));
    }
}
