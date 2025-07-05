package NeetCode.BinarySearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while (l<r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target) return mid;

            if (nums[mid] > target) {
                if (nums[l] > target) {
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            } else {
                if (nums[r] > target) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {3,5,6,0,1,2}, 4));
    }
}
