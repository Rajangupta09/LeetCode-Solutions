class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i]))
                return true;
            if(hs.size()>k)
                hs.remove(nums[i-k]);
        }
        return false;
    }
}