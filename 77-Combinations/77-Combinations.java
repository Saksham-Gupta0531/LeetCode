// Last updated: 9/4/2025, 6:15:08 AM
class Solution {
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        back(1,n,k,arr,l);
        return l;
        
    }
    public void back(int s,int n ,int k , List<Integer> arr, List<List<Integer>> l){
        if (arr.size()==k){
            l.add(new ArrayList<>(arr));
            
            return;
        }
        for (int i = s; i <= n; ++i) {
            arr.add(i);
            back(i + 1, n, k, arr, l);
            arr.remove(arr.size() - 1);
        }

    }
}