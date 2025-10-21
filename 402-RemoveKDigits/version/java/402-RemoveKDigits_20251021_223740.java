// Last updated: 10/21/2025, 10:37:40 PM
import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > digit) {
                stack.pollLast();
                k--;
            }
            stack.addLast(digit);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pollLast();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char ch = stack.pollFirst();
            if (sb.length() == 0 && ch == '0') continue;
            sb.append(ch);
        }

        if(sb.isEmpty()) 
            sb.append('0'); 
        return sb.toString();
    }
}
