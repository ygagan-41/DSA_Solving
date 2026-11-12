class Solution {
    public boolean isIsomorphic(String s, String t) {
       
        Map<Character,Character> map = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char str = map.get(original);
                if(str != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}