// Last updated: 10/22/2025, 11:13:14 PM
import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        List<Integer> arr = new ArrayList<>() ;
        //st.push(asteroids[0]);
        int i = 0;
        while(i < asteroids.length){
            if (asteroids[i] < 0){
                if (st.isEmpty()){ arr.add(asteroids[i]);i++;}
                else if (Math.abs(asteroids[i])== st.peek()){st.pop(); i++;}
                else if (Math.abs(asteroids[i])> st.peek()) st.pop();
                else i++;

            }
            else {
                st.push(asteroids[i]);
                i++;
            }
        }
        int[] ans = new int[st.size() +arr.size()];
        
        for (int j=0 ; j< arr.size() ;j++){
            ans[j] = arr.get(j);
        }
        int p=1;
        while( !st.isEmpty()){
            ans[ans.length -p]= st.pop();
            p++;
        }
        return ans;
    }
}