package NeetCode.BinarySearch;

public class FindMinimuminRotatedSortedArray {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        if (nums[l] < nums[r]) return nums[l];
        while (l < r) {
            int mid = l + (r-l)/2;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid+1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,6,1,2}));
    }
}
