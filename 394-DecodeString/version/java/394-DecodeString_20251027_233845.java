// Last updated: 10/27/2025, 11:38:45 PM
class Solution {
    public String decodeString(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stk.push(ch);
            }
            else{
                StringBuilder sub = new StringBuilder();
                while(stk.peek() != '['){
                    sub.insert(0, stk.pop());
                }
                stk.pop();

                StringBuilder num = new StringBuilder();
                while(!stk.isEmpty() && Character.isDigit(stk.peek())){
                    num.insert(0, stk.pop());
                }
                int k = Integer.parseInt(num.toString());

                String rep = sub.toString().repeat(k);
                for(char c : rep.toCharArray()){
                    stk.push(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stk){
            sb.append(c);
        }
        return sb.toString();
    }
}