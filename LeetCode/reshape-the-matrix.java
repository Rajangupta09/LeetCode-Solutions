class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c == mat.length * mat[0].length){
             int[][] newMatrix = new int[r][c];
            int m = 0,n=0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    newMatrix[m][n++] = mat[i][j];
                    if(n>=c){m++;n=0;}

                }
            }
            return newMatrix;
        }else{
            return mat;
        }
       
    }
}