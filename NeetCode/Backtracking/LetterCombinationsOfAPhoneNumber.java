package NeetCode.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    
    static List<String> letterCombinations(String digits) {
        String[] letters = new String[10];
        letters[0] = "";
        letters[1] = "";
        letters[2] = "abc";
        letters[3] = "def";
        letters[4] = "ghi";
        letters[5] = "jkl";
        letters[6] = "mno";
        letters[7] = "pqrs";
        letters[8] = "tuv";
        letters[9] = "wxyz";

        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack(digits, letters, result, 0, "");
        return result;
    }

    static void backtrack(String digits, String[] letters, List<String> result, int i, String curr){
        if (curr.length() == digits.length()) {
            result.add(curr);
            return;
        }
        String chars = letters[digits.charAt(i) - '0'];
        for (char c : chars.toCharArray()) {
            backtrack(digits, letters, result, i+1, curr+c);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(letterCombinations("9"));
    }
}
