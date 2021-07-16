class Solution {
    public int firstUniqChar(String s) {
        int[] fi = new int[256];
        Arrays.fill(fi,-1);
        int  res = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(fi[s.charAt(i)] == -1) fi[s.charAt(i)] = i;
            else{
                fi[s.charAt(i)] = -2;
            }
        }
        for(int i = 0;i<256;i++){
            if(fi[i] >=0){
                res = Math.min(res, fi[i]);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}