// Last updated: 1/12/2026, 8:58:07 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3       int[] min_price = new int[k+1];
4       int[] max_profit = new int[k+1];
5       Arrays.fill(min_price,Integer.MAX_VALUE) ;
6
7       for (int price :prices){
8        for (int i=1 ;i<=k;i++){
9            min_price[i]= Math.min(min_price[i], price-max_profit[i-1]);
10            max_profit[i] = Math.max(max_profit[i],price-min_price[i]);
11        }
12       }
13       return max_profit[k];
14    }
15}