// Last updated: 7/31/2025, 12:28:04 PM
class Solution {
    public int differenceOfSums(int n, int m) { 
        int k = n / m;
        return (n * (n + 1)) / 2 - k * (k + 1) * m;
    }
}