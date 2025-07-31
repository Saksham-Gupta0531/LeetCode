// Last updated: 7/31/2025, 12:29:48 PM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();  // Easier to work with characters directly
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            char a = arr[first];
            char b = arr[last];

            if (!isVowel(a)) {
                first++;
                continue;
            }
            if (!isVowel(b)) {
                last--;
                continue;
            }

            
            char temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

        return new String(arr);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
