package NeetCode.BinarySearch;

public class Searcha2DMatrix {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int r = (n * m) - 1;
        while (l <= r) {
            int mid = l + (r-l)/2;
            int x1 = mid / m;
            int y1 = mid % m;
            if (matrix[x1][y1] > target) {
                r = mid-1;
            } else if (matrix[x1][y1] < target) {
                l = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,4,8}, {10,11,12,13},
                                      {14,20,30,40}};

        System.out.println(searchMatrix(matrix, 15));
    }
}
