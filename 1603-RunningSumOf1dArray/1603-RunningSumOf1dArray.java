// Last updated: 7/31/2025, 12:28:28 PM
class Solution {
    public int[] runningSum(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length ;i++){
            arr[i]=sum+arr[i];
            sum=arr[i];
        } 
        return arr;
    }
}