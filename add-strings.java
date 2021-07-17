class Solution {
    public int getVal(char c){
        switch(c){
            case '0':return 0;
            case '1':return 1;
            case '2':return 2;
            case '3':return 3;
            case '4':return 4;
            case '5':return 5;
            case '6':return 6;
            case '7':return 7;
            case '8':return 8;
            case '9':return 9;
        default: return 0;
        }
    }
    public String addStrings(String num1, String num2) {
        StringBuilder sc = new StringBuilder();
        int l1 = num1.length()-1, l2 =num2.length()-1;
        if(l1==0&&l2==0){
            sc.append(String.valueOf(getVal(num1.charAt(l1))+getVal(num2.charAt(l2))));
            return sc.toString();
        }
        int carry = 0;
        while(l1>=0&&l2>=0){
            int temp = getVal(num1.charAt(l1))+getVal(num2.charAt(l2))+carry;
            if(temp>9){
                 if(l1 == 0 &&l2 ==0){
                    while(temp>0){
                        sc.append(String.valueOf(temp%10));
                        temp /=10;
                    }
                }else{
                    sc.append(String.valueOf(temp%10));
                    carry = temp/10;
                 }
            }
            else{
                sc.append(String.valueOf(temp));
                carry = 0;
            }
            l1--;l2--;
        }
        
        while(l1>=0){
            int temp = getVal(num1.charAt(l1))+carry;
            if(temp>9){
                if(l1 == 0){
                    while(temp>0){
                        sc.append(String.valueOf(temp%10));
                        temp /=10;
                    }
                }else{
                    sc.append(String.valueOf(temp%10));
                    carry = temp/10;
                }
            }else{
                sc.append(String.valueOf(temp));
                carry = 0;
            }
            l1--;    
        }
        
        while(l2>=0){
            int temp = getVal(num2.charAt(l2))+carry;
            if(temp>9){
                if(l2 == 0){
                    while(temp>0){
                        sc.append(String.valueOf(temp%10));
                        temp /=10;
                    }
                }else{
                    sc.append(String.valueOf(temp%10));
                    carry = temp/10;
                }
            }else{
                sc.append(String.valueOf(temp));
                carry = 0;
            }
            l2--;    
        }
        return sc.reverse().toString();
    }
}