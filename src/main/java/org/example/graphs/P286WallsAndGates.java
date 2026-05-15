package org.example.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * ============================================================
 * LeetCode #286 - Walls and Gates
 * Difficulty: Medium (Premium - NeetCode free)
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an m×n grid initialized with three possible values:
 *   -1  : a wall or obstacle
 *    0  : a gate
 *   INF : empty room (represented as Integer.MAX_VALUE = 2^31 - 1)
 *
 * Fill each empty room with the distance to its nearest gate. If it is
 * impossible to reach a gate, it should remain INF.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= m, n <= 250
 * - rooms[i][j] is -1, 0, or 2^31 - 1
 *
 * EXAMPLES
 * --------
 * INF = 2147483647
 *
 * Input:
 *   [[INF, -1,  0, INF],
 *    [INF, INF, INF, -1],
 *    [INF, -1, INF, -1],
 *    [  0, -1, INF, INF]]
 *
 * Output:
 *   [[3, -1, 0, 1],
 *    [2,  2, 1,-1],
 *    [1, -1, 2,-1],
 *    [0, -1, 3, 4]]
 *
 * INTUITION & APPROACH
 * --------------------
 * Multi-source BFS starting simultaneously from ALL gate (value == 0) cells.
 * Add every gate to the queue first, then run BFS. For each cell dequeued,
 * attempt to update its four neighbors: if the neighbor is an empty room
 * (INF), set its distance to current distance + 1 and enqueue it. Walls
 * and already-updated rooms are naturally skipped. Because BFS expands
 * level by level from all gates at once, the first time any room is reached
 * is guaranteed to be the shortest distance.
 *
 * KEY CONCEPTS
 * ------------
 * - Multi-source BFS (all sources enqueued before any processing)
 * - Level-by-level expansion naturally gives shortest distance
 * - Walls (-1) and gates (0) are never enqueued as targets
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(m * n)
 * Space: O(m * n) — queue can hold all cells
 * ============================================================
 */
public class P286WallsAndGates {

    private static final int INF = Integer.MAX_VALUE;
    private static final int[][] DIRS = {{0,1},{0,-1},{1,0},{-1,0}};

    public void wallsAndGates(int[][] rooms) {
        // TODO: implement
    }

    public static void main(String[] args) {
        P286WallsAndGates sol = new P286WallsAndGates();

        int INF = Integer.MAX_VALUE;
        int[][] rooms = {
            {INF, -1,  0, INF},
            {INF, INF, INF, -1},
            {INF, -1, INF, -1},
            {  0, -1, INF, INF}
        };

        sol.wallsAndGates(rooms);

        System.out.println("Example 1 (expect [[3,-1,0,1],[2,2,1,-1],[1,-1,2,-1],[0,-1,3,4]]):");
        for (int[] row : rooms) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < row.length; i++) {
                sb.append(row[i] == Integer.MAX_VALUE ? "INF" : row[i]);
                if (i < row.length - 1) sb.append(", ");
            }
            sb.append("]");
            System.out.println(sb);
        }
    }
}
