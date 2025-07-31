// Last updated: 7/31/2025, 12:28:02 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
         List<Integer> lst = new ArrayList<>();
        for(int i=0 ; i<words.length ;i++){
            if (in(x,words[i])){
                lst.add(i);
            }
        }
        return lst;
    }
    public boolean in(char x, String s){
        for(int i=0 ;i<s.length();i++){
            if(x==s.charAt(i))
                return true;
        }
        return false;
    }
}