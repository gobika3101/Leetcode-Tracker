// Last updated: 7/9/2026, 3:04:31 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,temp=x;
        int last;
        while(x!=0){
            last = x%10;
            sum = sum+last;
            x =x /10;
        }
        if(temp%sum==0) return sum;
        else return -1;
    }
}