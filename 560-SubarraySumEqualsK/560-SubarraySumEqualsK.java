// Last updated: 2/4/2026, 12:31:32 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        for (int i =1 ;i<nums.length ;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        int count=0 ;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int a : nums){
            if(map.containsKey(a - k)){
                count+= map.get(a - k);
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return count;
    }
        
}