package NeetCode.Backtracking;

import java.util.List;
import java.util.ArrayList;
public class PalindromePartitioning {
    static List<List<String>> patition(String s) {
        List<List<String>> result = new ArrayList<>();

        solve(s, 0, s.length(), result, new ArrayList<>());
        return result;
    }

    static void solve(String s, int i, int n, List<List<String>> result, List<String> curr) {
        if (i>= n) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int j = i;j<n;j++) {
            if (isPalindrome(s, i, j)) {
                curr.add(s.substring(i, j+1));
                solve(s,j+1, n, result, curr);
                curr.remove(curr.size()-1);
            }
        }
    }

    static boolean isPalindrome(String s, int l, int r) {
        while(l<r){
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    
    
    public static void main(String[] args) {
        System.out.println(patition("aab"));
    }
}
