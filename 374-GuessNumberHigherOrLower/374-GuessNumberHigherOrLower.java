// Last updated: 7/31/2025, 12:29:42 PM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long first=0;
        long last=n;
        while( first <= last ){
            long mid=(first + last)/2;
            if ( guess((int)mid) == 0 )
                return (int)mid;

            else if( guess((int)mid)==1)
                first = mid+1;

            else
                last = mid-1;
            }
            return 0;
        }
        
    }