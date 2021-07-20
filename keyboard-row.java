class Solution {
    public String[] findWords(String[] words) {
        String[] st = new String[words.length];
        int[] ch = new int[256];
        String s = "qwertyuiop";
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)] =1;
            ch[s.charAt(i)-32] =1;
        }
        s = "asdfghjkl";
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)] =2;
            ch[s.charAt(i)-32] =2;
        }
        s= "zxcvbnm";
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)] =3;
            ch[s.charAt(i)-32] =3;
        }
        int count =0;
        
        for(String i:words){
            int init = 0;boolean flag = true;
            for(int j = 0;j<i.length();j++){
                if(init == 0)init = ch[i.charAt(j)];
                else if(ch[i.charAt(j)] !=init){
                    flag = false;
                    break;
                }
            }
            if(flag)st[count++] = i;
        }
        
        String[] st2 = new String[count];
        for(int i =0;i<count;i++){
            st2[i] = st[i];
        }
        return st2;
    }
}