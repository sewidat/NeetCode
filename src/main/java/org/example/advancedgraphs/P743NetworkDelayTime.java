package org.example.advancedgraphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #743 - Network Delay Time
 * Difficulty: Medium
 * Category: Advanced Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * There are n network nodes labeled 1 to n. You are given a list of travel
 * times as directed edges times[i] = [ui, vi, wi], where ui is the source,
 * vi is the target, and wi is the travel time. A signal is sent from node k.
 * Return the minimum time it takes for all n nodes to receive the signal.
 * Return -1 if it is impossible.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= k <= n <= 100
 * - 1 <= times.length <= 6000
 * - times[i].length == 3
 * - 1 <= ui, vi <= n
 * - ui != vi
 * - 0 < wi <= 100
 * - All (ui, vi) pairs are unique
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2 → 2
 *   Signal: 2→1 (t=1), 2→3 (t=1), 3→4 (t=2). All reached by t=2.
 *
 * Example 2:
 *   times = [[1,2,1]], n = 2, k = 1 → 1
 *
 * Example 3:
 *   times = [[1,2,1]], n = 2, k = 2 → -1  (node 1 unreachable)
 *
 * INTUITION & APPROACH
 * --------------------
 * Dijkstra's algorithm from source node k.
 *
 * Use a min-heap (priority queue) ordered by distance. Initialize dist[]
 * with infinity for all nodes except dist[k] = 0. Repeatedly extract the
 * node with minimum distance, relax its outgoing edges, and update dist[].
 * Skip nodes already finalized (lazy deletion).
 *
 * After running Dijkstra, the answer is max(dist[1..n]).
 * If any dist[i] == infinity, return -1 (node unreachable).
 *
 * KEY CONCEPTS
 * ------------
 * - Dijkstra's shortest path algorithm (single source, positive weights)
 * - Min-heap priority queue for greedy extraction
 * - dist[] array initialized to infinity
 * - Answer = max of all shortest distances (bottleneck for broadcast)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(E log V)
 * Space: O(V + E)
 * ============================================================
 */
public class P743NetworkDelayTime {

    public int networkDelayTime(int[][] times, int n, int k) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P743NetworkDelayTime sol = new P743NetworkDelayTime();

        System.out.println("Example 1 (expect 2): " +
            sol.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2));

        System.out.println("Example 2 (expect 1): " +
            sol.networkDelayTime(new int[][]{{1,2,1}}, 2, 1));

        System.out.println("Example 3 (expect -1): " +
            sol.networkDelayTime(new int[][]{{1,2,1}}, 2, 2));
    }
}
