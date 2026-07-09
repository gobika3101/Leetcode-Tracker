// Last updated: 7/9/2026, 3:07:06 PM
class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
        for (int i=1;i<=n/2;i++){
            if(n%i==0)
            sum = sum+i;
        }
        return (n==sum) ?true:false;
    }
}