// Last updated: 1/25/2026, 11:12:50 PM
1class Solution {
2    public int maxProfit(int[] inventory, int orders) {
3        int lo = 1, hi = (int)1e9, m = hi + 7;
4        while(lo < hi){
5            int mid = (lo + hi) >> 1;
6            long need = 0;
7            for (int n : inventory){
8                need += Math.max(0, n - mid);
9            }
10            if (need < orders){
11                hi = mid;
12            }else{
13                lo = mid + 1;
14            }
15        }
16
17        long ans = 0;
18        for (int n : inventory){
19            ans = (ans + Math.max(0L, 1L*(lo + 1 + n)*(n - lo)/2)) % m;
20            orders -= Math.max(0, n - lo);
21        }
22
23        return (int)((ans + 1L*orders * lo) % m);
24    }
25}