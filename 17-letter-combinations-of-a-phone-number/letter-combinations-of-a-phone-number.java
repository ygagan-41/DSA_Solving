class Solution {
    static void solve(String digits, String[] mapping ,List<String>output , StringBuilder ans,int index){
        //base case
        //agar hamara ans stored ho chuka hai toh return karjaao
        if(index>=digits.length()){
            //agar hamara index khatam ho chuka hai toh string jo 
            //bani hai string builder mai use store karlo output me or return karjaao
            output.add(ans.toString());
            return;
        }

        //1 case hum karege baaki recursion
        //ab hum apni input string ke upar index daalenege taaki vo kaam karna shuru kare
        int value = digits.charAt(index) - '0'; 

        //mapped string variable ke andar mene mapping ke upar index daal diya
        String mappedString = mapping[value];

        //ab meri current value or mapped string ready hai perform karne ke liye iska 
        //matlab mujhe loop chalana padega taaki voh perform kar sake 

        //ab me loop chalauga i=0 se mujhe 2 ke abc pe le jaega or use store karlega 
        //output me 
        for(int i = 0; i<mappedString.length() ; i++){
            ans.append(mappedString.charAt(i));
        

        //function ko call karo taaki index increment ho jaaye
        solve(digits,mapping,output,ans,index+1);

        //last step which is backtracking or undo step
        ans.deleteCharAt(ans.length()-1);
        
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> output = new ArrayList<>();
        int index = 0;
        StringBuilder ans = new StringBuilder();
        solve(digits,mapping,output,ans,index);
        return output;
    }
}