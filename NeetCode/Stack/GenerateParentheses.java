package NeetCode.Stack;

import java.util.*;
public class GenerateParentheses {
    
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        generate(n, result, "", 0, 0, 0);
        return result;
    }

    public static void generate(int n, List<String> result, String s, int idx, int open, int close) {
        if ( idx >= 2 * n) {
            if (s.length() == 2*n)
                result.add(new String(s));
            return;
        }
        if (open < n) {
            generate(n, result, s + "(", idx+1, open+1, close);
        }
        if (close < open) {
            generate(n, result, s + ")", idx+1, open, close+1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(generateParentheses(3));
    }
}
