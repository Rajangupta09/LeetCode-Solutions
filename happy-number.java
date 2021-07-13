class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n==7) return true;
        int temp=0;
        while(n>9){
            temp = 0;
            while(n>0){
                temp += (n%10)*(n%10);
                n /=10;
            }
            if(temp == 7) return true;
            n = temp;
        }
        return temp == 1;
        
    }
}