// Last updated: 7/9/2026, 3:11:04 PM
class Solution {
    public int reverse(int x) {
            long rev = 0,last;
        while(x!=0){
            last = x%10;
            rev = rev *10 + last;
            x = x/10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        return (int)rev;
    }
}