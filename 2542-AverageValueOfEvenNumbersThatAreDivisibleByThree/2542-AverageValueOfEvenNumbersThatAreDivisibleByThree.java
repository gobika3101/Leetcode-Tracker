// Last updated: 7/9/2026, 3:05:06 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count =0;
        for (int x:nums){
            if(x%6==0){
                sum = sum + x;
                count++;
            }
        }
        if(sum==0) return 0;
        return sum/count;
    }
}