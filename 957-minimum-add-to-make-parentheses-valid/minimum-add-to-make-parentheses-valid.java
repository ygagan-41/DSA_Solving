class Solution {
    public int minAddToMakeValid(String s) {

        int add = 0;
        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    add++;
                }
                else{
                    st.pop();
                }
            }
        }
        int finalans = add + st.size();
        return finalans;
    }
}