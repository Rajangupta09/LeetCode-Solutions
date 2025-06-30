class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
                if(st.size()==0)return false;
                char temp = st.pop();  
                if((s.charAt(i) == '}' && temp == '{' ) || ( s.charAt(i) == ']' && temp == '[' ) || (s.charAt(i) == ')' && temp == '(' )){
                    continue;
                }else{
                    return false;
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        if(st.size() == 0)return true;
        return false;
    }
}