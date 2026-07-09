// Last updated: 7/9/2026, 3:04:13 PM
class Solution {
    public int maxDistance(String moves) {
        int u=0,d=0,l=0,r=0,wild=0;
        for(char c:moves.toCharArray()){
            if(c=='U')u++;
            else if(c=='D')d++;
            else if(c=='L')l++;
            else if(c=='R')r++;
            else wild++;
        }
        int vertical= Math.abs(u-d);
        int horizontal=Math.abs(l-r);
        return vertical+horizontal+wild;
    }
}