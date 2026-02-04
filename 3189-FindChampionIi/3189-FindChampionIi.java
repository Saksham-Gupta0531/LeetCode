// Last updated: 2/4/2026, 12:27:21 PM
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] ind = new int[n];
        for (int[] arr : edges){
            ind[arr[1]]++;
        }
        int ans= -1;
        for ( int i =0 ; i<n ;i++){
            if ( ind[i]== 0 && ans ==-1) ans = i;
            else if(ind[i]== 0 && ans !=-1) return -1;
        }
        return ans ;
    }
}