package org.example.trees;
import org.example.common.TreeNode;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * ============================================================
 * LeetCode #199 - Binary Tree Right Side View
 * Difficulty: Medium
 * Category: Trees
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given the root of a binary tree, imagine yourself standing on the right
 * side of it. Return the values of the nodes you can see, ordered from
 * top to bottom.
 *
 * CONSTRAINTS
 * -----------
 * - Number of nodes: 0 to 100
 * - -100 <= Node.val <= 100
 *
 * EXAMPLES
 * --------
 * Input:  [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 *
 * Input:  [1,null,3]
 * Output: [1,3]
 *
 * Input:  []
 * Output: []
 *
 * INTUITION & APPROACH
 * --------------------
 * BFS level-order traversal: the last node seen at each level is the rightmost
 * visible node. Track the queue size at the start of each level; the node
 * processed when the inner counter equals (size - 1) is the rightmost.
 * Alternative: DFS visiting right subtree before left; the first node visited
 * at each depth is the right-side-view node.
 *
 * KEY CONCEPTS
 * ------------
 * - BFS level-order: record the last node's value at each level
 * - DFS right-first: record the first node seen at each new depth
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — each node visited once
 * Space: O(n) — queue or recursion stack
 * ============================================================
 */
public class P199BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P199BinaryTreeRightSideView sol = new P199BinaryTreeRightSideView();
        TreeNode root = TreeNode.of(1, 2, 3, null, 5, null, 4);
        System.out.println("P199BinaryTreeRightSideView — rightSideView([1,2,3,null,5,null,4]) "
                + "expected [1,3,4]: " + sol.rightSideView(root));
    }
}
