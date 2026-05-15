package org.example.backtracking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ============================================================
 * LeetCode #17 - Letter Combinations of a Phone Number
 * Difficulty: Medium
 * Category: Backtracking
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string containing digits from 2 to 9 inclusive, return
 * all possible letter combinations that the number could represent.
 * Return the answer in any order. The mapping of digits to letters
 * follows a standard telephone keypad:
 *   2 -> "abc", 3 -> "def", 4 -> "ghi", 5 -> "jkl",
 *   6 -> "mno", 7 -> "pqrs", 8 -> "tuv", 9 -> "wxyz"
 *
 * CONSTRAINTS
 * -----------
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 *
 * EXAMPLES
 * --------
 * Input:  digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * Input:  digits = ""
 * Output: []
 *
 * Input:  digits = "2"
 * Output: ["a","b","c"]
 *
 * INTUITION & APPROACH
 * --------------------
 * Build a mapping from each digit character to its corresponding
 * letters string. Backtrack digit by digit: at each index i, look
 * up the letters for digits.charAt(i), iterate over each letter,
 * append it to a StringBuilder, recurse on index i+1, then delete
 * the last character (backtrack). When i equals digits.length(),
 * the combination is complete; add it to results. Return early if
 * digits is empty.
 *
 * KEY CONCEPTS
 * ------------
 * - Digit-to-letters mapping (HashMap or array indexed by digit char)
 * - Backtracking with StringBuilder for efficient string building
 * - Early return for empty input
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(4^n * n) where n = digits.length (4 is max letters per digit)
 * Space: O(n) recursion stack depth
 * ============================================================
 */
public class P17LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        // TODO: implement
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        P17LetterCombinationsOfAPhoneNumber sol = new P17LetterCombinationsOfAPhoneNumber();
        // System.out.println(sol.letterCombinations("23"));
        // expected ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        // System.out.println(sol.letterCombinations(""));
        // expected []
        System.out.println("P17LetterCombinationsOfAPhoneNumber — uncomment examples above to test.");
    }
}
