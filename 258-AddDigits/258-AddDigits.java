// Last updated: 7/31/2025, 12:30:07 PM
class Solution {
    public int addDigits(int num) {
        int i=num;
       
        while(num/10!=0){
            int sum=0;
            while (num!=0)
            {
                sum=sum+num%10;
                num=num/10;
            }
        num=sum;
       }
       return num;
    }
}