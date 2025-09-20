// Last updated: 9/20/2025, 11:16:09 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s =  new HashSet<>();
        
        for (int i : nums){
           if (s.contains(i)) return i;
            s.add(i);
        }
        return 0;
        
    }
}
        