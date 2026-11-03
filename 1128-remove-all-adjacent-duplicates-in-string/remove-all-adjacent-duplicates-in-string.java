class Solution {
    public String removeDuplicates(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek() == ch){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();

        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();
    }
}