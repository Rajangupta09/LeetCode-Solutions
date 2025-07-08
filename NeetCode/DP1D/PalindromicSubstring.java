package NeetCode.DP1D;

public class PalindromicSubstring {

    public static int countSubstrings(String s) {
        int n = s.length();
        return solve(s.toCharArray(), 0, n, new StringBuilder());
    }

    static int solve(char[] str, int i, int n, StringBuilder sb) {
        if (i==n) {
            if (sb.length() != 0 && isPalindrome(sb.toString())) {
                return 1;
            } return 0;
        }

        sb.append(str[i]);
        int result = solve(str, i+1, n, sb);
        sb.deleteCharAt(sb.length()-1);
        
        if (sb.length() == 0) {
            result += solve(str, i+1, n, sb);
        }

        return  result;
    }

    static boolean isPalindrome(String s){
        System.out.println(s);
        int r = s.length()-1;
        int l = 0;
        while (l<r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;r--;
        } 
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
}
