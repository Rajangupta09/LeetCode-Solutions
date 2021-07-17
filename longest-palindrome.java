class Solution {
    public int longestPalindrome(String s) {
        int[] ch = new int[256];
        int res = 0;
        boolean odd = false;
        for(int i = 0;i<s.length();i++){
            ch[s.charAt(i)]+=1;
        }
        for(int i = 0;i<256;i++){
            if(ch[i]!=0){
                if(ch[i]%2==0)res+=ch[i];
                else{
                    while(ch[i]>1){
                        res+=2;
                        ch[i] -=2;
                    }
                    odd = true;
                }
            }
        }
        if(odd)res+=1;
        return res;
    }
}