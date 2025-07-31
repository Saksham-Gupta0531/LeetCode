// Last updated: 7/31/2025, 12:28:44 PM
class Solution {
    public int fib(int n) {
    int f=0;
    int f2=1;
    if (n==0){
        return 0;
    }
    for(int i=2 ; i<n; i++){
        int temp=f2;
        f2=f+f2;
        f=temp;
    } 
    return f+f2 ; 
    }
}