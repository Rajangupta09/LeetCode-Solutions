class Solution {
    public boolean checkRecord(String s) {
        int absent = 0,late =0;
        for(int i=0;i<s.length();i++){
            
            if(late>0&&s.charAt(i) != 'L')late=0;
            
            if(s.charAt(i) == 'A'){
                absent++;
                if(absent>1)return false;
            }
            else if(s.charAt(i) == 'L')
            {
                late++;
                if(late>2)return false;
            }
        }
        return true;
    }
}