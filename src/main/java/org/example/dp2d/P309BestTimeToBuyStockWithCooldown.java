package org.example.dp2d;

/**
 * ============================================================
 * LeetCode #309 - Best Time to Buy and Sell Stock with Cooldown
 * Difficulty: Medium
 * Category: 2-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an array prices where prices[i] is the price of a stock
 * on day i. You may complete as many transactions as you like, but with
 * the following constraints:
 *   - After you sell your stock, you cannot buy stock on the next day
 *     (cooldown of one day).
 *   - You may not engage in multiple transactions simultaneously (must
 *     sell before buying again).
 * Return the maximum profit you can achieve.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= prices.length <= 5000
 * 0 <= prices[i] <= 1000
 *
 * EXAMPLES
 * --------
 * prices = [1, 2, 3, 0, 2] → 3   (buy at 1, sell at 3, cooldown, buy at 0, sell at 2)
 * prices = [1]              → 0
 *
 * INTUITION & APPROACH
 * --------------------
 * Model as a state machine with three states:
 *
 *   holding : currently holding a stock
 *   sold    : just sold today (must cooldown tomorrow)
 *   idle    : not holding, not in cooldown (free to buy)
 *
 * Transitions on day i with price p:
 *   holding(i) = max(holding(i-1),         // keep holding
 *                    idle(i-1) - p)         // buy today (must come from idle)
 *   sold(i)    = holding(i-1) + p           // sell today
 *   idle(i)    = max(idle(i-1),             // stay idle
 *                    sold(i-1))             // cooldown expired
 *
 * Initial state (before day 0):
 *   holding = -infinity (can't hold without buying)
 *   sold    = 0
 *   idle    = 0
 *
 * Answer: max(sold, idle) after processing all prices.
 *
 * KEY CONCEPTS
 * ------------
 * - Three-state DP: holding, sold, idle
 * - Cooldown: can only buy from idle state (not from sold)
 * - O(1) space: three scalar variables updated each day
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n)
 * Space: O(1)
 * ============================================================
 */
public class P309BestTimeToBuyStockWithCooldown {
    public int maxProfit(int[] prices) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P309BestTimeToBuyStockWithCooldown sol = new P309BestTimeToBuyStockWithCooldown();
        System.out.println(sol.maxProfit(new int[]{1, 2, 3, 0, 2})); // 3
        System.out.println(sol.maxProfit(new int[]{1}));              // 0
    }
}
