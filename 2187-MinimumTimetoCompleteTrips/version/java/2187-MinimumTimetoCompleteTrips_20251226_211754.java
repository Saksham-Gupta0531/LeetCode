// Last updated: 12/26/2025, 9:17:54 PM
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3        long left = 0, right = Long.MAX_VALUE / time.length;
4        
5        while (left < right) {
6            long mid = (left + right) / 2;
7            long trips = 0;
8            
9            for (int t : time) {
10                trips += mid / t;
11                
12                if (trips >= totalTrips) break;
13            }
14            
15            if (trips < totalTrips) {
16                left = mid + 1;
17            } else {
18                right = mid;
19            }
20        }
21        
22        return left;
23    }
24}
25