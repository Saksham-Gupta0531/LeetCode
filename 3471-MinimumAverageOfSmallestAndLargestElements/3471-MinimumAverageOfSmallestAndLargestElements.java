// Last updated: 7/31/2025, 12:27:55 PM
import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {
        if (nums.length < 2) return 0.0;

        List<Double> averages = new ArrayList<>();

        Arrays.sort(nums);

        while (nums.length > 1) {
            int m1 = nums[0];
            int m2 = nums[nums.length - 1];

            averages.add((m1 + m2) / 2.0);
            
            nums = remove(nums, m1, m2);
        }

        return Collections.min(averages);
    }

    public static int[] remove(int[] arr, int var1, int var2) {
        List<Integer> newList = new ArrayList<>();
        boolean removedFirst = false;
        boolean removedSecond = false;

        for (int x : arr) {
            if (!removedFirst && x == var1) {
                removedFirst = true;
                continue;
            }
            if (!removedSecond && x == var2) {
                removedSecond = true;
                continue;
            }
            newList.add(x);
        }

        int[] newArr = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            newArr[i] = newList.get(i);
        }
        return newArr;
    }
}
