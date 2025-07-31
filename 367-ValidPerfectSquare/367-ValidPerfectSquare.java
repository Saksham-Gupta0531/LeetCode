// Last updated: 7/31/2025, 12:29:44 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        return perfect(num);
    }
    public static boolean perfect(int num){
        long first=0;
        long last=num;
        while( first <= last ){
            long mid=(first + last)/2;
            if ( num  == mid *mid )
                return true;
            
            else if( num > mid *mid )   
                first = mid+1;

            else
                last = mid-1;
        }
        return false ;
    }
}