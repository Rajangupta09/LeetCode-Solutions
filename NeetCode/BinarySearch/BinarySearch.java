package NeetCode.BinarySearch;

public class BinarySearch {
    
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<=r) {
            int mid = l + (r-l)/2;
            if (nums[mid] > target) {
                r = mid-1;
            } else if (nums[mid] < target) {
                l = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,2,4,6,8}, 4));
    }
}
