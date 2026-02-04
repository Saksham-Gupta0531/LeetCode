// Last updated: 2/4/2026, 12:29:58 PM
class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int MOD = 1_000_000_007;
        int n = arr.length;

        long kadane = 0, curr = 0;
        for (int x : arr) {
            curr = Math.max(0, curr + x);
            kadane = Math.max(kadane, curr);
        }

        if (k == 1) return (int)(kadane % MOD);

        long totalSum = 0;
        for (int x : arr) totalSum += x;


        long prefix = 0, maxPrefix = 0;
        for (int x : arr) {
            prefix += x;
            maxPrefix = Math.max(maxPrefix, prefix);
        }

        long suffix = 0, maxSuffix = 0;
        for (int i = n - 1; i >= 0; i--) {
            suffix += arr[i];
            maxSuffix = Math.max(maxSuffix, suffix);
        }

        long result;
        if (totalSum > 0) {
            result = Math.max(
                maxPrefix + maxSuffix + (long)(k - 2) * totalSum,
                kadane
            );
        } else {
            result = Math.max(maxPrefix + maxSuffix, kadane);
        }

        return (int)(result % MOD);
    }
}
