// Last updated: 1/16/2026, 8:44:50 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if(dividend == Integer.MIN_VALUE && divisor == -1)
4            return Integer.MAX_VALUE;
5        int a = Math.abs(dividend);
6        int b = Math.abs(divisor);
7        int res=0;
8        
9        while(a-b >=0)
10        {
11            int x=0;
12            while(a-(b<<1<<x) >= 0)
13                x++;
14            res += (1<<x);
15            a -= (b<<x);
16        }
17        
18        return (dividend>0 == divisor>0) ? res : -res;
19    }
20}