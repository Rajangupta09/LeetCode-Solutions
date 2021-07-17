class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i=0;i<s.length();i++){
            while(j<t.length() && t.charAt(j)!=s.charAt(i)){
                j++;
            }
            if(j == t.length()){
                if(i!=s.length()-1){
                    return false;
                }else{
                    return (t.charAt(j-1)==s.charAt(i))?true:false;
                }
            }
            j++;
        }
        return true;
    }
}