class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int starting_col = 0; 
        int ending_col =  cols - 1;
        int starting_row = 0;
        int ending_row = rows - 1;

        while(starting_row <= ending_row && starting_col <= ending_col){

            for(int col = starting_col ; col<=ending_col ; col++){
                result.add(matrix[starting_row][col]);
            }
            starting_row++;

            for(int row=starting_row; row<=ending_row; row++){
                result.add(matrix[row][ending_col]);
            }
            ending_col--;

            if(starting_row <= ending_row){
                for(int col = ending_col ; col>=starting_col ; col--){
                    result.add(matrix[ending_row][col]);
                }
                ending_row--;
            }

            if(starting_col <= ending_col){
                for(int row = ending_row ; row>= starting_row ; row--){
                    result.add(matrix[row][starting_col]);
                }
                starting_col++;
            }
        }
        return result;
    }
}