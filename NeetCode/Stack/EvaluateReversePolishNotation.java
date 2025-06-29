package NeetCode.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            
            if (s.equals("+")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y + x);
            }
            else if (s.equals("-")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y - x);
            }
            else if (s.equals("*")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y * x);
            }
            else if (s.equals("/")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y / x);
            } 
            else {
                st.push(Integer.valueOf(s));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] {"1","2","+","3","*","4","-"}));
    }
}
