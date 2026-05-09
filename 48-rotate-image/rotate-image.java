class Solution {
    public void rotate(int[][] matrix) {
        int arr[][]=new int[matrix.length][matrix[0].length];
        int f=0;
        int r=0;
        while(r<matrix.length && f<matrix[0].length){
            int l=matrix[0].length-1;
            for(int i=0;i<matrix.length;i++){
            arr[r][l]=matrix[i][f];
            l--;
            }
            r++;
            f++;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=arr[i][j];
            }
        }

    }
}