class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<n1&&j<n2&&k<n3){
            if(A[i] == B[j] && A[i]==C[k]){
                if(!res.contains(A[i]))res.add(A[i]);
                i++;j++;k++;

            }
            else if(A[i]<=B[j]&&A[i]<=C[k]){
                i++;
            }
            else if(B[j]<=A[i]&&B[j]<=C[k]){
                j++;
            }
            else if(C[k]<=A[i]&&C[k]<=B[j]){
                k++;
            }
            
        }
        return res;
    }
}