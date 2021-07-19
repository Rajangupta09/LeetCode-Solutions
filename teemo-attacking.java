class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int dur = 0,res = 0;
        for(int i:timeSeries){
            if(i<=dur){
                res -= dur-i;
                
            }
            dur = i+duration;
            res+=duration;
        }
        return res;
    }
}