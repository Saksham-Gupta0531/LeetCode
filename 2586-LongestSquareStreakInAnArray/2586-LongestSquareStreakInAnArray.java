// Last updated: 7/31/2025, 12:28:11 PM
import java.util.*;

class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = -1;

        // Track visited numbers to avoid duplicate calculations
        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {
            if (visited.contains(num)) continue;

            int count = 0;
            int current = num;

            // Generate square sequence until square is not found in the set
            while (numSet.contains(current)) {
                visited.add(current);
                count++;
                // Prevent overflow by checking before squaring
                if (current > Math.sqrt(Integer.MAX_VALUE)) break;
                current = current * current;
            }

            maxLength = Math.max(maxLength, count);
        }

        return maxLength > 1 ? maxLength : -1;
    }
}
