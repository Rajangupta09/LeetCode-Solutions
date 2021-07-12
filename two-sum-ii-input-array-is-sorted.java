class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r = numbers.length-1;
        int l = 0;
        while(l<r){
            int temp = numbers[l]+numbers[r];
            if (temp == target){
                int[] t = new int[2];
                t[0] = l+1;
                t[1] = r+1;
                return t;
            }
            if(temp>target){
                r -=1;
            }else{
                l +=1;
            }
        }
        return null;
    }
}