package org.example.heap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * ============================================================
 * LeetCode #355 - Design Twitter
 * Difficulty: Medium
 * Category: Heap / Priority Queue
 * ============================================================
 *
 * PROBLEM
 * -------
 * Design a simplified version of Twitter with the following operations:
 * - postTweet(userId, tweetId): Compose a new tweet.
 * - getNewsFeed(userId): Retrieve the 10 most recent tweet IDs in
 *   the user's news feed. Each item must be from users the user
 *   follows or from the user themselves. Ordered most recent first.
 * - follow(followerId, followeeId): Follower follows the followee.
 * - unfollow(followerId, followeeId): Follower unfollows the followee.
 *
 * CONSTRAINTS
 * -----------
 * 1 <= userId, tweetId <= 500
 * At most 3 * 10^5 calls will be made to the methods.
 * A user always follows themselves implicitly.
 *
 * EXAMPLES
 * --------
 * Twitter t = new Twitter();
 * t.postTweet(1, 5);
 * t.getNewsFeed(1)      -> [5]
 * t.follow(1, 2);
 * t.postTweet(2, 6);
 * t.getNewsFeed(1)      -> [6, 5]
 * t.unfollow(1, 2);
 * t.getNewsFeed(1)      -> [5]
 *
 * INTUITION & APPROACH
 * --------------------
 * Store tweets per user as a list of (timestamp, tweetId) pairs,
 * with a global monotonically increasing timestamp counter.
 * For getNewsFeed: collect pointers to the tail of each followed
 * user's tweet list (including the user themselves). Use a max-heap
 * ordered by timestamp to merge these lists and extract the top 10.
 * Follow/unfollow: maintain a HashSet<Integer> of followee IDs per
 * user for O(1) add/remove/lookup.
 *
 * KEY CONCEPTS
 * ------------
 * - HashMap<userId, List<int[]{timestamp, tweetId}>> for tweet storage
 * - HashMap<userId, HashSet<followeeId>> for social graph
 * - Max-heap merge of per-user tweet lists for getNewsFeed
 * - Global timestamp counter for ordering
 *
 * COMPLEXITY TARGETS
 * ------------------
 * Time:  O(f log f) for getNewsFeed where f = number of followees
 * Space: O(total tweets + total follow relationships)
 * ============================================================
 */
public class P355DesignTwitter {

    static class Twitter {

        public Twitter() {
            // TODO: implement
        }

        public void postTweet(int userId, int tweetId) {
            // TODO: implement
        }

        public List<Integer> getNewsFeed(int userId) {
            // TODO: implement
            return new ArrayList<>();
        }

        public void follow(int followerId, int followeeId) {
            // TODO: implement
        }

        public void unfollow(int followerId, int followeeId) {
            // TODO: implement
        }
    }

    public static void main(String[] args) {
        // Twitter t = new Twitter();
        // t.postTweet(1, 5);
        // System.out.println(t.getNewsFeed(1)); // expected [5]
        // t.follow(1, 2);
        // t.postTweet(2, 6);
        // System.out.println(t.getNewsFeed(1)); // expected [6, 5]
        // t.unfollow(1, 2);
        // System.out.println(t.getNewsFeed(1)); // expected [5]
        System.out.println("P355DesignTwitter — uncomment examples above to test.");
    }
}
