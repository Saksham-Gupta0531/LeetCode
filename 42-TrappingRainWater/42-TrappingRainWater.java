// Last updated: 9/4/2025, 6:15:36 AM
class Solution {
    public int trap(int[] arr) {
        int n= arr.length;
        int[] pm = new int[n];
        pm[0]= arr[0];
        for (int i =1; i< n; i++){
            if(pm[i-1]>arr[i]){
                pm[i]=pm[i-1];
            }
            else{
                pm[i]=arr[i];
            }
        }

        int[] sm = new int[n];
        sm[n-1]=arr[n-1];
        for (int i=n-2 ;i>=0 ;i--){
            if (sm[i+1]>arr[i]){
                sm[i]= sm[i+1];
            }
            else
                sm[i]= arr[i];
        }
        int sum =0;
        for (int i =0 ; i<n ;i++){
            sum = sum + Math.min(pm[i],sm[i]) -arr[i];
        }
        return sum;
    }
}