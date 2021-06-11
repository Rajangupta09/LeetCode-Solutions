class Solution {
    public boolean isPal(String str,int l, int r){
        
        if (l>r){
            return true;
        }
        if((str.charAt(l)) != (str.charAt(r))){
            return false;
        }
        
        if(l<r+1){
            return isPal(str, l+1,r-1);
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPal(str, 0, str.length()-1);
    }
}