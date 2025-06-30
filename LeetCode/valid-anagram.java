class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ch = new int[256];
        Arrays.fill(ch, -1);
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]+=1;
            ch[t.charAt(i)]-=1;
        }
        for(int i=0;i<256;i++){
            if(ch[i]!= -1)return false;
        }
        return true;
    }
}