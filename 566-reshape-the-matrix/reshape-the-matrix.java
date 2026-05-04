class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
        int index=0;
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               arr[index/c][index%c]=mat[i][j];
               index++;
        }
    }
    return arr;
    }
}