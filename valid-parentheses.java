class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        if (map.containsKey(s.charAt(0)))
            st.push(s.charAt(0));
        else{
            return false;
        }
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
         
            if(map.containsKey(c)){
                st.push(c);
            }
            else{
                if (st.empty())
                    return false;
                if(map.get(st.peek()) == c)
                    st.pop();
                else
                    return false;
            }   
        }
       if(st.empty()){
           return true;
       }
        else{
            return false;
        }
    }
}