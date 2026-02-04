// Last updated: 2/4/2026, 12:30:46 PM
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        addAns(s, 0, sb, lst);
        return lst;
    }

    public void addAns(String s, int i, StringBuilder sb, List<String> lst) {
        if (s.length() == sb.length()) {
            lst.add(sb.toString());
            return;
        }

        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            sb.append(s.charAt(i));
            // System.out.print(sb + "   ");
            addAns(s, i + 1, sb, lst);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append(Character.toLowerCase(s.charAt(i)));
            addAns(s, i + 1, sb, lst);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(s.charAt(i)));
            addAns(s, i + 1, sb, lst);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}