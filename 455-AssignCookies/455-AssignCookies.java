// Last updated: 7/31/2025, 12:29:22 PM
import java.util.*;

class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int k=0;
        for (int i=0;i<s.length;i++){
            if(k>=g.length) return c;
            if (s[i]<g[k]){
                continue;
            }
            else{
                k++;
                c++;
            }
        }
        return c;
    }
}