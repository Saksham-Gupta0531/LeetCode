// Last updated: 9/5/2025, 8:16:31 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        if (Math.abs(z-x)>Math.abs(z-y)) return 2;
        else if(Math.abs(z-x)<Math.abs(z-y)) return 1;
        return 0;
    }
}