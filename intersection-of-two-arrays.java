class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            if(hs.contains(i)){
                res.add(i);
                hs.remove(i);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}