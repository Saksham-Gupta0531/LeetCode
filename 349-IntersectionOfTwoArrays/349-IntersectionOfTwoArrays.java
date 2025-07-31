// Last updated: 7/31/2025, 12:29:47 PM
class Solution {
    public int[] intersection(int[] num1, int[] num2) {
       ArrayList<Integer> lst = new ArrayList<>();
        for (int i =0 ; i<num1.length ; i++){
            for(int j=0; j<num2.length ; j++){
                if (num1[i] == num2[j]) {
                    if (lst.contains(num1[i]))
                        continue;
                    else
                        lst.add(num1[i]);
                }
            }
        }
        int[] array = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            array[i]=lst.get(i);
        }
        return array;
    }
}
