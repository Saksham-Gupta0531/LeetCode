// Last updated: 1/12/2026, 8:39:06 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int s1 =0 ;
4        int s2 =0 ;
5        int b1 =Integer.MIN_VALUE ;
6        int b2 =Integer.MIN_VALUE ;
7
8        for (int i= 0 ; i<prices.length ;i++){
9            b1 =Math.max(b1 ,-prices[i]);
10            s1 =Math.max(s1 ,b1+prices[i]);
11            
12            b2 =Math.max(b2 ,s1-prices[i]);
13            s2 =Math.max(s2 ,b2+prices[i]);
14        }
15        return s2;
16    }
17    
18}