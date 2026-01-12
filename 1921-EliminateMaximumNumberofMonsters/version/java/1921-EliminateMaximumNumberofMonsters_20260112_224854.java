// Last updated: 1/12/2026, 10:48:54 PM
1class Solution {
2    public int eliminateMaximum(int[] dist, int[] speed) {
3        if (dist.length == 0 || speed.length == 0) {
4            return 0;
5        }
6
7        double[] time = new double[dist.length];
8        for (int i = 0; i < dist.length; i++) {
9            time[i] = (double) dist[i] / speed[i];
10        }
11
12        Arrays.sort(time);
13
14        int count = 0;
15        for (int i = 0; i < time.length; i++) {
16            if (time[i] <= i) {
17                break;
18            }
19            count++;
20        }
21
22        return count;
23    }
24}