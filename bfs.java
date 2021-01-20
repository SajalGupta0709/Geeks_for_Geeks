class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        ArrayList<Integer> bfs=new ArrayList<Integer>();
        boolean  visit[]= new boolean[V];
        visit[0]=true;
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(0);
        while(q.size()!=0){
            int s=q.poll();
            bfs.add(s);
            for(int i=0;i<adj.get(s).size();i++){
                int n=adj.get(s).get(i);
                if(!visit[n]){
                    visit[n]=true;
                    q.add(n);
                }
            }
        }
        return bfs;
    }
}
