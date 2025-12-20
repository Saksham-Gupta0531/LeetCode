// Last updated: 12/20/2025, 5:23:25 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i =0 ;
4        int j =0;
5        if ( typed.length()< name.length()) return false;
6        while(j< typed.length() ){
7            
8            if (i< name.length() &&typed.charAt(j)==name.charAt(i)){
9              
10                i++;
11                j++;
12            }
13            else{
14                if (j!=0 && typed.charAt(j)==typed.charAt(j-1)){
15                    j++;
16                    
17                }
18                else {
19                    return false;
20                }
21
22            }
23        
24        }
25        if (i!= name.length()) return false;
26        return true;
27    }
28}