// Last updated: 9/28/2025, 11:31:20 PM
class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>((a,b)-> a-b);
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b)-> a-b);
        int temp1 = num;
        while(temp1!=0){
            int a = temp1 % 10;
            if(a%2==0){
                even.add(a);
            }
            else{
                odd.add(a);
            }
            temp1=temp1/10;
        }
        temp1= num ;
        int ans =0;
        int i=1;
        while(temp1!=0){
            int a = temp1 % 10;
            if(a%2==0){
                ans=even.poll()*i+ans;
            }
            else{
                ans=odd.poll()*i+ans;
            }
            //System.out.println(ans);
            temp1=temp1/10;
            i=i*10;
        }
        return ans;    
    }
}