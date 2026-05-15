package org.example.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ============================================================
 * LeetCode #994 - Rotting Oranges
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an m×n grid where each cell can be:
 *   0 — empty cell
 *   1 — fresh orange
 *   2 — rotten orange
 *
 * Every minute, any fresh orange that is 4-directionally adjacent to a
 * rotten orange becomes rotten. Return the minimum number of minutes that
 * must elapse until no cell has a fresh orange. If this is impossible,
 * return -1.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 10
 * - grid[i][j] is 0, 1, or 2
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   grid = [[2,1,1],[1,1,0],[0,1,1]] → 4
 *
 * Example 2:
 *   grid = [[2,1,1],[0,1,1],[1,0,1]] → -1  (bottom-left stays fresh)
 *
 * Example 3:
 *   grid = [[0,2]] → 0  (no fresh oranges to begin with)
 *
 * INTUITION & APPROACH
 * --------------------
 * Multi-source BFS from all initially rotten oranges simultaneously.
 * 1. First pass: count all fresh oranges; enqueue all rotten oranges.
 * 2. BFS level by level (each level = 1 minute). For each rotten orange
 *    dequeued, infect adjacent fresh oranges, decrement fresh count, enqueue.
 * 3. Track minutes as BFS levels (only increment if queue was non-empty).
 * 4. After BFS: if fresh count == 0, return minutes; else return -1.
 *
 * KEY CONCEPTS
 * ------------
 * - Multi-source BFS (all rotten oranges are initial sources)
 * - Level-based time counting (process entire queue snapshot per minute)
 * - Fresh orange count to detect impossibility
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — queue
 * ============================================================
 */
public class P994RottenOranges {

    public int orangesRotting(int[][] grid) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P994RottenOranges sol = new P994RottenOranges();

        System.out.println("Example 1 (expect 4): " +
            sol.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));

        System.out.println("Example 2 (expect -1): " +
            sol.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}}));

        System.out.println("Example 3 (expect 0): " +
            sol.orangesRotting(new int[][]{{0,2}}));
    }
}
