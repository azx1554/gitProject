package Xi.LeetCode.TwoHundred;

/**
 Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:
 Input:
 11110
 11010
 11000
 00000
 Output: 1

 Example 2:
 Input:
 11000
 11000
 00100
 00011
 Output: 3
 */
public class Problem200 {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    //把这个岛上的数字1全部置为0
                    changeGrid(grid, i, j);
                }
            }
        }
        return count;
    }

    public void changeGrid(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        changeGrid(grid, i-1, j);
        changeGrid(grid, i+1, j);
        changeGrid(grid, i, j-1);
        changeGrid(grid, i, j+1);
    }
}
