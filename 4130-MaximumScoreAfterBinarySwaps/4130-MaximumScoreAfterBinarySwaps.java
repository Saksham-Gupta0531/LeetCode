// Last updated: 2/4/2026, 12:25:28 PM
import java.util.*;

class Solution {
    public long maximumScore(int[] nums, String s) {
        int n = nums.length;
        // Max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long score = 0;

        for (int i = 0; i < n; i++) {
            pq.offer(nums[i]);
            if (s.charAt(i) == '1') {
                score += pq.poll();
            }
        }
        return score;
    }
}
