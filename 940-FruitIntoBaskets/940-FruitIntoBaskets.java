// Last updated: 7/31/2025, 12:28:47 PM
class Solution {
    public int totalFruit(int[] fruits) {
         Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int first_ele_count=0,last_ele_count=0;
        int first_ele=fruits[0];
        int last_ele=-1;
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i],i);
            if(map.size()>2){
              max=Math.max(max,first_ele_count+last_ele_count);
              if(fruits[i-1]==first_ele){
                  int val1=map.get(last_ele);
                  map.remove(last_ele);
                  last_ele=-1;
                  last_ele_count=0;
                  first_ele_count=i-val1-1;
              }
              else{ 
                  int val2=map.get(first_ele);
                  map.remove(first_ele);
                  first_ele=last_ele;
                  first_ele_count=i-val2-1;
                  last_ele_count=0;
                  last_ele=-1;
              }
            }
            if(first_ele==fruits[i])first_ele_count++;
            else{last_ele=fruits[i]; last_ele_count++;}
        }


        return Math.max(max,first_ele_count+last_ele_count);
    }
}