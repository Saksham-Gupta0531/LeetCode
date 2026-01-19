// Last updated: 1/19/2026, 11:23:22 PM
1class Solution {
2    public int numberWays(List<List<Integer>> hats) {
3        int n = hats.size(), i, j, ind;
4        ArrayList<Integer>[] people = new ArrayList[40];
5        for (i = 0 ; i < 40 ; i ++) {
6            people[i] = new ArrayList<Integer>();
7        }
8        i = 0;
9        for (List<Integer> ppl : hats) {
10            for (int h : ppl) {
11                people[h - 1].add(i);
12            }
13            i ++;
14        }
15        int[] pow = new int[n + 1];
16        pow[0] = 1;
17        for (j = 1 ; j <= n ; j ++) {
18            pow[j] = pow[j - 1] * 2;
19        }
20        int l = pow[n];
21        long[] dpCurr = new long[l];
22        long[] dpNext = new long[l];
23        long[] t;
24        dpCurr[0] = 1;
25        for (i = 0 ; i < 40 ; i ++) {
26            if (people[i].size() == 0) {
27                continue;
28            }
29            System.arraycopy(dpCurr, 0, dpNext, 0, l);
30            for (int p : people[i]) {
31                for (j = 0 ; j < l ; j ++) {
32                    ind = pow[p] | j;
33                    if (ind != j) {
34                        dpNext[ind] += dpCurr[j];
35                    }
36                }
37            }
38            t = dpCurr;
39            dpCurr = dpNext;
40            dpNext = t;
41        }
42        return (int) (dpCurr[l - 1] % 1000000007);
43    }
44}