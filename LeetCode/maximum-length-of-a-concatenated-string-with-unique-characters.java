class Solution {
    public int getLength(List<String> arr , int i, String s){
        if(i == arr.size()){
            int freq[] = new int[26];
            for(int j=0;j<s.length();j++){
                if(freq[s.charAt(j)-'a'] ==1){
                    return 0;
                }
                freq[s.charAt(j)-'a']++;
            }
            return s.length();
        }
        int op1 = Integer.MIN_VALUE, op2 = op1;
        if(s.length()+arr.get(i).length()<=26)op1 = getLength(arr, i+1, s+arr.get(i));
        op2 = getLength(arr, i+1, s);
        return Math.max(op1, op2);
    }
    public int maxLength(List<String> arr) {
        return getLength(arr,0 , "");
    }
}