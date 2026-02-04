// Last updated: 2/4/2026, 12:26:18 PM
class Solution {
    public long perfectPairs(int[] nums) {
        long[] ab = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            ab[i]=Math.abs((long)nums[i]);
        }
        Arrays.sort(ab);
        long ans=0L;
        int r=0;
        for(int l=0;l<nums.length;l++){
            if(r<l) r=l;
            while(r+1<nums.length && ab[r+1]<=2L*ab[l]){
                r++;
            }
            ans+=(r-l);
        }
        return ans;
    }
}