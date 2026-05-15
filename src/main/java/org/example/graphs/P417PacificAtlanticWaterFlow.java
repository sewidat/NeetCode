package org.example.graphs;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * ============================================================
 * LeetCode #417 - Pacific Atlantic Water Flow
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * There is an m×n rectangular island that borders both the Pacific Ocean
 * (top and left edges) and the Atlantic Ocean (bottom and right edges).
 * Water can flow from a cell to an adjacent cell if the adjacent cell's
 * height is less than or equal to the current cell's height.
 *
 * Return a list of grid coordinates where water can flow to both the
 * Pacific and Atlantic oceans.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 200
 * - 0 <= heights[i][j] <= 10^5
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
 *   Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]  (7 cells)
 *
 * Example 2:
 *   heights = [[1]] → [[0,0]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Reverse the flow direction. Instead of asking "can water at cell X reach
 * the ocean?", ask "which cells can be reached from the ocean border?"
 *
 * Run BFS/DFS from all Pacific border cells (top row + left column) and
 * all Atlantic border cells (bottom row + right column) separately.
 * A neighbor is reachable from the border if its height >= current cell's
 * height (water flows downhill in the original direction, uphill in reverse).
 *
 * The answer is the intersection: cells reachable from both oceans.
 *
 * KEY CONCEPTS
 * ------------
 * - Reverse BFS from ocean borders (climb uphill to find reachable cells)
 * - Two separate BFS passes: one per ocean
 * - Set intersection to find cells reachable from both
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — visited arrays and queue
 * ============================================================
 */
public class P417PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // TODO: implement
        return new ArrayList<>();
    }

    private boolean[][] bfs(int[][] heights, Queue<int[]> queue) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        P417PacificAtlanticWaterFlow sol = new P417PacificAtlanticWaterFlow();

        int[][] heights = {
            {1,2,2,3,5},
            {3,2,3,4,4},
            {2,4,5,3,1},
            {6,7,1,4,5},
            {5,1,1,2,4}
        };
        List<List<Integer>> result = sol.pacificAtlantic(heights);
        System.out.println("Example 1 (expect [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]): " + result);

        int[][] heights2 = {{1}};
        System.out.println("Example 2 (expect [[0,0]]): " + sol.pacificAtlantic(heights2));
    }
}
