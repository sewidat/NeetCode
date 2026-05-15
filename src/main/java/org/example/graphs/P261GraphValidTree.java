package org.example.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ============================================================
 * LeetCode #261 - Graph Valid Tree
 * Difficulty: Medium (Premium - NeetCode free)
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given n nodes labeled 0 to n-1 and a list of undirected edges, return
 * true if these edges form a valid tree.
 *
 * A valid tree must satisfy two conditions:
 *   1. The graph is fully connected (all n nodes reachable from any node).
 *   2. There are no cycles.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= n <= 2000
 * - 0 <= edges.length <= 5000
 * - edges[i].length == 2
 * - 0 <= ai, bi < n
 * - ai != bi
 * - No self-loops or repeated edges
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   n = 5, edges = [[0,1],[0,2],[0,3],[1,4]] → true
 *
 * Example 2:
 *   n = 5, edges = [[0,1],[1,2],[2,3],[1,3],[1,4]] → false  (cycle 1-2-3-1)
 *
 * INTUITION & APPROACH
 * --------------------
 * A graph of n nodes is a valid tree if and only if:
 *   - It has exactly n-1 edges (necessary condition — shortcut check).
 *   - It is connected (BFS/DFS from node 0 visits all n nodes).
 *
 * Quick check: if edges.length != n-1, return false immediately.
 * Then BFS/DFS from node 0 and verify the visited set has size n.
 *
 * Alternative: Union-Find. Process each edge; if both endpoints share a
 * component, it's a cycle → return false. After processing all edges,
 * all n nodes must be in one component.
 *
 * KEY CONCEPTS
 * ------------
 * - Tree property: exactly n-1 edges AND connected
 * - BFS/DFS reachability check from node 0
 * - Union-Find cycle detection (alternative approach)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(V + E)
 * Space: O(V + E)
 * ============================================================
 */
public class P261GraphValidTree {

    public boolean validTree(int n, int[][] edges) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P261GraphValidTree sol = new P261GraphValidTree();

        System.out.println("Example 1 (expect true):  " +
            sol.validTree(5, new int[][]{{0,1},{0,2},{0,3},{1,4}}));

        System.out.println("Example 2 (expect false): " +
            sol.validTree(5, new int[][]{{0,1},{1,2},{2,3},{1,3},{1,4}}));
    }
}
