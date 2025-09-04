// Last updated: 9/4/2025, 6:15:15 AM
class Solution {
    public int mySqrt(int x) {
        int first = 0;
        int last = x;
        while (first <= last) {
            int mid = (first + (last)) / 2;
            long sq = (long)mid *(long ) mid;
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        
        return last;
    }
    
}