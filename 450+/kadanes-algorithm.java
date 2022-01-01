class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long res = Integer.MIN_VALUE;
        long tsum = 0;
        for(int i=0;i<n;i++){
            tsum+=arr[i];
            
            res = Math.max(res,tsum);
            if(tsum<0){
                tsum =0;
            }
        }
        return res;
    }