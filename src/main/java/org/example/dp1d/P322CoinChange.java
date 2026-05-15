package org.example.dp1d;

import java.util.Arrays;

/**
 * ============================================================
 * LeetCode #322 - Coin Change
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * You are given an integer array coins representing coins of different
 * denominations and an integer amount representing a total amount of money.
 * Return the fewest number of coins needed to make up that amount.
 * If it cannot be made up by any combination, return -1.
 * You may use each coin denomination an unlimited number of times.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 2^31 - 1
 * 0 <= amount <= 10^4
 *
 * EXAMPLES
 * --------
 * coins = [1, 5, 11], amount = 11 → 3   (5 + 5 + 1)
 * coins = [2],        amount = 3  → -1  (impossible)
 * coins = [1],        amount = 0  → 0
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[a] = minimum number of coins needed to make amount a.
 *
 * For each amount a from 1 to target:
 *   For each coin c in coins:
 *     If a >= c: dp[a] = min(dp[a], 1 + dp[a - c])
 *
 * Using coin c to reach amount a costs 1 coin plus however many
 * coins were needed for amount (a - c).
 *
 * Base case: dp[0] = 0 (zero coins needed for amount 0).
 * Initialization: dp[a] = amount + 1 as a sentinel "infinity"
 *   (since valid answers are always <= amount).
 * Final answer: dp[amount] if dp[amount] <= amount, else -1.
 *
 * This is an unbounded knapsack problem — each coin type can be reused.
 *
 * KEY CONCEPTS
 * ------------
 * - Unbounded knapsack variant
 * - Recurrence: dp[a] = 1 + min(dp[a - c]) for each valid coin c
 * - Sentinel infinity: initialize to amount + 1
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(amount * coins.length)
 * Space: O(amount)
 * ============================================================
 */
public class P322CoinChange {
    public int coinChange(int[] coins, int amount) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P322CoinChange sol = new P322CoinChange();
        System.out.println(sol.coinChange(new int[]{1, 5, 11}, 11)); // 3
        System.out.println(sol.coinChange(new int[]{2}, 3));          // -1
        System.out.println(sol.coinChange(new int[]{1}, 0));          // 0
    }
}
