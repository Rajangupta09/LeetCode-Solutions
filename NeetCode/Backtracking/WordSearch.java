package NeetCode.Backtracking;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        char[] wordch = word.toCharArray();
        int[][] directions = new int[][] {{0,1}, {0, -1}, {1,0}, {-1,0}};

        for (int i=0;i<n;i++) {
            for (int j = 0; j<m;j++) {
                if (board[i][j] == wordch[0]);
                    if (dfs(board, wordch, i, j, m, n, directions, 0)) {
                        return true;
                    }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, char[] word, int i, int j, int m, int n, int[][] directions, int index) {
        if (i < 0 && i>=n && j<0&&j>=m && board[i][j] != word[index]) {
            return false;
        }
        if (index == word.length) return true;
        boolean result = false;
        for (int p=index;p< word.length;p++) {
            for (int[] dir : directions) {
                result = result || dfs(board, word, i+dir[0], j+dir[1], m, n, directions, index+1);
            }
        }

        return result;
       
    }



    public static void main(String[] args) {
        char[][] board = new char[][] 
                                {
                                    {'A','B','C','D'},
                                    {'S','A','A','T'},
                                    {'A','C','A','E'}
                                }  ;
        System.out.println(exist(board, "BAT")); 
    }
}
