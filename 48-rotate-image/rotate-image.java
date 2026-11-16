class Solution {
    public void rotate(int[][] matrix) {
         //step-1: transpose of matrix
    int n = matrix[0].length;

    for(int i=0 ; i<n ; i++){
        for(int j=i+1; j<n ; j++){

            int temp = matrix[i][j];
            matrix[i][j] =  matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    //step-2: reverse the rows of transposed matrix
    for(int row=0 ; row<n ; row++){

        int startcol = 0;
        int endcol = n-1;

        while(startcol <= endcol){

            int temp =  matrix[row][startcol];
            matrix[row][startcol] =  matrix[row][endcol];
            matrix[row][endcol] = temp;

            startcol++;
            endcol--;
        }
    }
    }
}