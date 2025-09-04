// Last updated: 9/4/2025, 6:15:26 AM
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int minc = 0;
        int minr = 0;
        int maxc = arr[0].length-1;
        int maxr = arr.length-1;
           List<Integer> lst = new ArrayList<>();
		int t = arr.length * arr[0].length;
		int c = 0;
		while(c<t) {
			for(int i = minc; i<=maxc && c<t; i++) {
				lst.add(arr[minr][i]);
				c++;
			}
			minr++;
			
			for(int i = minr; i<=maxr && c<t; i++) {
				lst.add(arr[i][maxc]);
				c++;
			}
			maxc--;
			
			for(int i = maxc; i>=minc && c<t; i--) {
				lst.add(arr[maxr][i] );
				c++;
			}
			maxr--;
			
			for(int i = maxr; i>=minr && c<t; i--) {
				lst.add(arr[i][minc] );
				c++;
			}
			minc++;
		}
        return lst;
    }
}
