import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int k=0;
        for(int i=m;i<nums1.length;i++)
        {
            nums1[m++]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
    }
}