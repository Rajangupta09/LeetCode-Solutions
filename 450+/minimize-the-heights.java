class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int sm = arr[0]+k;
        int lg = arr[n-1]-k;
        for(int i=0;i<n-1;i++){
            int mi = Math.min(sm, arr[i+1]-k);
            int ma = Math.max(lg,arr[i]+k);
            if(mi<0)continue;
            ans = Math.min(ans,ma-mi);
        }
        return ans;
    }
}
