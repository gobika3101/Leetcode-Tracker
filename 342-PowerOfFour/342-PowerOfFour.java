// Last updated: 7/9/2026, 3:07:33 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return ((n>0 && ((n&(n-1))==0)) & (n&0x55555555)!=0);
    }
}