package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * LeetCode #155 - Min Stack
 * Difficulty: Medium
 * Category: Stack
 * ============================================================
 *
 * PROBLEM
 * -------
 * Design a stack that supports push, pop, top, and retrieving the
 * minimum element in O(1) time.
 *
 * CONSTRAINTS
 * -----------
 * -2^31 <= val <= 2^31-1
 * pop/top/getMin called on non-empty stack
 * At most 3*10^4 calls
 *
 * EXAMPLES
 * --------
 * push(-2), push(0), push(-3), getMin() = -3,
 * pop(), top() = 0, getMin() = -2
 *
 * INTUITION & APPROACH
 * --------------------
 * Maintain two stacks: one main stack, one min stack that tracks the
 * current minimum at each level. Min stack pushes the minimum of
 * (new value, current min) at each push. On pop, pop both stacks.
 *
 * KEY CONCEPTS
 * ------------
 * Auxiliary min-stack, always keep min in sync with main stack
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(1) per operation
 * Space: O(n)
 * ============================================================
 */
public class P155MinStack {

    static class MinStack {
        public MinStack() { /* TODO */ }
        public void push(int val) { /* TODO */ }
        public void pop() { /* TODO */ }
        public int top() { /* TODO: return 0; */ return 0; }
        public int getMin() { /* TODO: return 0; */ return 0; }
    }

    public static void main(String[] args) {
        // MinStack stack = new MinStack();
        // stack.push(-2); stack.push(0); stack.push(-3);
        // System.out.println(stack.getMin()); // expected -3
        // stack.pop();
        // System.out.println(stack.top());    // expected 0
        // System.out.println(stack.getMin()); // expected -2
        System.out.println("P155MinStack — uncomment examples above to test.");
    }
}
