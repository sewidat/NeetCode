package org.example.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ============================================================
 * LeetCode #150 - Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Category: Stack
 * ============================================================
 *
 * PROBLEM
 * -------
 * Evaluate arithmetic expression in Reverse Polish Notation (postfix).
 * Valid operators: +, -, *, /. Division truncates toward zero.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= tokens.length <= 10^4
 * tokens[i] is an integer or one of '+', '-', '*', '/'
 * Valid RPN expression guaranteed
 * Answer fits in a 32-bit integer
 *
 * EXAMPLES
 * --------
 * ["2","1","+","3","*"]                                          → 9
 * ["4","13","5","/","+"]                                         → 6
 * ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]     → 22
 *
 * INTUITION & APPROACH
 * --------------------
 * Stack. For each token: if number, push. If operator, pop two values
 * (b = pop, a = pop), apply operator (a op b), push result.
 * Final result is the single remaining value on the stack.
 *
 * KEY CONCEPTS
 * ------------
 * Stack for operand storage, pop order matters (second pop is left operand)
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(n)
 * ============================================================
 */
public class P150EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P150EvaluateReversePolishNotation sol = new P150EvaluateReversePolishNotation();
        System.out.println(sol.evalRPN(new String[]{"2", "1", "+", "3", "*"})); // expected 9
    }
}
