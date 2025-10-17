// Last updated: 10/17/2025, 9:53:38 PM
class Solution {
    public int maximum69Number (int num) {
        int a=0;
        
        int n=(int) (Math.log10(num)) ;
        n=(int)Math.pow(10,n);
        System.out.print(n);

        while(num!=0){
            int x= num/n;
            if (x==6){
                a=a+9*n + num%n;
                break;
            }
           
            else{
                a=a+x*n;
                }
            //System.out.println(a+" ");
            num = num%n;
            n=n/10;
        }
        return a;
    }
}