class Solution {
    public int myAtoi(String s) {
        long res = 0;
        boolean sign = true;
        s = s.trim();
        if(s==""||s.length() ==0)return 0;
        int j = 0;
        if(s.charAt(0) == '+'||s.charAt(0) == '-'){
            sign = s.charAt(0)=='+';
            j = 1;
        }
        
        for(int i = j;i<s.length();i++){
            if((int)s.charAt(i) > 57||(int)s.charAt(i)<48) break;
            else{
                res =res*10 + (s.charAt(i)-'0');
                if(sign && res>=Integer.MAX_VALUE)    return Integer.MAX_VALUE;
                if(!sign && -res<=Integer.MIN_VALUE)   return Integer.MIN_VALUE;
                }
            }
        return (sign)?(int)res:(int)res*-1;
    }
}