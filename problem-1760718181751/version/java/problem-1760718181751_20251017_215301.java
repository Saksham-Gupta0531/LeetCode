// Last updated: 10/17/2025, 9:53:01 PM
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