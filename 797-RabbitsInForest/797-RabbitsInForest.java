// Last updated: 2/4/2026, 12:30:48 PM
class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            map.put(answers[i], map.getOrDefault(answers[i], 0) + 1);
            if (map.get(answers[i]) == answers[i] + 1) {
                count += answers[i] + 1;
                map.put(answers[i], 0);
            }

        }
        for (int key : map.keySet()) {
            int curr = map.get(key);
            if (curr > 0)
                count += key + 1;
        }
        return count;
    }
}