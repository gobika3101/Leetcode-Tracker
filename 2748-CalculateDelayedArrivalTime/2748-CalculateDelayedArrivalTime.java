// Last updated: 7/9/2026, 3:04:45 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = arrivalTime + delayedTime;
        if (sum<24){
            return sum;
        }else{
            return sum%24;
        }
    }
}