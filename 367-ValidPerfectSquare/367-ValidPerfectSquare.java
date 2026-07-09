// Last updated: 7/9/2026, 3:07:31 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1,j=num;
        int mid;
        while(i<=j){
            mid=(i+j)/2;
            if(mid*mid==num) return true;
            else if((long)mid*mid<num) i=mid+1;
            else j=mid-1; 
        }
        return false;
    }
}