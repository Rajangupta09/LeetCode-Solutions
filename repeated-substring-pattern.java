class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length(), len = 0, i = 1;
        int[] lps = new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;lps[i] = len;i++;
            }else{
                if(len==0){
                    lps[i] =0;i++;
                }else{
                    len = lps[len-1];
                }
            }
        }
        if(len==0)return false;
        return (n%(n-len)==0)?true:false;
    }
}