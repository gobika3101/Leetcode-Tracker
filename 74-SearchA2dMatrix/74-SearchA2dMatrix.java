// Last updated: 7/9/2026, 3:09:34 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n= matrix[0].length;
        int i=0,j=n-1;
        while(i<m && j>=0){
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target) {
                j--;
            }else i++;
        }
        return false; 
    }
}