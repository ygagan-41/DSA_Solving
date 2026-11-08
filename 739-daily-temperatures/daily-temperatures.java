class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int ans [] = new int [size];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i=0 ; i<size ; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){

                int prevday = st.pop();
                ans[prevday] = i - prevday;
            }
            st.push(i);
        }
        return ans;
    }
}