// Last updated: 10/19/2025, 8:17:17 AM
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {set.add(n);}
        int i = k;
        while (true) {
            
            if (!set.contains(i)){return i;}
            i += k;
        }
    }
}
