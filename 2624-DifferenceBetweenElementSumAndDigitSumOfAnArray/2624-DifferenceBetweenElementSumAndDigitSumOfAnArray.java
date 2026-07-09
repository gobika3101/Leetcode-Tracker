// Last updated: 7/9/2026, 3:04:53 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int  elementSum =0;
        for(int x :nums){
            elementSum += x;
        }
        int digitSum = 0;
        for (int y :nums){
            while(y>0){
                int last = y%10;
                digitSum = digitSum + last;
                y = y/10;
            }
        }
        return elementSum - digitSum;
    }
}