class Solution {
    public boolean isPalindrome(String s) {

        //create original string for storing letters and digit without
        //special characters
        String original = "";

        //used loop for checking character at string s 
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            //if it is letter or digit stored in original 
            if(Character.isLetterOrDigit(ch)){
                original = original + Character.toLowerCase(ch);
            }
        }
        //create reverse string for compare
        StringBuilder reverse = new StringBuilder();
        for(int j=original.length()-1 ; j>=0 ; j--){
            reverse.append(original.charAt(j));
        }
        if(original.equals(reverse.toString())){
            return true;
        }
        return false;
    }
}