class Solution {
    public int countSegments(String s) {
        if(s.length()<1)return 0;
        int count = 0;
        boolean cont = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                if(cont == false){
                    count++;
                    cont = true;
                }
            }
            else cont = false;
        }
        return count;
    }
}