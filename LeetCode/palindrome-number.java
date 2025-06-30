class Solution {
    public boolean isPalindrome(int x) {
        if (x< 0)
            return false;
        int rev = 0;
        while(x>rev){
            int pop = x%10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if (rev == x)
            return true;
        else 
            return false;
    }
}