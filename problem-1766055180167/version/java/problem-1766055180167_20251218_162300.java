// Last updated: 12/18/2025, 4:23:00 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3    
4        int currp =0;
5        int bo = prices[0];
6        for (int  i=1 ; i< prices.length; i++){
7            if ( currp < prices[i]- bo){
8                currp = prices[i] - bo;
9            }
10            if ( prices[i]< bo){
11                bo = prices[i];
12            }
13            
14        }
15        return currp;
16    }
17}