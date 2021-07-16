class Solution {
    public char findTheDifference(String s, String t) {
        int s1 = 0;
        int s2 = 0;
        for(int i = 0;i<s.length();i++){
            s1+=(int)s.charAt(i);
            s2+=(int)t.charAt(i);
        }
        s2+=(int)t.charAt(t.length()-1);
        return (char)(s2-s1);
    }
}