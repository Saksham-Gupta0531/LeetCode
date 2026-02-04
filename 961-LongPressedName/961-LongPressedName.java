// Last updated: 2/4/2026, 12:30:24 PM
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i =0 ;
        int j =0;
        if ( typed.length()< name.length()) return false;
        while(j< typed.length() ){
            
            if (i< name.length() &&typed.charAt(j)==name.charAt(i)){
              
                i++;
                j++;
            }
            else{
                if (j!=0 && typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                    
                }
                else {
                    return false;
                }

            }
        
        }
        if (i!= name.length()) return false;
        return true;
    }
}