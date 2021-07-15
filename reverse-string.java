class Solution {
    public void swap(int l, int h, char[] s){
        char temp = s[l];
        s[l] = s[h];
        s[h] = temp;
    }
    public void reverseString(char[] s) {
        int l = 0;
        int h= s.length-1;
        while(l<h){
            swap(l,h,s);
            l++;h--;
        }
    }
}