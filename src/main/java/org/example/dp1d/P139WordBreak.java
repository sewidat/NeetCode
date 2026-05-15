package org.example.dp1d;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #139 - Word Break
 * Difficulty: Medium
 * Category: 1-D Dynamic Programming
 * ============================================================
 *
 * PROBLEM
 * -------
 * Given a string s and a dictionary of strings wordDict, return true if
 * s can be segmented into a space-separated sequence of one or more
 * dictionary words. Words in wordDict can be reused multiple times.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of lowercase English letters.
 * All strings in wordDict are unique.
 *
 * EXAMPLES
 * --------
 * s = "leetcode",    wordDict = ["leet","code"]                       → true
 * s = "applepenapple", wordDict = ["apple","pen"]                     → true
 * s = "catsandog",   wordDict = ["cats","dog","sand","and","cat"]     → false
 *
 * INTUITION & APPROACH
 * --------------------
 * Define dp[i] = true if the substring s[0..i-1] (first i characters)
 * can be fully segmented using words from wordDict.
 *
 * For each end index i (1 to n):
 *   For each start index j (0 to i-1):
 *     If dp[j] is true AND s.substring(j, i) is in the word set:
 *       dp[i] = true; break inner loop.
 *
 * Put wordDict into a HashSet for O(1) average lookup.
 * Base case: dp[0] = true (empty prefix is trivially segmented).
 * Answer: dp[n].
 *
 * KEY CONCEPTS
 * ------------
 * - dp[i] = true means s[0..i-1] is fully segmentable
 * - Recurrence: dp[i] = any dp[j] && s[j..i-1] in wordSet  (0 <= j < i)
 * - HashSet for O(1) word lookup
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(n^2 * m) where m = average word length (substring creation)
 * Space: O(n + w) where w = total characters in wordDict
 * ============================================================
 */
public class P139WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // TODO: implement
        return false;
    }

    public static void main(String[] args) {
        P139WordBreak sol = new P139WordBreak();
        System.out.println(sol.wordBreak("leetcode", List.of("leet", "code")));            // true
        System.out.println(sol.wordBreak("applepenapple", List.of("apple", "pen")));       // true
        System.out.println(sol.wordBreak("catsandog", List.of("cats","dog","sand","and","cat"))); // false
    }
}
