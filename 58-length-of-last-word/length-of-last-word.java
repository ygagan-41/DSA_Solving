class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length();
        int count = 0;
        for(int i=size-1;i>=0;i--){
            if(count == 0 && s.charAt(i) == ' '){
                continue;
            }   
            else{
                if(s.charAt(i) == ' '){
                    break;
                }
                else{
                    count++;
                }
            }
        }
        return count;
    }
}