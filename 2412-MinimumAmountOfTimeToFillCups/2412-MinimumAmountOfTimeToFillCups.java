// Last updated: 2/4/2026, 12:28:07 PM
class Solution {
    public int fillCups(int[] arr) {
        if (arr[0]>arr[1]+arr[2] || arr[1]>arr[2]+arr[0] || arr[2]>arr[1]+arr[0]) 
            return Math.max(arr[2],Math.max(arr[1],arr[0]));
        if ((arr[0]+arr[1]+arr[2] )%2 ==0) return (arr[0]+arr[1]+arr[2] )/2;
        else return (arr[0]+arr[1]+arr[2]+1 )/2;
    }

}