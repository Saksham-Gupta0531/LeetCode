// Last updated: 2/5/2026, 8:39:07 PM
1class Solution {
2    public List<String> invalidTransactions(String[] transactions) {
3        List<String> sol = new ArrayList();
4
5        Map<String,List<Integer>> byName = new HashMap();
6
7        for (int i=0;i<transactions.length;i++){
8            String[] details = transactions[i].split(",");
9            byName.putIfAbsent(details[0],new ArrayList());
10            byName.get(details[0]).add(i);
11        }
12        
13        for (int i=0;i<transactions.length;i++){
14            String[] details = transactions[i].split(",");
15            if (Integer.parseInt(details[2])>1000) sol.add(transactions[i]);
16            else{
17                for (int otherIndex:byName.get(details[0])){
18                    if (otherIndex==i) continue;
19                    String[] otherDetails = transactions[otherIndex].split(",");   
20                    if (!details[3].equals(otherDetails[3]) && 60>=Math.abs(Integer.parseInt(details[1])-Integer.parseInt(otherDetails[1]))){
21                        sol.add(transactions[i]);
22                        break;
23                    } 
24                }
25            }
26        }
27
28        return sol;
29    }
30}