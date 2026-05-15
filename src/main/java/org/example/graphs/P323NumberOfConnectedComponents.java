package org.example.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #323 - Number of Connected Components in an Undirected Graph
 * Difficulty: Medium (Premium - NeetCode free)
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given n nodes labeled 0 to n-1 and a list of undirected edges, return
 * the number of connected components in the graph.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= n <= 2000
 * - 0 <= edges.length <= 5000
 * - edges[i].length == 2
 * - 0 <= ai, bi < n
 * - ai != bi
 * - No repeated edges
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   n = 5, edges = [[0,1],[1,2],[3,4]] → 2
 *   Components: {0,1,2} and {3,4}
 *
 * Example 2:
 *   n = 5, edges = [[0,1],[1,2],[2,3],[3,4]] → 1
 *
 * INTUITION & APPROACH
 * --------------------
 * Approach 1 — DFS/BFS:
 *   For each unvisited node, run DFS marking all reachable nodes as visited,
 *   then increment the component count. Total components = number of DFS
 *   initiations.
 *
 * Approach 2 — Union-Find:
 *   Initialize count = n (each node is its own component). For each edge
 *   (u, v): if find(u) != find(v), union them and decrement count. Return
 *   count after processing all edges.
 *
 * KEY CONCEPTS
 * ------------
 * - DFS component counting (visited array, one DFS per component)
 * - Union-Find with path compression and union by rank (alternative)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(V + E)
 * Space: O(V + E)
 * ============================================================
 */
public class P323NumberOfConnectedComponents {

    public int countComponents(int n, int[][] edges) {
        // TODO: implement
        return 0;
    }

    private void dfs(List<List<Integer>> adj, boolean[] visited, int node) {
        // TODO: implement
    }

    public static void main(String[] args) {
        P323NumberOfConnectedComponents sol = new P323NumberOfConnectedComponents();

        System.out.println("Example 1 (expect 2): " +
            sol.countComponents(5, new int[][]{{0,1},{1,2},{3,4}}));

        System.out.println("Example 2 (expect 1): " +
            sol.countComponents(5, new int[][]{{0,1},{1,2},{2,3},{3,4}}));
    }
}
