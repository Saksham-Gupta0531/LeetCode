// Last updated: 7/31/2025, 12:28:26 PM
class Solution {
    public int minDays(int[] arr, int m, int k) {
        
        
            int res=-1;
            int left = 0;
            int right = Arrays.stream(arr).max().getAsInt();
            while (left <= right){
               int mid= (left+right)/2;
                if(botrue(arr,mid,k)>=m){
                    right = mid-1;
                    res=mid;
                }
                else{
                    left= mid+1;
                }
            }
            return res;
        
    }
    public static int botrue(int[] arr, int mid ,int k ){
        int n=0;
        int c=0;
        for(int i=0; i<arr.length ;i++){
            if(arr[i]<=mid){
                c++;
            }
            else{
                    c=0;
            }
            if(c==k){
                    n++;
                    c=0;
            }

        }
        return n;
    }
}