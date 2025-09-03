// Last updated: 9/3/2025, 5:27:50 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = k;  
        boolean firstOne = false; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (!firstOne) {
                    firstOne = true; 
                } else if (n < k) {
                    return false; 
                }
                n = 0; 
            } else {
                if (firstOne) n++; // count zeros only after first 1
            }
        }
        return true;
    }
}
