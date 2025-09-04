// Last updated: 9/4/2025, 6:15:52 AM
class Solution {
    public List<String> generateParenthesis(int n) {
    List<String> list = new ArrayList<>();
        bracket(n,"",0,0,list);
        return list;
    }
    public static void bracket(int n,String ans,int open,int close,List lst){
        if(open==n && close==n){
            lst.add(ans);
        }
        if(open<n && close<n) {
            bracket(n, ans + "(", open + 1, close,lst);
        }
        if(close<open){
            bracket(n, ans + ")", open, close + 1,lst);
        }
    }

}