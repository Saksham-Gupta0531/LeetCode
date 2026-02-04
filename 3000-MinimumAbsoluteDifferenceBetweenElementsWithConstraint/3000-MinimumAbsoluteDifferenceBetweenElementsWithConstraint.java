// Last updated: 2/4/2026, 12:27:28 PM
class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        if(x==0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        int min = Integer.MAX_VALUE;

        for(int i=x; i<nums.size(); i++){
            int val = nums.get(i);
            set.add(nums.get(i-x));
            Integer cl = set.ceiling(val);
            Integer fl = set.floor(val);

            if(cl!=null) min = Math.min(min, Math.abs(cl-val));
            if(fl!=null) min = Math.min(min, Math.abs(fl-val));
        }

        return min;
    }
}