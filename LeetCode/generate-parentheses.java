class Solution {
    public void getParenthesis(int n,int i,List<String> ls, char[] ch, int open, int close){
        if(i==(2*n)){
            ls.add(String.valueOf(ch));
            return;
        }
        if(open<n){
            ch[i] = '(';
            getParenthesis(n,i+1,ls,ch, open+1,close);
        }
        if(close<open){
            ch[i] = ')';
            getParenthesis(n,i+1,ls,ch, open, close+1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<String>();
        char[] ch = new char[2*n];
        getParenthesis(n,0,ls,ch,0,0);
        return ls;
    }
}