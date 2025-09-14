// Last updated: 9/14/2025, 11:43:26 PM
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int dob=0;
        int cx1=Math.max(ax1,bx1);
        int cx2=Math.min(ax2,bx2);
        int cy1=Math.max(ay1,by1);
        int cy2=Math.min(ay2,by2);
        int area=area(ax1,ax2,ay1,ay2)+area(bx1,bx2,by1,by2);
        int overlap=0;
        if(cx1<cx2 && cy1<cy2){
            dob=area(cx1,cx2,cy1,cy2);
        }
        return area-dob;
    }
    public int area(int x1, int x2, int y1, int y2){
        return (Math.abs(x1-x2)*Math.abs(y1-y2));
    }
}