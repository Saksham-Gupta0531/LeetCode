// Last updated: 7/31/2025, 12:29:10 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int str=0;
        int ei=0;
        int p=1;
        
        while (ei<nums.length ){//grow
        p=p*nums[ei];
        //shrink
        while(p>=k && str <= ei){
            p=p/nums[str];
            str++;
        }
        // update
        ans = ans+ei-str+1;
        ei++;
        }
        return ans;
    }
}