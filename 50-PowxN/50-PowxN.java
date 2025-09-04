// Last updated: 9/4/2025, 6:15:28 AM
class Solution {
    public double myPow(double x, long n) {
        double p=0;
        if (n == 0) 
            return 1;
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double result = myPow(x * x, n / 2);
        
        if (n % 2 != 0) 
            result *= x;

        return result;
    }
}