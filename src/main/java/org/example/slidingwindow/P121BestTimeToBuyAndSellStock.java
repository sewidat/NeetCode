package org.example.slidingwindow;

/**
 * ============================================================
 * LeetCode #121 - Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Category: Sliding Window
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given an array prices where prices[i] is the price of a given stock on day i,
 * return the maximum profit achievable by buying on one day and selling on a
 * strictly later day. Return 0 if no profit is possible.
 *
 * CONSTRAINTS
 * -----------
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 * - You must buy before you sell (one transaction only)
 *
 * EXAMPLES
 * --------
 * Input: prices = [7,1,5,3,6,4]  → Output: 5  (buy at 1, sell at 6)
 * Input: prices = [7,6,4,3,1]    → Output: 0  (no profitable transaction)
 *
 * INTUITION & APPROACH
 * --------------------
 * A brute-force O(n²) approach tries every buy/sell pair. The optimal single-pass
 * approach tracks the minimum price seen so far (the best day to have bought).
 * For each day, compute potential profit = prices[i] - minPrice and update the
 * running maximum profit. This is equivalent to a sliding window where the left
 * pointer represents the best buy day — if we see a new low, we slide left to it.
 * Only one variable for minPrice and one for maxProfit are needed.
 *
 * KEY CONCEPTS
 * ------------
 * - Running minimum: track the lowest price seen so far as the "buy" point
 * - Sliding window framing: left = best buy day, right = current sell day
 * - Single pass: no need to revisit earlier elements
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n) — single left-to-right sweep of the prices array
 * Space: O(1) — only two variables (minPrice and maxProfit)
 * ============================================================
 */
public class P121BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P121BestTimeToBuyAndSellStock sol = new P121BestTimeToBuyAndSellStock();
        // Example 1: expected 5
        // System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4}));
        // Example 2: expected 0
        // System.out.println(sol.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println("P121BestTimeToBuyAndSellStock — uncomment examples above to test.");
    }
}
