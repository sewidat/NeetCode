package org.example.heap;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/**
 * ============================================================
 * LeetCode #621 - Task Scheduler
 * Difficulty: Medium
 * Category: Heap / Priority Queue
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a char array tasks representing CPU tasks labeled A to Z,
 * and an integer n representing the cooldown period between two
 * same tasks, return the minimum number of intervals the CPU will
 * take to finish all tasks. During a cooldown period the CPU may
 * be idle or work on a different task.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= tasks.length <= 10^4
 * n >= 0
 * tasks[i] is an uppercase English letter
 *
 * EXAMPLES
 * --------
 * Input:  tasks = ["A","A","A","B","B","B"], n = 2
 * Output: 8
 * Explanation: A -> B -> idle -> A -> B -> idle -> A -> B
 *
 * Input:  tasks = ["A","A","A","B","B","B"], n = 0
 * Output: 6
 * Explanation: No cooldown needed; schedule all 6 tasks back-to-back.
 *
 * INTUITION & APPROACH
 * --------------------
 * Formula approach: Let max_freq = highest frequency among tasks,
 * count_max = number of tasks with that frequency.
 * result = max(tasks.length, (max_freq - 1) * (n + 1) + count_max).
 * Reasoning: the most frequent task creates (max_freq-1) gaps of
 * size n, plus the last slot. The total tasks fill those gaps.
 *
 * Simulation approach: Max-heap by frequency + cooldown queue.
 * Each cycle pick the highest-frequency available task (heap),
 * decrement its count, push to cooldown queue with release time.
 * Move tasks from cooldown queue back to heap when their cooldown
 * expires. Count time steps (idle if heap is empty but queue is
 * non-empty).
 *
 * KEY CONCEPTS
 * ------------
 * - Frequency counting with int[26] array
 * - Formula: max(n_tasks, (max_freq-1)*(n+1) + count_max)
 * - Max-heap + deque for time-based cooldown simulation
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log 26) = O(n)
 * Space: O(26) = O(1)
 * ============================================================
 */
public class P621TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P621TaskScheduler sol = new P621TaskScheduler();
        // System.out.println(sol.leastInterval(new char[]{'A','A','A','B','B','B'}, 2)); // expected 8
        // System.out.println(sol.leastInterval(new char[]{'A','A','A','B','B','B'}, 0)); // expected 6
        System.out.println("P621TaskScheduler — uncomment examples above to test.");
    }
}
