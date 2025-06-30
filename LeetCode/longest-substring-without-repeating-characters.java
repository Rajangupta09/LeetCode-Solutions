import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int [] visitindex = new int[256];
        Arrays.fill(visitindex, -1);
        int j = 0, res = 0;
        
        for(int i=0;i<n;i++)
        {
            j = Math.max(j,visitindex[s.charAt(i)] + 1);
            res = Math.max(res, i - j + 1);
            visitindex[s.charAt(i)] = i; 
        }
        return res;
    }
}