class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = new String();
        int index = 0;
        if (strs.length<1)
            return s;
        while(index < strs[0].length()){
            char c = strs[0].charAt(index);
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()==index || c != strs[i].charAt(index))
                    return s;
            }
            s += strs[0].charAt(index);
            index +=1;
        }
        return s;
    }
}