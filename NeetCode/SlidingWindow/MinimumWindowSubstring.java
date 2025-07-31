package NeetCode.SlidingWindow;

import java.util.Map;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {          
        int n1 = s.length();
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> match = new HashMap<>();

        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }
        int n2 = freq.size();
        
        int matches = 0;
        int l = 0;
        int result = Integer.MAX_VALUE;
        int[] res = new int[]{-1,-1};
        
        for (int r = 0;r<n1;r++) {
            char c = s.charAt(r);
            match.put(c, match.getOrDefault(c,0) + 1);
        
            if (freq.containsKey(c) && freq.get(c) == match.get(c)) {
                matches++;
            }

            while (matches == n2) {
                if (r-l+1 < result) {
                    result = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }

                char c1 = s.charAt(l);
                match.put(c1, match.get(c1) -1);
                if (freq.containsKey(c1) && match.get(c1) < freq.get(c1)){
                    matches--;
                }
                l++;
            }
        }
        return result != Integer.MAX_VALUE ? s.substring(res[0], res[1]+1) : "";
    
    }

    public static void main(String[] args) {
        System.out.println(minWindow("OUZODYXAZV", "XYZ"));
    }
}
