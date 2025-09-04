// Last updated: 9/4/2025, 6:14:35 AM
class Solution {
    public String reverseWords(String s) {
        String[] arr= s.trim().split("\\s+");
        int first=0;
        int last=arr.length-1;
        
        while (first< last){
            String tem=arr[first];
            arr[first]= arr[last];
            arr[last]=tem;
            first++;
            last--;
        }
        return String.join(" ",arr);
    }
    
}