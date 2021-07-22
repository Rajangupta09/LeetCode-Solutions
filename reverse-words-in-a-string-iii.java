class Solution {
    public String reverseWords(String s) {
        
        int n = s.length();
        if(n==1)return s;
        StringBuilder st = new StringBuilder(s);
        int i=0;
        for(int j=1;j<n;j++){
            if(s.charAt(j)==' '||j==n-1){
                int l = i,h=j-1;
                if(j==n-1)h=j;
                while(l<h){
                    st.setCharAt(l, s.charAt(h));
                    st.setCharAt(h, s.charAt(l));
                    l++;h--;
                }
                i = j+1;
            }
            
        }
        return st.toString();
        
    }
}