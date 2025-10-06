// Last updated: 10/7/2025, 1:22:00 AM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 0, right = Long.MAX_VALUE / time.length;
        
        while (left < right) {
            long mid = (left + right) / 2;
            long trips = 0;
            
            for (int t : time) {
                trips += mid / t;
                
                if (trips >= totalTrips) break;
            }
            
            if (trips < totalTrips) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
