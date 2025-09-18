// Last updated: 9/18/2025, 10:29:37 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String , Integer>dict  = new HashMap<>();
        int i=0;
        int j=10;
        List<String> arr = new ArrayList<>();
        while(j <=s.length()){
            if (dict.get(s.substring(i,j))!=null)
                {if (dict.get(s.substring(i,j))==1) arr.add(s.substring(i,j));}
            dict.put(s.substring(i,j),dict.getOrDefault(s.substring(i,j),0)+1);
            
            i++;
            j++;
        }
        return arr;
    }
}