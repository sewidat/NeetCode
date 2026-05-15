package org.example.graphs;

import java.util.*;

/**
 * ============================================================
 * LeetCode #133 - Clone Graph
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a reference to a node in a connected undirected graph, return a
 * deep copy (clone) of the graph. Each node contains an integer value and
 * a list of its neighbors.
 *
 * CONSTRAINTS
 * -----------
 * - 1 to 100 nodes in the graph
 * - Node values are unique and in range [1, n]
 * - No repeated edges, no self-loops
 * - The graph is connected
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   adjList = [[2,4],[1,3],[2,4],[1,3]]
 *   Output:   [[2,4],[1,3],[2,4],[1,3]]  (deep copy)
 *
 * Example 2:
 *   Input: single node with no neighbors
 *   Output: same structure, new object
 *
 * INTUITION & APPROACH
 * --------------------
 * DFS with a HashMap<original, clone>. For each node visited:
 *   1. If it already has a clone in the map, return the clone (avoids cycles).
 *   2. Otherwise create a new Node with the same value, put it in the map.
 *   3. Recursively clone each neighbor and add to the new node's neighbor list.
 * This ensures every node and edge is cloned exactly once.
 *
 * KEY CONCEPTS
 * ------------
 * - HashMap<Node, Node> to avoid revisiting / handle cycles
 * - DFS (or BFS) traversal for cloning
 * - Deep copy: all nodes are new objects; neighbor lists are rebuilt
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(V + E)
 * Space: O(V + E) — map and adjacency structure
 * ============================================================
 */
public class P133CloneGraph {

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }

        public Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        // TODO: implement
        return null;
    }

    public static void main(String[] args) {
        // Create graph: 1-2-3-4-1 (LeetCode example 1)
        // adjList = [[2,4],[1,3],[2,4],[1,3]]
        // Node 1 <-> 2, 2 <-> 3, 3 <-> 4, 4 <-> 1
        System.out.println("P133CloneGraph — uncomment examples above to test.");
    }
}
