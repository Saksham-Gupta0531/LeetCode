// Last updated: 2/4/2026, 12:32:11 PM
import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st =new Stack<>();
        int i = 1;
        st.push(num.charAt(0));
        while(i < num.length()){
            if (!st.isEmpty() && num.charAt(i) < st.peek() && k>0) {
                k--;
                st.pop();
            }
            
            else {
            st.push(num.charAt(i));
            i++;
            }

        }
    while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb= new StringBuilder();
        for (Character s :st ) {
            if (sb.isEmpty() && s=='0') continue;
            sb.append(s);
        }
        if(sb.isEmpty())
            sb.append('0');
        return sb.toString();
    }
}
