class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sm = nums1.length<=nums2.length?nums1:nums2;
        int[] lg = nums1.length>nums2.length?nums1:nums2;
        int n1 = sm.length;
        int n2 = lg.length;
        int begin = 0, end = n1;
        while(begin<=end){
            int i1 = (begin+end)/2;
            int i2 = (n1+n2+1)/2 -i1;
            int min1 = (i1 == n1)?Integer.MAX_VALUE:sm[i1];
            int max1 = (i1 == 0)?Integer.MIN_VALUE:sm[i1-1];
            int min2 = (i2 == n2)?Integer.MAX_VALUE:lg[i2];
            int max2 = (i2 == 0)?Integer.MIN_VALUE:lg[i2-1];
            if(max1<=min2 && max2 <=min1){
                if(((n1+n2) & 1) == 0){
                    return ((double) Math.max(max1,max2) + Math.min(min1,min2))/2;
                }else{
                    return (double)Math.max(max1,max2);
                }
            }else if(max1>min2) end=i1-1;
            else begin = i1+1;
        }
        return 0;
    }
}