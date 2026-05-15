package org.example.advancedgraphs;

import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #1584 - Min Cost to Connect All Points
 * Difficulty: Medium
 * Category: Advanced Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an array of points where points[i] = [xi, yi] in the 2D
 * plane. Return the minimum cost to make all points connected. The cost
 * of connecting two points is the Manhattan distance between them:
 *   |xi - xj| + |yi - yj|
 *
 * Any two points can be connected, and all points must be part of one
 * connected component.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= points.length <= 1000
 * - -10^6 <= xi, yi <= 10^6
 * - All points are distinct
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   points = [[0,0],[2,2],[3,10],[5,2],[7,0]] → 20
 *
 * Example 2:
 *   points = [[3,12],[-2,5],[-4,1]] → 18
 *
 * INTUITION & APPROACH
 * --------------------
 * Minimum Spanning Tree (MST) problem. The graph is complete (every pair
 * of points has an edge weighted by Manhattan distance).
 *
 * Prim's algorithm (lazy version):
 *   - Start from point 0. Use a min-heap of (cost, point_index).
 *   - Greedily pick the cheapest edge connecting a visited point to an
 *     unvisited point.
 *   - For each newly added point, compute costs to all other unvisited
 *     points and add to heap.
 *   - Repeat until all n points are in the MST.
 *
 * Kruskal's alternative:
 *   - Generate all O(n^2) edges, sort by weight, use Union-Find to add
 *     edges without creating cycles until n-1 edges are added.
 *
 * KEY CONCEPTS
 * ------------
 * - Minimum Spanning Tree: Prim's (greedy + min-heap) or Kruskal's (sort + Union-Find)
 * - Manhattan distance as edge weight
 * - Complete graph: O(n^2) edges — Prim's with adjacency avoids storing all edges
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n^2 log n) — Prim's with lazy heap on complete graph
 * Space: O(n^2)       — heap entries
 * ============================================================
 */
public class P1584MinCostToConnectAllPoints {

    public int minCostConnectPoints(int[][] points) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P1584MinCostToConnectAllPoints sol = new P1584MinCostToConnectAllPoints();

        System.out.println("Example 1 (expect 20): " +
            sol.minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}}));

        System.out.println("Example 2 (expect 18): " +
            sol.minCostConnectPoints(new int[][]{{3,12},{-2,5},{-4,1}}));
    }
}
