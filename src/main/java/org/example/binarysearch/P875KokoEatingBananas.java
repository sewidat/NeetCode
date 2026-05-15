package org.example.binarysearch;

/**
 * ============================================================
 * LeetCode #875 - Koko Eating Bananas
 * Difficulty: Medium
 * Category: Binary Search
 * ============================================================
 *
 * PROBLEM
 * -------
 * Koko can eat k bananas per hour from h piles. Each hour she picks one
 * pile and eats min(k, pile) bananas from it. She must finish all piles
 * within h hours. Find the minimum integer eating speed k.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= piles.length <= 10^4
 * piles.length <= h <= 10^9
 * 1 <= piles[i] <= 10^9
 *
 * EXAMPLES
 * --------
 * piles=[3,6,7,11], h=8          → 4
 * piles=[30,11,23,4,20], h=5     → 30
 *
 * INTUITION & APPROACH
 * --------------------
 * Binary search on the answer k in the range [1, max(piles)]. For a
 * given k, compute total hours needed = sum(ceil(pile / k)) for all
 * piles. If total hours <= h, k is feasible (try a lower value);
 * otherwise k is too small (try higher). O(n log(max(piles))).
 *
 * KEY CONCEPTS
 * ------------
 * Binary search on answer, feasibility check function
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n log m) where m = max(piles)
 * Space: O(1)
 * ============================================================
 */
public class P875KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        // TODO: implement
        return 0;
    }

    public static void main(String[] args) {
        P875KokoEatingBananas sol = new P875KokoEatingBananas();
        System.out.println(sol.minEatingSpeed(new int[]{3, 6, 7, 11}, 8)); // expected 4
    }
}
