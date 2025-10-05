// Last updated: 10/6/2025, 1:11:06 AM
class Solution {
    public int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();  
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; 
            }
        }
        return Integer.parseInt(new String(digits));
    }
}