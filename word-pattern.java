class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<Character, String>();
        String[] st = s.split(" ");
        if(pattern.length() != st.length) return false;
        for(int i=0;i<pattern.length();i++){
            if(!hm.containsKey(pattern.charAt(i))&& !hm.containsValue(st[i]))
                hm.put(pattern.charAt(i), st[i]);
            else
                if(hm.containsKey(pattern.charAt(i)) && !hm.get(pattern.charAt(i)).equals(st[i]))return false;
                if(!hm.containsKey(pattern.charAt(i)))return false; 
        }
        return true;
    }
}