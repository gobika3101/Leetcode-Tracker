// Last updated: 7/9/2026, 3:06:31 PM
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int i=0,j=n-1;
        int mid;
        while(i<=j){
            mid = (i+j)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) j=mid-1;
            else i=mid+1;
        }
        return -1;
    }
}