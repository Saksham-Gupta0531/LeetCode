// Last updated: 2/4/2026, 12:23:55 PM
1class Trie {
2	class Node {
3		char ch ;
4		boolean isterminal ;
5		HashMap<Character , Node > child ;
6		public Node(char ch ){
7			this.ch = ch ;
8			child = new HashMap<>();
9		}
10	}
11	private Node root ;
12	public Trie(){
13	    root = new Node('*');
14	}
15	public void insert(String word){
16		Node curr  = root;
17		for(int i = 0 ; i< word.length() ;i++){
18			char ch = word.charAt(i);
19			if( curr.child.containsKey(ch)){
20				curr = curr.child.get(ch);
21			}
22			else {
23				Node nn = new Node(ch);
24				curr.child.put(ch,nn);
25				curr = nn;
26					
27			}
28		}
29		curr.isterminal = true ;
30
31	}
32	public boolean search(String word){
33		Node curr  = root;
34		for(int i = 0 ; i< word.length() ;i++){
35			char ch = word.charAt(i);
36			if( curr.child.containsKey(ch)){
37				curr = curr.child.get(ch);
38			}
39			else {
40				return false ;
41					
42			}
43		}
44		return curr.isterminal ;	
45	}
46	public boolean startsWith(String word) {
47		Node curr  = root;
48		for(int i = 0 ; i< word.length() ;i++){
49			char ch = word.charAt(i);
50			if( curr.child.containsKey(ch)){
51				curr = curr.child.get(ch);
52			}
53			else {
54				return false ;
55					
56			}
57		}
58		return true ;	
59        	
60    }
61}
62
63/**
64 * Your Trie object will be instantiated and called as such:
65 * Trie obj = new Trie();
66 * obj.insert(word);
67 * boolean param_2 = obj.search(word);
68 * boolean param_3 = obj.startsWith(prefix);
69 */