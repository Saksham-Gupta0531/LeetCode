// Last updated: 1/24/2026, 9:54:23 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        LinkedList<int[]> stack = new LinkedList<>();
4        int max = 0;
5        for(int num : nums) {
6            int score = 0;
7            while(stack.size() > 0 && stack.getLast()[0] <= num) {
8                score = Math.max(score, stack.removeLast()[1]);
9            }
10            stack.add(new int[]{num, stack.size() == 0 ? 0 : score+1});
11            max = Math.max(max, stack.getLast()[1]);
12        }
13        return max;
14    }
15}