package org.example.graphs;

/**
 * ============================================================
 * LeetCode #695 - Max Area of Island
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m×n binary integer grid where 0 represents water and 1 represents
 * land, return the maximum area of an island in the grid. An island is a
 * group of 1s connected 4-directionally. Return 0 if there are no islands.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 50
 * - grid[i][j] is 0 or 1
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 *           [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *           [0,1,1,0,1,0,0,0,0,0,0,0,0],
 *           [0,1,0,0,1,1,0,0,1,0,1,0,0],
 *           [0,1,0,0,1,1,0,0,1,1,1,0,0],
 *           [0,0,0,0,0,0,0,0,0,0,1,0,0],
 *           [0,0,0,0,0,0,0,1,1,1,0,0,0],
 *           [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 *   Output: 6
 *
 * Example 2:
 *   grid = [[0,0,0,0,0,0,0,0]]
 *   Output: 0
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS from each unvisited land cell (value == 1). The DFS returns the size
 * of the island rooted at that cell: 1 (for the current cell) plus the sum
 * of DFS calls on valid, unvisited neighbors. Mark cells visited by setting
 * them to 0. Track the global maximum area across all DFS calls.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS flood fill returning island size
 * - Mark visited in-place (set cell to 0)
 * - Global max tracking across all islands
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — recursion stack in worst case
 * ============================================================
 */
public class P695MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        // TODO: implement
        return 0;
    }

    private int dfs(int[][] grid, int r, int c) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P695MaxAreaOfIsland sol = new P695MaxAreaOfIsland();

        int[][] grid1 = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println("Example 1 (expect 6): " + sol.maxAreaOfIsland(grid1));

        int[][] grid2 = {{0,0,0,0,0,0,0,0}};
        System.out.println("Example 2 (expect 0): " + sol.maxAreaOfIsland(grid2));
    }
}
