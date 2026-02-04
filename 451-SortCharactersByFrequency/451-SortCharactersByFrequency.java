// Last updated: 2/4/2026, 12:31:56 PM
class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i =0 ; i < s.length() ;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

    
        List<List<Object>> table = new ArrayList<>();
        for (var entry : map.entrySet()) {
            table.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        for (int i = 1; i < table.size(); i++) {
            int keyFreq = (int) table.get(i).get(1);
            List<Object> keyPair = table.get(i);
            int j = i - 1;
            while (j >= 0 && (int) table.get(j).get(1) < keyFreq) {
                table.set(j + 1, table.get(j));
                j--;
            }
            table.set(j + 1, keyPair);
        }

        StringBuilder sb = new StringBuilder();
        for (List<Object> pair : table) {
            char c = (char) pair.get(0);
            int count = (int) pair.get(1);
            while (count-- > 0) {
                sb.append(c);
            }
        }
        return sb.toString();
        
        }
}