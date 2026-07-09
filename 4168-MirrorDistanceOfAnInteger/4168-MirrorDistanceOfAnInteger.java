// Last updated: 7/9/2026, 3:04:20 PM
class Solution {
    public int mirrorDistance(int n) {
        int org=n;
        int last,rev=0;
        while(n!=0){
            last = n%10;
            rev = rev*10 + last;
            n=n/10;
        }
        return Math.abs(org-rev);
    }
}