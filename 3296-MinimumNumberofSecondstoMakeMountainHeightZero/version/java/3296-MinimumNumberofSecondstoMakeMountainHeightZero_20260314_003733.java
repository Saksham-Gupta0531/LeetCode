// Last updated: 3/14/2026, 12:37:33 AM
1class Solution {
2    public long minNumberOfSeconds(long mountainHeight, int[] workerTimes) {
3        if (mountainHeight == 0) {
4            return 0;
5        }
6
7        boolean zeroTimeWorkerExists = false;
8        for (int wTime : workerTimes) {
9            if (wTime == 0) {
10                zeroTimeWorkerExists = true;
11                break;
12            }
13        }
14
15        if (zeroTimeWorkerExists) {
16            return 0;
17        }
18
19        long low = 0;
20        long high = 200000000000000000L;
21        long ans = high;
22
23        while (low <= high) {
24            long mid = low + (high - low) / 2;
25            if (check(mid, mountainHeight, workerTimes)) {
26                ans = mid;
27                high = mid - 1;
28            } else {
29                low = mid + 1;
30            }
31        }
32        return ans;
33    }
34
35    private static boolean check(long T, long mountainHeight, int[] workerTimes) {
36        if (T == 0) {
37            return mountainHeight == 0;
38        }
39
40        long totalHeightReduced = 0;
41        for (int wTime : workerTimes) {
42            long threshold = 2 * T;
43            threshold /= wTime;
44
45            long lowX = 0;
46            long highX = 2000000000L;
47            long maxXForWorker = 0;
48
49            while (lowX <= highX) {
50                long midX = lowX + (highX - lowX) / 2;
51                long currentProduct = midX * (midX + 1);
52
53                if (currentProduct <= threshold) {
54                    maxXForWorker = midX;
55                    lowX = midX + 1;
56                } else {
57                    highX = midX - 1;
58                }
59            }
60            totalHeightReduced += maxXForWorker;
61            if (totalHeightReduced >= mountainHeight) {
62                return true;
63            }
64        }
65        return totalHeightReduced >= mountainHeight;
66    }
67}