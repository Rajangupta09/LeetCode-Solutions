class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);
        int ptr1 = nums[0];
        while(ptr1 != slow){
            ptr1 = nums[ptr1];
            slow = nums[slow];
        }
        return ptr1;
    }
}