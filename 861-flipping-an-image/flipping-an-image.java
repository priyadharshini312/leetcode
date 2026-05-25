class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n=image.length;
        int m=image[0].length;
        int arr[][]=new int[n][m];
        for(int i=image.length-1;i>=0;i--){
            int c=0;
            for(int j=image[0].length-1;j>=0;j--){
                arr[i][c]=image[i][j];
                c++;
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                }
                else{
                      arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}