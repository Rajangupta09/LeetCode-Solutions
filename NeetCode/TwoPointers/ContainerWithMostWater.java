package NeetCode.TwoPointers;

public class ContainerWithMostWater {
   
    public static int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int result = 0;    
        while(l<r) {
            if (heights[l]<heights[r]){
                result = Math.max(result, heights[l] * (r-l));
                l++;
            } else {
                result = Math.max(result, heights[r] * (r-l));
                r--;    
            }
        }
        return result;
    }      
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }
}
