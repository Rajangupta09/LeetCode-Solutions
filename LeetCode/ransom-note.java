class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[256];
        for(int i = 0;i<magazine.length();i++){
            mag[magazine.charAt(i)]++;
        }
        for(int i = 0;i<ransomNote.length();i++){
            if(mag[ransomNote.charAt(i)] > 0){
                mag[ransomNote.charAt(i)]-=1;
            }else{
                return false;
            }
        }
        return true;
    }
}