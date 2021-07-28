class Solution {
    public static String[] values = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void getCombinations(String s, char[] sb, int n, int i, int j, List<String> ls){
        if(i == n){
            ls.add(String.valueOf(sb));
            return;
        }
        int digit = s.charAt(i)-'0';
        for(int m=0;m<values[digit].length();m++){
            sb[j] = values[digit].charAt(m);
            getCombinations(s,sb,n,i+1,j+1,ls);
        }
        return;
    }
    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<String>();
        int n = digits.length();
        if(n==0)return ls;
        char[] sb =new char[n];
        getCombinations(digits,sb, n, 0,0,ls);
        return ls;
    }
}