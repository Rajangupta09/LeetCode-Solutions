class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
        }
        return hs.size()>=n/2?n/2:hs.size();
    }
}