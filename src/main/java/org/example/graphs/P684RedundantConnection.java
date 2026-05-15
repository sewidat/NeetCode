package org.example.graphs;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #684 - Redundant Connection
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given a graph that started as a tree with n nodes (1-indexed),
 * with one additional edge added. The graph is represented as an array of
 * edges where edges[i] = [ai, bi]. Return an edge that can be removed so
 * that the resulting graph is a tree. If there are multiple answers, return
 * the answer that occurs last in the input.
 *
 * CONSTRAINTS
 * -----------
 * - n == edges.length
 * - 3 <= n <= 1000
 * - 1 <= ai, bi <= n
 * - ai != bi
 * - No repeated edges
 * - The given graph is connected
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   edges = [[1,2],[1,3],[2,3]] → [2,3]
 *
 * Example 2:
 *   edges = [[1,2],[2,3],[3,4],[1,4],[1,5]] → [1,4]
 *
 * INTUITION & APPROACH
 * --------------------
 * Union-Find (Disjoint Set Union):
 * Process edges one by one in order. For each edge (u, v):
 *   - If find(u) == find(v): they are already in the same component.
 *     This edge creates a cycle — it is the redundant edge. Return it.
 *   - Otherwise: union(u, v) to merge their components.
 *
 * Because we process edges left to right and return the FIRST edge that
 * causes a cycle, we automatically satisfy the "last occurrence" requirement
 * (the tree + one extra edge has exactly one such edge).
 *
 * Use path compression and union by rank for efficiency.
 *
 * KEY CONCEPTS
 * ------------
 * - Union-Find with path compression and union by rank
 * - First edge that connects two already-connected nodes = redundant edge
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n * alpha(n)) — nearly O(n) with path compression
 * Space: O(n) — parent and rank arrays
 * ============================================================
 */
public class P684RedundantConnection {

    private int[] parent;
    private int[] rank;

    public int[] findRedundantConnection(int[][] edges) {
        // TODO: implement
        return new int[0];
    }

    private int find(int x) {
        // TODO: implement with path compression
        return x;
    }

    private boolean union(int x, int y) {
        // TODO: implement with union by rank; return false if already same component
        return false;
    }

    public static void main(String[] args) {
        P684RedundantConnection sol = new P684RedundantConnection();

        System.out.println("Example 1 (expect [2,3]): " +
            Arrays.toString(sol.findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}})));

        System.out.println("Example 2 (expect [1,4]): " +
            Arrays.toString(sol.findRedundantConnection(new int[][]{{1,2},{2,3},{3,4},{1,4},{1,5}})));
    }
}
