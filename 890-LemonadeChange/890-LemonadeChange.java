// Last updated: 2/4/2026, 12:30:39 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives =0;
        int tens =0;

        for (int i =0 ;i <bills.length; i++){
            if (i==0 && bills[i]>5 ) return false;
            if (i==1 && bills[i]>10 ) return false;
            if (bills[i]==5){
                fives++;
            }
            else if (bills[i]==10){
                if (fives >=1){
                    fives--;
                    tens++;
                } 
                else{
                    return false;
                }
            }
            else if (bills[i]==20){
                if (tens >=1 && fives >=1) {
                    tens--;
                    fives--;
                }
                else if(fives >= 3){
                    fives=fives-3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}