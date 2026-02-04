// Last updated: 2/4/2026, 12:25:40 PM
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
