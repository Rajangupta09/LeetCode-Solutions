package NeetCode.Arrays;

public class validAnagram {
  
  public static boolean isAnagram(String s, String t) {
    // can use map? char -> freq(int) or int[26] -> constant time O(N) + O(N)space
    // can sort both string O(Nlog(N) + O(N) for comparision)
    
    int[] arr = new int[26];

    for (char c : s.toCharArray()) {
        arr[c-'a']++;
    }

    for (char c : t.toCharArray()) {
        int idx = c - 'a';
        arr[idx]--;
    }

    for (int i = 0;i<26;i++) {
        if (arr[i] != 0) return false;
    }
    return true;
  }

    public static void main(String[] args) {
        System.out.println(isAnagram("jar", "jam"));
        System.out.println(isAnagram("racecar", "carrace"));
  }  
}
