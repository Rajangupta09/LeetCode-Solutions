package NeetCode.SlidingWindow;
import java.util.*;
public class LongestSubstringwithoutRepeatingCharacters {
    
    static int lengthOfLongestSubString(String s) {
        int n = s.length();
        if (n == 0) return 0;
        Set<Character> st = new HashSet<>();
        int l = 0;
        int result = 0;
        for (int i=0;i<n;i++) {
            char c = s.charAt(i);
            while(st.contains(c) && l < i) {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(c);
            result = Math.max(result, i-l);
        }
        return result+1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubString(" "));
    }
}
