// Last updated: 9/4/2025, 6:15:58 AM
class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> lst = new ArrayList<>();
        if(digits.length() == 0){
            return lst;
        }
        if(digits ==""){
            return lst;
        }
		print(digits, "", lst);
		return lst;
    }

    public static void print(String ques, String ans, List<String> lst) {
		if(ques.length() == 0) {
			lst.add(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		String getString = key[ch - '0'];
		for(int i = 0; i < getString.length(); i++) {
			print(ques.substring(1), ans + getString.charAt(i), lst);
		}
	}
}
