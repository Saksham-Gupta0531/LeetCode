// Last updated: 9/5/2025, 8:17:11 AM
class Solution {
    public int brokenCalc(int startValue, int target) {
        int c=0;
        while (startValue<target)
        {
            if (target%2==0)
            {
                target/=2;
            }
            else
            {
                ++target;
            }
            c++;
        }
        return c+ startValue-target;
    }
}