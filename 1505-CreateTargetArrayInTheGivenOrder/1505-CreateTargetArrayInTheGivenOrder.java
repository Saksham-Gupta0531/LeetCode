// Last updated: 9/3/2025, 5:27:53 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for (int i= 0 ;i<nums.length;i++ ){
            target.add(index[i],nums[i]);
        }
        int[] n = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            n[i] = target.get(i);
        }
    return n;
    }
}