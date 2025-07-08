package NeetCode.DP1D;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        if (n <= 1) return s;
        int resInx = 0;
        int resLength = 0;
        for (int i =0;i<n-1;i++) {
            int l = i, r = i; // pointers
            int currInx = 0;
            int currLength = 0;
            //odd length;
            while (l<n && r >= 0 && charArray[l] == charArray[r]) {
                currInx = r;
                currLength = l-r+1;
                l++;r--;
            }
            if (resLength < currLength) {
                resInx = currInx;
                resLength = currLength;
            }

             //even length;
            l = i; r = i+1;
            while (l<n && r >= 0 && charArray[l] == charArray[r]) {
                currInx = r;
                currLength = l-r+1;
                l++;r--;
            }

            if (resLength < currLength) {
                resInx = currInx;
                resLength = currLength;
            }

        }
        return s.substring(resInx, resInx + resLength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
    }
}
