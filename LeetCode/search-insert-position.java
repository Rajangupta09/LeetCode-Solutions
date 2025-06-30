class Solution {
    public int bsearch(int[] nums, int target, int l, int r){
        int mid = l + (r-l) / 2;
        System.out.println(mid+ " " + l + " " + r);
        if(r>=l){
            if (nums[mid] == target)
                return mid;
            if(target > nums[mid])
                return bsearch(nums, target, mid + 1, r);
            else
                return bsearch(nums, target, l, mid-1);

        }
        return l;
    }
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        return bsearch(nums, target, 0, l-1);
    }
}