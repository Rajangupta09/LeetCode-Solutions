class Solution {
    public void swap(StringBuilder st, int left, int right){
        char temp = st.charAt(left);
        st.setCharAt(left,st.charAt(right));
        st.setCharAt(right, temp);
    }
    public boolean getVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder st = new StringBuilder(s);
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && getVowel(s.charAt(left))==false){
                left++;
            }
            while(right>left && getVowel(s.charAt(right))==false){
                right--;
            }
            swap(st,left,right);
            left++;
            right--;
        }
        return st.toString();
    }
}