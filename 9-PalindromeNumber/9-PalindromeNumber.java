// Last updated: 7/9/2026, 3:11:00 PM
class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int last,rev = 0;
        while (x!=0){
            last = x%10;
            rev = rev*10 + last;
            x = x/10;
        }
        if (org == rev && org>=0) return true;
        else return false;
    }
}