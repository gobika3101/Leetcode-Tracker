// Last updated: 7/9/2026, 3:08:04 PM
class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        int m = grid.length;              //row
        int n =grid[0].length;           //column
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    ans++;
                    bfs(i,j,visited,grid,m,n);
                }
            }
        }
        return ans;
    }
    void bfs(int i, int j,boolean[][] visited,char[][] grid,int m, int n){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visited[i][j]=true;
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0){
            int curr[] = q.poll();
            int x=curr[0];                              //row
            int y=curr[1];                              //col
            for(int k=0;k<4;k++){                            //4=4 directions we have to move
                int nextRow = x+directions[k][0];
                int nextCol = y+directions[k][1];
                if(nextRow<m && nextRow>=0 && nextCol<n && nextCol>=0 &&                           visited[nextRow][nextCol]==false && grid[nextRow][nextCol]=='1'){
                    q.add(new int[]{nextRow,nextCol});
                    visited[nextRow][nextCol]=true;
                }
            }
        }
    }
}