package NeetCode.SlidingWindow;

import java.util.Map;
import java.util.HashMap;
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int l=0;
        int maxFreq = 0;
        int result = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for (int r = 0;r<n;r++) {
            char c = s.charAt(r);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(mp.get(c), maxFreq);
            while ((r-l+1) - maxFreq > k) {
                mp.put(s.charAt(l), mp.get(s.charAt(l))-1);
                l++;
            }
            result = Math.max(result, r-l+1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(characterReplacement("AAABABB", 1));
    }
}
