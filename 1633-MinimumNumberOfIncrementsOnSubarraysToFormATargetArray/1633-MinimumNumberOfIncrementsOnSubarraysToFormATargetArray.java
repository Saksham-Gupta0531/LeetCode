// Last updated: 2/4/2026, 12:29:26 PM
class Solution {
    public int minNumberOperations(int[] arr) {
        boolean flag = false;//false increaseing
        int g_min = Integer.MAX_VALUE;
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (p <= arr[i]) {
                if(flag ){
                    set2.add(p);
                }
                p = arr[i];
                flag = false;
            } else if (p > arr[i] ) {
                if( !flag)
                    set.add(p);

                flag = true;
                p = arr[i];
            }
            //System.out.println(i+" "+p+" "+flag+"    "+set2);

        }
        if (!flag)
            set.add(p);
        // System.out.println(set);
        // System.out.println(set2);
        int sum = 0;
        int sum2 =0;
        for (int x : set) 
            sum += x;
        for (int x : set2) 
            sum2 += x;
        
        return sum - sum2;
    }
}