// Last updated: 7/31/2025, 12:28:12 PM
class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack= new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<pattern.length()+1; i++){
            stack.push(i+1);

            if(i == pattern.length() || pattern.charAt(i)=='I'){
                while(!stack.isEmpty())
                    sb.append(stack.pop());
                
                
            }
        }
    return sb.toString();

    }
}