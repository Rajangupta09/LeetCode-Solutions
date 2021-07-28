class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while(i<s.length()){
            int j = 0;
            for(;j<numRows;j++){
                if(i>=s.length())break;
                sb[j].append(s.charAt(i));
                i++;
            }
            if(i==s.length()){
                break;
            }
            for(j = j-2;j>0;j--){
                if(i>=s.length())break;
                sb[j].append(s.charAt(i));
                i++;
            }
        }
        String sc = new String();
        for(int j = 0;j<numRows;j++){
            sc+=sb[j].toString();
        }
        return sc;
    }
}