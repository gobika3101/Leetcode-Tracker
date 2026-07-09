// Last updated: 7/9/2026, 3:06:34 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> s = new Stack();
        int[] ans = new int[n];
        for(int cDay=0;cDay<n;cDay++){
            while(!s.empty() && temp[cDay] > temp[s.peek()]){
                ans[s.peek()] = cDay - s.peek();
                s.pop();
            }
            s.push(cDay);
        }
        return ans;
    }
}