// Last updated: 7/9/2026, 3:04:55 PM
class Solution {
    public int countDigits(int num) {
        int count =0;
        int last,temp=num;
        while(temp!=0){
            last = temp%10;
            if(num%last==0) count++;
            temp = temp/10;
        }
        return count;
    }
}