package org.example.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * LeetCode #207 - Course Schedule
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * There are numCourses courses labeled 0 to numCourses-1. Given an array
 * prerequisites where prerequisites[i] = [a, b] means you must take course
 * b before course a, return true if it is possible to finish all courses.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= numCourses <= 2000
 * - 0 <= prerequisites.length <= 5000
 * - prerequisites[i].length == 2
 * - All prerequisite pairs are unique
 *
 * EXAMPLES
 * --------
 * Example 1:
 *   numCourses = 2, prerequisites = [[1,0]] → true
 *   (Take 0, then take 1.)
 *
 * Example 2:
 *   numCourses = 2, prerequisites = [[1,0],[0,1]] → false
 *   (Cycle: 0 requires 1, 1 requires 0.)
 *
 * INTUITION & APPROACH
 * --------------------
 * The problem reduces to: does the directed graph (where edge b→a means b
 * is a prerequisite of a) contain a cycle?
 *
 * DFS with 3-color marking:
 *   0 = unvisited (white)
 *   1 = in current DFS path (grey) — back-edge → cycle detected
 *   2 = fully processed (black) — safe, no cycle through this node
 *
 * For each unvisited node, run DFS. If we ever visit a grey node, there is
 * a cycle and we return false. Alternatively, use Kahn's BFS (topological
 * sort with in-degree tracking).
 *
 * KEY CONCEPTS
 * ------------
 * - Cycle detection in directed graph
 * - DFS with 3-color (white/grey/black) state
 * - Adjacency list representation
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(V + E)
 * Space: O(V + E) — adjacency list and state array
 * ============================================================
 */
public class P207CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // TODO: implement
        return false;
    }

    private boolean hasCycle(List<List<Integer>> adj, int[] state, int node) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P207CourseSchedule sol = new P207CourseSchedule();

        System.out.println("Example 1 (expect true):  " +
            sol.canFinish(2, new int[][]{{1, 0}}));

        System.out.println("Example 2 (expect false): " +
            sol.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
