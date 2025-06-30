class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder s = new StringBuilder();
        int index = 0;
        if (strs.length<1)
            return "";
        while(index < strs[0].length()){
            char c = strs[0].charAt(index);
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()==index || c != strs[i].charAt(index))
                    return s.toString();
            }
            s.append(strs[0].charAt(index));
            index +=1;
        }
        return s.toString();
    }
}