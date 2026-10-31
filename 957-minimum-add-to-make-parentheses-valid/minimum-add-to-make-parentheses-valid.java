class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            }
            else{
                //ch == ')'
                if(open > 0){
                    open--;
                }
                else{
                    add++;
                }
            }
        }
        int finalans = add + open;
        return finalans;
    }
}