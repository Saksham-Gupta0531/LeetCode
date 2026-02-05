// Last updated: 2/5/2026, 12:29:03 PM
1class Solution {
2    static class Trie {
3        class Node {
4            char ch;
5            String isterminal;
6            HashMap<Character, Node> child;
7
8            public Node(char ch) {
9                this.ch = ch;
10                child = new HashMap<>();
11            }
12
13        }
14
15        private Node root;
16
17        public Trie() {
18            root = new Node('*');
19        }
20
21        public void insert(String word) {
22            Node cur = root;
23            for (int i = 0; i < word.length(); i++) {
24                char c = word.charAt(i);
25                if (cur.child.containsKey(c)) {
26                    cur = cur.child.get(c);
27                } else {
28                    Node nn = new Node(c);
29                    cur.child.put(c, nn);
30                    cur = nn;
31                }
32            }
33            cur.isterminal = word;
34        }
35
36        public String search(String word) {
37            int idx = 0;
38            Node cur = root;
39            while (idx < word.length() && cur.child.containsKey(word.charAt(idx))){
40                cur = cur.child.get(word.charAt(idx++));
41                if(cur.isterminal != null) return cur.isterminal;
42            }
43            return word;
44        }
45
46        public boolean startsWith(String prefix) {
47            int idx = 0;
48            Node cur = root;
49            while (idx < prefix.length() && cur.child.containsKey(prefix.charAt(idx)))
50                cur = cur.child.get(prefix.charAt(idx++));
51            if (idx == prefix.length())
52                return true;
53            return false;
54        }
55
56    }
57
58    public String replaceWords(List<String> dictionary, String sentence) {
59        Trie trie = new Trie();
60        for(String s : dictionary){
61            trie.insert(s);
62        }
63        String[] arr = sentence.split(" ");
64        for(int i = 0; i < arr.length; i++){
65            String c = trie.search(arr[i]);
66            if(c != null) arr[i] = c;
67
68        }
69        StringBuilder sb = new StringBuilder();
70        for(int i  = 0; i < arr.length; i++){
71            if(i == arr.length - 1){ 
72                sb.append(arr[i]);
73                continue;
74            }
75            sb.append(arr[i] + " ");
76        }
77
78        return sb.toString();
79
80
81    }
82   
83}