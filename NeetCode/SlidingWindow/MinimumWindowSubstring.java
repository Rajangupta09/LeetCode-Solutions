package NeetCode.SlidingWindow;

import java.util.Map;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        Map<Character, Integer> freq = new HashMap();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }
        Map<Character, Integer> match = new HashMap<>();
        int matches = 0;
        int l = 0;
        int result = Integer.MAX_VALUE;
        String str = "";
        for (int r = 0;r<n2;r++) {
            char c = t.charAt(r);
            if (matches == 0 && !match.containsKey(c)) {
                continue;
            }
            if (match.containsKey(c)) {
                match.put(c, match.getOrDefault(c,0)+1);
                while (match.get(c) > freq.get(c)) {
                    match.put(t.charAt(l), match.get(t.charAt(l) -1));
                    l++;
                }
                if (match.get(c) == freq.get(c)) matches++;
            }

            if (matches == n2-1) {
                if (r-l+1 < result) {
                    str = t.substring(l, r);
                }
            }
           
         }
         return str;
    
    }

    public static void main(String[] args) {
        System.out.println(minWindow("OUZODYXAZV", "XYZ"));
    }
}
