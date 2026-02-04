// Last updated: 2/4/2026, 12:32:46 PM
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //List<Integer> ak = Arrays.asList(nums);
        Set<Integer> s =  new HashSet<>();
        
        for (int i : nums){
            s.add(i);
        }
        return (s.size()!=nums.length);
        }
}