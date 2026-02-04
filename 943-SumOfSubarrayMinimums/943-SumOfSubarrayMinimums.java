// Last updated: 2/4/2026, 12:30:28 PM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stLeft  = new Stack<>();
        int[] left = new int[arr.length];
        int n =  arr.length; 
        for (int i = 0 ; i< n ;i++){
            while(!stLeft.isEmpty() && arr[stLeft.peek()]>arr[i]){
                stLeft.pop();
            }
            if (stLeft.isEmpty() ){
                left[i]= i+1;   
            }
            else {
                left[i] = i-stLeft.peek();
            }

            stLeft.push(i);
            // System.out.print(left[i]+" ");
        }
        //System.out.println();
        Stack<Integer> stRight  = new Stack<>();
        int[] right = new int[arr.length];
       
        for (int i = n -1; i>=0 ;i--){
            while(!stRight.isEmpty() && arr[stRight.peek()]>=arr[i]){
                stRight.pop();
            }
            if (stRight.isEmpty() ){
                right[i]= n-i;   
            }
            else {
                right[i] = stRight.peek()-i;
            }
            stRight.push(i);
            //System.out.print(right[i]);
        }
        long ans = 0;
        long mod = 1000000007;
        for(int i= 0; i<n ;i++ ){
            ans= (ans + (long)left[i]*right[i]*arr[i])%mod;
        }
        return (int)(ans) ;
    }
}