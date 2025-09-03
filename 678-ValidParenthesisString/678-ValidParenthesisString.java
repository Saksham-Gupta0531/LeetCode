// Last updated: 9/3/2025, 5:28:15 PM
class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max= 0;
        for(int i=0 ;i<s.length() ;i++){
            if (s.charAt(i)=='('){
                min++;
                max++;
            }
            else if (s.charAt(i)==')'){
                if (min > 0) min--;   
                max--;                
                if (max < 0) return false; 
            }
            else if(s.charAt(i)=='*'){
                if (min > 0) min--;   
                max++;                
            }
            if (min < 0) min = 0;    
        }
        return min==0;
    }
}
