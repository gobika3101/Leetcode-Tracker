// Last updated: 7/9/2026, 3:05:59 PM
class Solution {
    public int tribonacci(int n) {
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        int a =0, b=1, c=1;
        int res =0;
        for ( int i=1;i<=n-2;i++){
            res = a + b + c;
            a=b;
            b=c;
            c=res;
        }
        return res;
    }
}