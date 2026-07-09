class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int k=0;k<indices.length;k++){
            int row=indices[k][0];
            int col=indices[k][1];
        
                   for(int i=0;i<n;i++){
                        arr[row][i]++;
                   }
                   
                
               
                 
                         for(int j=0;j<m;j++){
                           arr[j][col]++;
                         }
                         
                
                    
            }
    
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}