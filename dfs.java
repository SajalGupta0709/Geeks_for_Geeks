class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visit[]=new boolean[V];
        for(int i=0;i<V;i++){
            visit[i]=false;
        }
        ArrayList<Integer> dfs=new ArrayList<>();
        for(int i=0;i<V;i++)
            if(!visit[i])
                dfs(dfs,0,visit,adj);
        
        return dfs;
    }
    public void dfs( ArrayList<Integer> dfs,int src,boolean visit[],ArrayList<ArrayList<Integer>> adj){
        visit[src]=true;
        dfs.add(src);
        for(int i=0;i<adj.get(src).size();++i){
            int n=adj.get(src).get(i);
            if(!visit[n])
                dfs(dfs,n,visit,adj);
        }
    }
}
