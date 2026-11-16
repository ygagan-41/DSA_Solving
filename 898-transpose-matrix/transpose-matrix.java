class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int new_row = col;
        int new_col = row;
        int [][] ans = new int[new_row][new_col];

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}