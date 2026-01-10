// Last updated: 1/10/2026, 5:15:18 PM
1class Solution {
2    public int minDays(int[] arr, int m, int k) {
3        if( m*k > arr.length) return -1;
4
5        int left =1 ;
6        int res =-1;
7        int right =Arrays.stream(arr).max().getAsInt();
8        while ( left<= right){
9            int mid = (left + right) / 2;
10            if ( boque(arr , k , mid )>=m){
11                right = mid -1;
12                res = mid;
13            }
14            else {
15                left = mid+1 ;
16            }
17        }
18        return res ;
19        
20    }
21    public int  boque(int[] arr , int k , int n){
22        int count =0;
23        int v= 0;
24        for ( int i =0; i< arr.length ; i++ ){
25            
26            if ( arr[i]<=n){
27                v++;
28            }
29            else {
30                v=0;
31            }
32            if ( v==k) {
33                count++;
34                v=0;
35            }
36        }
37        return count;
38        
39    }
40}