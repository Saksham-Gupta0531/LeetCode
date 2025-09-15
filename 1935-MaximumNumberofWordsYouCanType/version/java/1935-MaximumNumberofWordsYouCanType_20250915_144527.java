// Last updated: 9/15/2025, 2:45:27 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c= 0;
        int i=0;
        while (i< text.length()){
            boolean isBroken = false;
            
            while (i < text.length() && text.charAt(i) != ' ') {
                for (int j= 0 ; j<brokenLetters.length();j++){
                    if (brokenLetters.charAt(j)==text.charAt(i)){
                        isBroken = true;
                        
                    }
                }
                i++;
            }
            if (! isBroken)c++;
             while ( i< text.length() && text.charAt(i) == ' ') i++;
                    
            }
        
        return c;
        
    }
}