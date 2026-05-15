package org.example.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ============================================================
 * LeetCode #210 - Course Schedule II
 * Difficulty: Medium
 * Category: Graphs
 * ============================================================
 *
 * PROBLEM
 * -------
 * There are numCourses courses labeled 0 to numCourses-1. Given prerequisites
 * where [a, b] means you must take b before a, return the ordering of courses
 * you should take to finish all courses. If it is impossible (cycle), return
 * an empty array.
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
 *   numCourses = 2, prerequisites = [[1,0]] → [0,1]
 *
 * Example 2:
 *   numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
 *   Output: [0,2,1,3] or [0,1,2,3]
 *
 * Example 3:
 *   numCourses = 1, prerequisites = [] → [0]
 *
 * INTUITION & APPROACH
 * --------------------
 * Topological sort of the directed prerequisite graph.
 *
 * DFS postorder approach:
 *   - For each unvisited node, DFS until fully processed.
 *   - When a node finishes (all descendants processed), append to result.
 *   - Reverse the result to get topological order.
 *   - If a cycle is detected (grey node revisited), return empty array.
 *
 * Kahn's BFS approach (alternative):
 *   - Compute in-degrees. Enqueue all nodes with in-degree 0.
 *   - Process queue: for each node, decrement neighbors' in-degrees;
 *     if in-degree becomes 0, enqueue.
 *   - If processed count == numCourses, return order; else cycle exists.
 *
 * KEY CONCEPTS
 * ------------
 * - Topological sort (DFS postorder reversed, or Kahn's BFS)
 * - Cycle detection (3-color DFS state or incomplete Kahn's count)
 * - Adjacency list representation
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(V + E)
 * Space: O(V + E)
 * ============================================================
 */
public class P210CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // TODO: implement
        return new int[0];
    }

    public static void main(String[] args) {
        P210CourseScheduleII sol = new P210CourseScheduleII();

        System.out.println("Example 1 (expect [0,1]): " +
            Arrays.toString(sol.findOrder(2, new int[][]{{1, 0}})));

        System.out.println("Example 2 (expect [0,1,2,3] or similar): " +
            Arrays.toString(sol.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}})));

        System.out.println("Example 3 (expect [0]): " +
            Arrays.toString(sol.findOrder(1, new int[][]{})));
    }
}
