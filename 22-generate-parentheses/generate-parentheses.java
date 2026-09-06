class Solution {
    static void solve(int n,int open , int close,StringBuilder ans ,List<String> output){

        //agar mera base case hit hogya hai toh return hojaye and answer store karlo
        if(open == n && close == n){
            //open == 3
            output.add(ans.toString());
            return;
        }

        //1 case hum baaki recursion
        //agar tumhara open n se chota hai toh add kardo open bracket and open ko 
        //increment kardo and repeat until open == n
        if(open<n){
            ans.append("(");
            solve(n,open+1,close,ans,output);
            //backtrack
            ans.deleteCharAt(ans.length()-1);
        }

        //same to same ese hi close ke liya
        if(open>close){
            ans.append(")");
            solve(n,open,close+1,ans,output);
            //backtrack
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        StringBuilder ans = new StringBuilder();
        List<String> output = new ArrayList<>();
        solve(n,open,close,ans,output);
        return output;
    }
}