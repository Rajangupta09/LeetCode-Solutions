class Solution {
    public boolean isPalindrome(int x) {
        int newX = x;
        int newY = 0;
        while(newX>0){
            newY = (newY*10) + (newX%10);
            newX /=10;
        }
        if(newY==x)return true;
        return false;
    }
}