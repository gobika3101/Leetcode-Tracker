// Last updated: 7/9/2026, 3:05:08 PM
class Solution {
    List<List<Integer>> adj;
    int degree[];
    public int componentValue(int[] nums, int[][] edges) {
        adj = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        degree = new int[n];
        for(int e[] : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
            degree[e[0]]++;
            degree[e[1]]++;
        }
        int sum = 0;
        for(int i : nums)sum += i;
        for(int i = n; i >= 1; i--){
            if(sum % i != 0)continue;
            if(bfs(sum/i, nums))return i-1;
        }
        return 0;
    }
    
    boolean bfs(int target,int[] nums){
        
        Queue<Integer> q = new LinkedList<>();
        int vals[] = Arrays.copyOf(nums,nums.length);
        int deg[] = Arrays.copyOf(degree,degree.length);
        for(int i = 0; i < nums.length; i++)if(deg[i] == 1)q.offer(i);
        while(q.size() > 0){
            int curr = q.poll();
            deg[curr] = 0;
            for(int next : adj.get(curr)){
                if(vals[curr] != target)vals[next] += vals[curr];
                deg[next] -= 1;
                if(deg[next] == 0)return vals[next] == target;
                else if(deg[next] == 1)q.offer(next);
            }
        }
        return true;
    }
}