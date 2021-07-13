class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m = s.length();
        int n = t.length();

        Boolean[] marked = new Boolean[256];
        Arrays.fill(marked, Boolean.FALSE);
        int[] map = new int[256];
        Arrays.fill(map, -1);
        for (int i = 0; i < n; i++)
        {
            if (map[s.charAt(i)] == -1)
            {
                if (marked[t.charAt(i)] == true)
                    return false;
                marked[t.charAt(i)] = true;
                map[s.charAt(i)] = t.charAt(i);
            }
            else if (map[s.charAt(i)] != t.charAt(i))
            return false;
        }
 
        return true;
    }
}