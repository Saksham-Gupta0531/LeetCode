// Last updated: 10/1/2025, 6:38:20 PM
class Solution {
    public int numWaterBottles(int b, int r) {
        int sum =b;
        int rem=0;
        int q=b;
        while (b >= r){
            q= b/r;
            rem = b%r;
            b= q+rem;
            sum = sum +q;
            
        }
        return sum;
    }
}