class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int starting_col = 0; 
        int ending_col =  n - 1;
        int starting_row = 0;
        int ending_row = n - 1;
        int nums = 1;

        while(starting_row <= ending_row && starting_col <= ending_col){

            for(int col = starting_col ; col<=ending_col ; col++){
                matrix[starting_row][col] = nums++;
            }
            starting_row++;

            for(int row=starting_row; row<=ending_row; row++){
                matrix[row][ending_col] = nums++;
            }
            ending_col--;

            if(starting_row <= ending_row){
                for(int col = ending_col ; col>=starting_col ; col--){
                    matrix[ending_row][col] = nums++;
                }
                ending_row--;
            }

            if(starting_col <= ending_col){
                for(int row = ending_row ; row>= starting_row ; row--){
                    matrix[row][starting_col] = nums++;
                }
                starting_col++;
            }
        }
        return matrix;
    }
}