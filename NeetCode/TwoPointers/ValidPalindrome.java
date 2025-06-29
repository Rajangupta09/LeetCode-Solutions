package NeetCode.TwoPointers;


public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        char[] ch = s.toLowerCase().toCharArray();
        int l = 0, r = s.length()-1;

        while (l<r) {

            while(l<r && !Character.isLetterOrDigit(ch[l]))
                l++;

            while(r>l && !Character.isLetterOrDigit(ch[r]))
                r--;
            
            if (ch[l] != ch[r]){
                return false;
            }
            l++;r--;
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(isPalindrome("Was it a car or a cat I saw?")); 

       
    }    
}