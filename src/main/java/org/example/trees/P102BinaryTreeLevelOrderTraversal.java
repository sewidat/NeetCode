package org.example.trees;
import org.example.common.TreeNode;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * ============================================================
 * LeetCode #102 - Binary Tree Level Order Traversal
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary tree, return the level-order traversal of
 * its nodes' values as a list of lists. Each sublist contains the values
 * of nodes at that level, left to right.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 0 to 2000
 * - -1000 <= Node.val <= 1000
 *
 * EXAMPLES
 * --------
 * Input:  [3,9,20,null,null,15,7]
 * Output: [[3],[9,20],[15,7]]
 *
 * Input:  [1]
 * Output: [[1]]
 *
 * Input:  []
 * Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * BFS with a queue. Before processing each level, snapshot the current queue
 * size — this is the number of nodes at that level. Process exactly that many
 * nodes, collecting their values in the current level list. After processing,
 * add their children to the queue for the next level. Repeat until queue empty.
 *
 * KEY CONCEPTS
 * ------------
 * - BFS with level-size snapshot at the start of each level iteration
 * - Queue holds nodes waiting to be processed
 * - Inner loop runs exactly (level size) times to group each level's values
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each node enqueued and dequeued once
 * Space: O(n) — queue can hold up to n/2 nodes (last level)
 * ============================================================
 */
public class P102BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P102BinaryTreeLevelOrderTraversal sol = new P102BinaryTreeLevelOrderTraversal();
        TreeNode root = TreeNode.of(3, 9, 20, null, null, 15, 7);
        System.out.println("P102BinaryTreeLevelOrderTraversal — levelOrder([3,9,20,null,null,15,7]) "
                + "expected [[3],[9,20],[15,7]]: " + sol.levelOrder(root));
    }
}
