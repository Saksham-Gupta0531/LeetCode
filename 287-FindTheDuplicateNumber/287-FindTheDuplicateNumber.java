// Last updated: 2/4/2026, 12:32:29 PM
class Solution {
    public int findDuplicate(int[] nums) {
       int n = nums.length;
       int slow = nums[0];
       int fast = nums[0];
       while ( true ){
        slow = nums[slow];
        fast = nums[nums[fast]];
        if (slow == fast) break;
        }
       int pos = nums[0];
       while ( slow != pos){
        slow = nums[slow];
        pos = nums[pos];
       }
    return pos;
    }
}
        