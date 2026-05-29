class Solution {
    public int projectionArea(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    sum+=1;
                }
            }
        }
        
        for(int i=0;i<grid.length;i++){
             int f=Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>f){
                    f=grid[i][j];
                }
                
            }
            sum+=f;
        }

        for(int i=0;i<grid.length;i++){
            int f=Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++){
                if(grid[j][i]>f){
                    f=grid[j][i];
                }
            }
            sum+=f;
        }
        return sum;

    }
}