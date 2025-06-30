class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int vol = 0;
        lmax[0] = height[0];
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(height[i], lmax[i-1]);
        }
        rmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(height[i], rmax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            vol += Math.min(lmax[i], rmax[i]) - height[i];
        }
        return vol;
        
    }
}