// Last updated: 7/31/2025, 12:29:46 PM
import java.util.*;

class Solution {
    public int[] intersect(int[] num1, int[] num2) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int num : num2) {
            list2.add(num);
        }

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < num1.length; i++) {
            if (list2.contains(num1[i])) {
                resultList.add(num1[i]);
                list2.remove(Integer.valueOf(num1[i]));
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
