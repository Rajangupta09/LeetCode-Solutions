package NeetCode.SlidingWindow;

public class PermutationInString {
    
    public static boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        
        for (int i = 0;i<n1;i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for (int i=0;i<26;i++) {
            if (s1Count[i] == s2Count[i]){
                matches++;
            }
        }
        
        int l = 0;
        for (int i = n1;i<n2;i++) {
            if (matches == 26) return true;
            int c = s2.charAt(i)-'a';
            s2Count[c]++;
            if (s1Count[c] == s2Count[c]) {
                matches++;
            } else if (s1Count[c] + 1 == s2Count[c]) {
                matches--;
            }

            // sliding the window from start
            int index2 = s2.charAt(l) -'a';
            s2Count[index2]--;
            if (s1Count[index2] == s2Count[index2]) {
                matches++;
            } else if (s1Count[index2] - 1 == s2Count[index2]){
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
    
    
    public static void main(String[] args) {
        System.out.println(checkInclusion("abc", "lecaabee"));
    }
}
