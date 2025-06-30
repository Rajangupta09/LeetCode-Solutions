class Solution {
    public String getVal(int i, int j){
        if(i==j){
            return ""+i;
        }
        return i+"->"+j;
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
     
        int i = 0;
        int j =0;
        if(nums.length ==0)return res;
        if(nums.length ==1){
            res.add(getVal(nums[i],nums[j]));
            return res;
        }
        while(i<nums.length-1){
            i=j;
            while(j<nums.length-1 && nums[j] == nums[j+1]-1){
                j++;
            }
            System.out.println(j);
            res.add(getVal(nums[i],nums[j]));
            if(j == nums.length-1){
                return res;
            }
            j++;            
        }
        return res;
        
    }
}