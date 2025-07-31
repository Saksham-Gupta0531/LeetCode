// Last updated: 7/31/2025, 12:29:20 PM
class Solution {
    public int[] constructRectangle(int area) {
        int b = (int) Math.sqrt(area);
        while(area%b!=0)
           { b-=1;}
        int l=(area/b);
        if(b==1){
            return new int[]{area,1};
            }
        return new int[] {l,b};
    }
}