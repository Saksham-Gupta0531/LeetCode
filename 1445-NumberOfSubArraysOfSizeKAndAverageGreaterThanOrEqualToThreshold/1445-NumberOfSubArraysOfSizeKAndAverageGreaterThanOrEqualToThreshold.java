// Last updated: 2/4/2026, 12:29:42 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c= 0;
        int s =0;
        int l =k-1;
        int sum =0;
        for(int x =0 ; x<k ;x++) sum+=arr[x];
        while(l<arr.length){
            if (sum/k >= threshold){
                c++;
            }
            l++;
            if (l<arr.length)
                sum=sum-arr[s]+arr[l];
            s++;
        }
        return c;
    }
}