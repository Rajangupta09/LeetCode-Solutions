package NeetCode.Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
               st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (isReverse(c, st.peek())) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    private static boolean isReverse(char c, char t) {
        if ( (c == ')' && t == '(') ||
              (c == '}' && t == '{') ||
              (c == ']' && t == '[' ))  
            return true;

            return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([{]}])"));
    }
}
