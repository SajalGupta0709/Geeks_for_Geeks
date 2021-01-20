class Solution
{
    public int numIslands(char[][] grid)
    {
        // Code here
        int count=0,r=grid.length,c=grid[0].length;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1')
                    {mark(grid,i,j,r,c);
                    count++;}
            }
        return count; 
    }
    public void mark(char[][]grid,int x,int y,int r,int c){
        if(x<0||x>=r||y<0||y>=c||grid[x][y]!='1')
            return;
        grid[x][y]='2';
        mark(grid,x+1,y,r,c); 
        mark(grid,x,y+1,r,c);
        mark(grid,x-1,y,r,c);
        mark(grid,x,y-1,r,c);
        mark(grid,x+1,y+1,r,c);
        mark(grid,x+1,y-1,r,c);
        mark(grid,x-1,y+1,r,c);
        mark(grid,x-1,y-1,r,c);
    }
}
