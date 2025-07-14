package NeetCode.Graph;

public class NumberOfIslands {
    
    static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] directions = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
        for (int i = 0;i<n;i++) {
            for (int j = 0;j<m;j++) {
                if (grid[i][j] != '0') {
                    dfs(grid, directions, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(char[][] grid, int[][] directions, int i, int j) {
        if (i<0||i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for (int[] dir : directions) {
            dfs(grid, directions, i + dir[0], j + dir[1]);
        }
        return;
    }

    public static void main(String[] args) {
        char[][] ch = new char[][] { 
                                        {'1','1','0','0','1'},
                                        {'1','1','0','0','1'},
                                        {'0','0','1','0','0'},
                                        {'0','0','0','1','1'}
                                    };

        System.out.println(numIslands(ch));
    }
}
