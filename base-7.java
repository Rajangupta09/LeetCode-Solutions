class Solution {
    public String convertToBase7(int num) {
        if(num<7&&num>-7){
            return Integer.toString(num);
        }
        StringBuilder sc = new StringBuilder();
        boolean flag = false;
        if(num<0){
           flag = true; 
            num*=-1;
        }
        while(num>0){
            sc.append(num%7);
            num/=7;
        }
        if(flag)sc.append("-");
        return sc.reverse().toString();
    }
}