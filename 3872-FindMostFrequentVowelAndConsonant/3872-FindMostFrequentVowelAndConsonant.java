// Last updated: 7/9/2026, 3:04:21 PM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int v =0,C=0;
        for(char c:s.toCharArray()){
            int i = c - 'a';
            freq[i]++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                v = Math.max(v,freq[i]);
            }else{
                C = Math.max(C,freq[i]);
            }
        }
        return (v+C);
    }
}