// Last updated: 10/23/2025, 9:41:25 PM

class Solution {
    public int calculate(String s) {
        Stack<Character> operators = new Stack<>();
        Stack<Integer> numbers = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(num);
            } 
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    applyOperation(numbers, operators.pop());
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            applyOperation(numbers, operators.pop());
        }

        return numbers.pop();
    }

    private int precedence(char op) {
        if (op == '*' || op == '/') return 2;
        return 1;
    }

    private void applyOperation(Stack<Integer> numbers, char op) {
        int b = numbers.pop();
        int a = numbers.pop();
        int res = 0;

        if (op == '+') res = a + b;
        else if (op == '-') res = a - b;
        else if (op == '*') res = a * b;
        else if (op == '/') res = a / b;

        numbers.push(res);
    }
}