class Solution {
    
    public char getChar(int val){
      
        return (char) (val+64);
    }
    
    public String convertToTitle(int columnNumber) {
        
        StringBuffer s = new StringBuffer();
        while(columnNumber>0){
            int rem = columnNumber%26;
            if(rem == 0){
                s.append("Z");
                columnNumber = columnNumber/26 - 1;
            }else{
            s.append(getChar(columnNumber%26));
            columnNumber = columnNumber/26;
            }
        }
        s.reverse();
        return s.toString();
    }
    
}