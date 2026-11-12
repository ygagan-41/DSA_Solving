class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        Map<Character, Character> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
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
                char st = map.get(original);
                if(st != replacement){
                    return false;
                }
            }
        }
        return true; 
    }
}