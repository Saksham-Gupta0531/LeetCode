// Last updated: 2/4/2026, 12:32:10 PM
import java.util.*;
class Solution {
  public int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, (a, b) -> {
    if (a[0] == b[0]) return a[1] - b[1];  
    return b[0] - a[0];                    
});
    List<int[]> result = new ArrayList<>();
        for (int[] p : people) {
            result.add(p[1], p); 
        }

        return result.toArray(new int[people.length][2]);
  }
}