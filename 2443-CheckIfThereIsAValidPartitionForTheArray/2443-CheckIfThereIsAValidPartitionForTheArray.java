// Last updated: 2/4/2026, 12:28:00 PM
class Solution {
    int n;
    Boolean[]t;
    public boolean validPartition(int[] nums) {
        n = nums.length;
        t = new Boolean[n + 1];
        if(n == 2) return nums[0] == nums[1];
        return rec(0, nums);
    }

    public boolean rec(int i, int[] nums){

        if(i == n) return true;

        if(i == n - 2) return nums[i] == nums[i + 1]; // only 2 ele left so just check if they are equal return true else false
        
        if(i == n - 1) return false; // not possible only one element left

        if(t[i] != null) return t[i];

        if(nums[i] == nums[i + 1]){ // 1st condition
            if(rec(i + 2, nums)) return true;
        }

        if(nums[i] == nums[i + 1] && nums[i + 2] == nums[i]){ // 2nd condition
            if(rec(i + 3, nums)) return true;
        }
        else if(nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]){ // 3rd condition
            if(rec(i + 3, nums)) return true;
        }
        
        return t[i] = false;
    }
}