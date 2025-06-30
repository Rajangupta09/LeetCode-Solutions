class Solution {
    public int lengthOfLastWord(String s) {
        String s1=s.trim();
int l=s1.lastIndexOf(' ');
int n=s1.length();
if(n==1)
return 1;
if(l==n)
return 0;
else
{
String[] parts = s1.split(" ");
String lastWord = parts[parts.length - 1];
return lastWord.length();
}
    }
}