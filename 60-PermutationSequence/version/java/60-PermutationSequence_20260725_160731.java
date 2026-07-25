// Last updated: 7/25/2026, 4:07:31 PM
1class Solution {
2    public String getPermutation(int n, int k) {
3        if(n == 1) return "1";
4
5        StringBuilder numbers = new StringBuilder();
6
7        for (int i = 1; i <= n; i++) {
8            numbers.append(i);
9        }
10
11        int fact = 1;
12
13        for(int i = 2; i < n; i++){
14            fact *= i;
15        }
16
17        n--;
18
19        StringBuilder result = new StringBuilder();
20
21        while(k > 0){
22            if(k % fact == 0){
23                result.append(numbers.charAt((k/fact)-1));
24                numbers.deleteCharAt((k/fact)-1);
25            }
26            else{
27                result.append(numbers.charAt(k/fact));
28                numbers.deleteCharAt(k/fact);
29            }
30
31            k = k % fact;
32            fact = fact / n;
33            n--; 
34        }
35
36        for(int i = numbers.length()-1; i >= 0; i--){
37            result.append(numbers.charAt(i));
38        }
39
40        return result.toString();
41    }
42}