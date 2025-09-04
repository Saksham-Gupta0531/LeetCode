// Last updated: 9/4/2025, 6:14:45 AM
class Solution {
    public boolean isPalindrome(String s) {
        int first =0;
        int last= s.length()-1;
        boolean flag= true;
        while (first< last){
            char a= s.charAt(first);
            char b= s.charAt(last);
           if (!Character.isLetterOrDigit(a)) {
                first++;
                continue;
            }
            if (!Character.isLetterOrDigit(b)) {
                last--;
                continue;
            }

            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }

            first++;
            last--;

        }
        return true;
    }
}
