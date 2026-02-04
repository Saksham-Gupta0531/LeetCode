// Last updated: 2/4/2026, 12:28:58 PM
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        // used property 
        int a=0;
        int b=0;
        for ( int x: arr1)a=a^x;
        for ( int x: arr2)b=b^x;
        return a&b;
    }
}