// Last updated: 10/1/2025, 11:20:00 AM
class Solution {
    public int candy(int[] ratings) {
        int n= ratings.length ;
        int[] Prefix = new int[n];
        Prefix[0]=1;
        int[] Suffix = new int[n];
        Suffix[n-1]=1;
        for(int i=1 ;i< n ;i++){
            if (ratings[i]> ratings[i-1]){
                Prefix[i] =Prefix[i-1]+1;
            }
            else if(ratings[i]== ratings[i-1])
                Prefix[i] =1;
            else 
                Prefix[i] =1;
        }
        for(int i=n-2 ;i>= 0 ;i--){
            if (ratings[i+1]< ratings[i]){
                Suffix[i] =Suffix[i+1]+1;
            }
            else if(ratings[i]== ratings[i+1])
                Suffix[i] =1;
            else 
                Suffix[i] =1;
        }
        int sum=0;
        for(int i=0 ;i< n ;i++){
            System.out.print(Prefix[i]+" "+Suffix[i]+"  ");
            sum+=Math.max(Prefix[i],Suffix[i]);
        }
        return sum;
    }
}