// Last updated: 7/31/2025, 12:28:54 PM
class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int left = 0;
        int right=a.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(a[mid]<a[mid+1]){
            
                left = mid+1;
            }
            else {
                right = mid - 1;
            }

        }
        return left;
    }
    
}