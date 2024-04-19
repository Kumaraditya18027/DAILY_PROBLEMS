class Solution {
    public int numIslands(char[][] grid) {
        //In this question we will use dfs to search for the adjacent '1' in the grid.
        int  count=0;
        int n=grid.length;
        if(n==0)
        return 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
        
    }
    void dfs(char[][] grid,int i,int j)
    {
        if(i<0 || i>=grid.length ||j<0 || j>=grid[0].length|| grid[i][j]=='0')
        return;
        grid[i][j]='0';//marking the land piece as visited.
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}