// Last updated: 7/31/2025, 12:29:28 PM
class Solution {
    public int arrangeCoins(int n) {
        return (int) check(n);
    }
    public static long check(long num){
        long first=0;
        long last=num;
        long mid=0;
        while( first <= last ){
            mid=(first + last)/2;
            if ( 2*num  == mid*mid +mid  )
                return mid;

            else if( 2*num > mid*mid +mid )
                first = mid+1;

            else
                last = mid-1;
        }
        return last ;
    }
}
