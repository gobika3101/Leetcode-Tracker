// Last updated: 7/9/2026, 3:09:42 PM
class Solution {
    public int mySqrt(int x) {
        int i=1,j=x;
        int mid;
        int ans=0;
        while(i<=j){
            mid = i+(j-i)/2;
            if(mid*mid==x) return mid;
            else if((long)mid*mid<x){
                ans =mid;
                i =mid+1;
            }
            else j=mid-1;
        }
        return ans;
    }
}