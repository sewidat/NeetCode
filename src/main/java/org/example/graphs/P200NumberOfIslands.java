package org.example.graphs;

/**
 * ============================================================
 * LeetCode #200 - Number of Islands
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m×n grid of '1's (land) and '0's (water), count the number
 * of islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 300
 * - grid[i][j] is '0' or '1'
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   grid = [["1","1","1","1","0"],
 *           ["1","1","0","1","0"],
 *           ["1","1","0","0","0"],
 *           ["0","0","0","0","0"]]
 *   Output: 1
 *
 * Example 2:
 *   grid = [["1","1","0","0","0"],
 *           ["1","1","0","0","0"],
 *           ["0","0","1","0","0"],
 *           ["0","0","0","1","1"]]
 *   Output: 3
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS/BFS flood fill. Iterate every cell; when an unvisited '1' is found,
 * increment the island count and run DFS to mark all connected '1's as
 * visited (by changing them to '0'). This ensures each land cell is
 * processed at most once.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS/BFS flood fill
 * - Mark visited by modifying the grid in-place (change '1' to '0')
 * - 4-directional movement (up, down, left, right)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — recursion stack in worst case (all land)
 * ============================================================
 */
public class P200NumberOfIslands {

    public int numIslands(char[][] grid) {
        // TODO: implement
        return 0;
    }

    private void dfs(char[][] grid, int r, int c) {
        // TODO: implement
    }

    public static void main(String[] args) {
        P200NumberOfIslands sol = new P200NumberOfIslands();

        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println("Example 1 (expect 1): " + sol.numIslands(grid1));

        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println("Example 2 (expect 3): " + sol.numIslands(grid2));
    }
}
