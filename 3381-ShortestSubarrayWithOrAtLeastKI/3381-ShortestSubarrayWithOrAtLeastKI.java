// Last updated: 2/4/2026, 12:27:13 PM
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int length=nums.length;
        int len=length+1,val=0;
        for(int i=0;i<length;i++)
        {
            val=0;
            for(int j=i;j<length;j++)
            {
                val|=nums[j];
                if(val>=k)
                {
                    len=Math.min(len,j+1-i);
                }
            }
        }
        return len == length+1 ? -1 : len;
    }
}