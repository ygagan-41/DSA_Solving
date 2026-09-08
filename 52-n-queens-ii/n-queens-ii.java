class Solution {
     static boolean issafetoo(int rowIndex , int colIndex , int n , char[][]board){
        
        //for left directions
        int row = rowIndex;
        int col = colIndex;
        while(col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }

        //for left upper diagonals
        row = rowIndex;
        col = colIndex;
        while(row>=0 && col >=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }

        //for left down diagonals
        row = rowIndex;
        col = colIndex;
        while(row<n && col >=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    static void solve(int n , char[][]board ,int colIndex ,List<List<String>> output){
        //base case
        //yaani valid arrangement mil chuka hai toh 
        if(colIndex >= n){
            List<String> temp = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                temp.add(new String(board[i]));
            }
            output.add(temp);
            return;
        }

        //1 case hum baaki recursion
        for(int rowIndex= 0 ; rowIndex<n ; rowIndex++){
            if(issafetoo(rowIndex,colIndex,n,board)){

                board[rowIndex][colIndex] = 'Q';

                solve(n,board,colIndex+1,output);

                //backtrack
                board[rowIndex][colIndex] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        char [][] board = new char [n][n];
        for(int i=0 ; i<n ; i++){
            Arrays.fill(board[i],'.');
        }
        int colIndex = 0;
        List<List<String>> output = new ArrayList<>();
        solve(n,board,colIndex,output);
        int ans = output.size();
        return ans;
    }
}