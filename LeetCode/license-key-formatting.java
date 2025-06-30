class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder st = new StringBuilder();
        int n = s.length()-1, i = 0;
        while(n>=0){
            if(s.charAt(n)=='-')n-=1;
            else{
                if(i==k){
                    st.append('-');i=0;
                }
                st.append(Character.toUpperCase(s.charAt(n)));n-=1;
                i++;
               
            }
           
            
        }
        return st.reverse().toString();
    }
}