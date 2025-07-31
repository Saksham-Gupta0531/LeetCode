// Last updated: 7/31/2025, 12:28:38 PM
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int a=Integer.MIN_VALUE;
        int val=values[0];
        for (int i=1 ; i<values.length ;i++){
            int s = values[i]+ val-i;
            a= Math.max(s,a);
            val= Math.max(val,values[i]+i);
        
        }
        return a;

    }
}