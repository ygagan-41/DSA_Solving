class Solution {
    static boolean isSafeToo(int rowIndex , int colIndex , int n ,char[][] board){
    
        //now we will check directions
        //for left direction
        int row = rowIndex;
        int col = colIndex;

        while(col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }

        //for left upper diagonal
        row = rowIndex;
        col = colIndex;
        while(row>=0 && col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col = col -1;
            row = row -1;
        }

        //for left lower diagonal
        row = rowIndex;
        col = colIndex;
        while(row < n && col >= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row = row +1;
            col = col -1;
        }
        return true;
    }
    static void solve(int n,char [][] board ,List<List<String>> output,int colIndex){
        //base case
        //agar hame koi valid arrangment milgyi hai toh return kardo 
        //lekin return karne se pehle use store kardo
        if(colIndex>=n){

            //ye loop saari values ko string me laaarha h taaki list me add karsake
            List<String>temp = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                temp.add(new String(board[i]));
            }

            output.add(temp);
            return;
        }

        //1 case hum karege baaki recursion
        for(int rowIndex=0 ; rowIndex<n ; rowIndex++){
            if(isSafeToo(rowIndex,colIndex,n,board)){
                board[rowIndex][colIndex] = 'Q';

                //baaki recursion ko dedo
                solve(n,board,output,colIndex+1);

                //backtracking or undo step
                board[rowIndex][colIndex] = '.';
            }
        }
    }  
    public List<List<String>> solveNQueens(int n) {
        //ek nxn ka board banaya hai jaha hamara queen bharegi 
        char [][] board = new char [n][n];
        List<List<String>> output = new ArrayList<>();
        
        //ab hum pure board ko dot se bhardega
        for(int i=0 ; i<n ; i++){
            Arrays.fill(board[i],'.');
        }
        int colIndex = 0;
        solve(n,board,output,colIndex);
        return output;
    }
}