// Last updated: 2/4/2026, 12:31:44 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums2){
            while(!stk.isEmpty() && i > stk.peek()){
                int val = stk.pop();
                map.put(val, i);
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(), -1);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}