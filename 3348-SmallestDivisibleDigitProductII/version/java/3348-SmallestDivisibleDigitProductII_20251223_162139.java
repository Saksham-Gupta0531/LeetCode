// Last updated: 12/23/2025, 4:21:39 PM
1class Solution {
2    private long gcd(long a, long b) {
3        if(a == 0) return b;
4        return gcd(b%a, a);
5    }
6    public String smallestNumber(String num, long t) {
7        char[] c = num.toCharArray();
8        int n = c.length;
9        long[] remind = new long[n+1];
10        remind[0] = t;
11        int end = n;
12        for (int i=0; i<n; i++) {
13            if (c[i] == '0') {
14                end = i + 1;
15                break;
16            }
17            remind[i + 1] = remind[i] / gcd(remind[i], c[i] - '0');
18        }
19        if(end == n && remind[n] == 1) return num;
20        for(int i=end-1; i>=0; i--) {
21            while(c[i] < '9') {
22                long tt = remind[i];
23                c[i]++;
24                tt /= gcd(tt, c[i] - '0');
25                for (int j=n-1; j>i; j--) {
26                    for (int k=9; k>0; k--) {
27                        if (tt % k == 0) {
28                            tt /= k;
29                            c[j] = (char) ('0' + k);
30                            break;
31                        }
32                    }
33                }
34                if (tt == 1) return new String(c);
35            }
36        }
37        StringBuilder sb = new StringBuilder();
38        for(int i=9; t>1 && i>1; i--) {
39            while(t % i == 0) {
40                sb.append(i);
41                t /= i;
42            }
43        }
44        if(t != 1) return "-1";
45        String res = sb.reverse().toString();
46        if(check(res, num)) return res;
47        if(res.length() == num.length()) return "1" + res;
48        int dif = num.length() - res.length();
49        if(check( "1".repeat(dif) + res, num)) return "1".repeat(dif) + res;
50        return "1".repeat(dif+1) + res;
51    }
52    
53    boolean check(String a, String b) {
54        if(a.length() > b.length()) return true;
55        if(a.length() < b.length()) return false;
56        return a.compareTo(b) > 0;
57    }
58}