class Solution
{
    public static void swap(int a[], int i, int j){
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }
    public static void sort012(int a[], int n)
    {
        int l=0,r=n-1,mid = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                swap(a,l,i);
                l++;
                mid++;
            }if(a[i] ==1)mid++;
            else{
                swap(a, i,r);
                r--;
                i-=1;
            }
        }
    }
}