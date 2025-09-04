// Last updated: 9/4/2025, 6:15:39 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int amount) {
        List<List<Integer>> ans = new ArrayList<>();
		List<Integer> lst = new ArrayList<>();
		combination(coin, amount, lst, 0, ans);
        return ans;
    }
    public static void combination(int[] coin, int amount, List<Integer> lst, int idx, List<List<Integer>> ans) {
		if(amount == 0) {
			ans.add(new ArrayList<>(lst));
			return;
		}
		
		for(int i = idx; i< coin.length; i++) {
			if(amount >= coin[i]) {
				lst.add(coin[i]);
				combination(coin, amount - coin[i],  lst, i, ans);
				lst.remove(lst.size() - 1);
			}
		}
	}
}