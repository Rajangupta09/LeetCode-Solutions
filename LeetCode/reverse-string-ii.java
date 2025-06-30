class Solution {
    public String reverseStr(String s, int k) {
        
        int n = s.length();
        if(n ==1)return s;
        StringBuilder st = new StringBuilder(s);
        if(n<k)k = n;
        for(int i=0;i<n;i=i+2*k){
            int l=i, h=(i+k-1>n)?n-1:i+k-1;
            while(l<h){
                st.setCharAt(l, s.charAt(h));
                st.setCharAt(h, s.charAt(l));
                h--;l++;
            }
            
        }
        return st.toString();
    }
}