// Last updated: 2/4/2026, 12:27:43 PM
class Solution {
    public int distMoney(int m, int c) {
        if (m < c) return -1;
        m=m-c;
        int r = Math.min(m/7,c);
        if (r == c-1 && m-r*7 ==3) r--;
        if (r == c && m>7*c) r--;
        
        return r;
    }
}