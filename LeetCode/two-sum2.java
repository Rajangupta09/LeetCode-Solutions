class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return new int[]{hm.get(nums[i]), i};
            }
            hm.put(target-nums[i],i);
        }
        return new int[2];
    }
}