// Last updated: 9/4/2025, 6:15:13 AM
class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int a=3,b=2;
        for(int i = 0;i<n-3;i++){
            a=a+b;
            b=a-b;
        }
        return a;
        
    }
}
