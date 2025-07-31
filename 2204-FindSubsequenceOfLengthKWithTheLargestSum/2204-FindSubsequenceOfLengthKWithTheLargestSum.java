// Last updated: 7/31/2025, 12:28:15 PM

import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] indexed = new int[n][2];

        for (int i = 0; i < n; i++) {
            indexed[i][0] = nums[i];
            indexed[i][1] = i;
        }

        Arrays.sort(indexed, (a, b) -> b[0] - a[0]); 
        int[][] topK = Arrays.copyOfRange(indexed, 0, k);

        Arrays.sort(topK, Comparator.comparingInt(a -> a[1])); 

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }
        return result;
    }
}