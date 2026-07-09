// Last updated: 7/9/2026, 3:04:43 PM
class Solution {
    public int sumOfMultiples(int n) {
        int count =0;
        for (int i=0;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0)
            count += i;
        }
        return count;
    }
}