class Solution {
    static void solve(String digits,List<String> output,int index,String[] mapping ,StringBuilder ans){

        //base case
        //agar hamara index string se bahar nikal chuka hai toh string ko store karlo 
        //ans me and output me daaldo or return hojaao
        if(index >= digits.length()){

            //agar mera index out of string chala gya hai yaa base case hit karchuka h
            //hai toh mere answer ko store kardo ans string builder me or return hojaao
            output.add(ans.toString());
            return;
        }

        //1 case hum baaki recursion

        //ab digits jo ki input string hai usme jaha index hai vo character value 
        //variable me stored kaaralo saath hi use int me convert bhi kardo
        int value = digits.charAt(index)-'0';

        //jo hume value mili hai , us value ko mai mapping me put karuga taaki hum us 
        //string pe kaam kar sake
        String mappedString = mapping[value];

        //yeh loop har kisi value pe jaayega mapping ke lekin hamaara input 2 hai toh
        //ye 2 mapping pe jayega
        for(int i=0 ; i<mappedString.length() ; i++){

            //i pe jo value hai mapping index ke use store karlo string builder me
            //index = 0;
            //value = 2
            //mappedString = 2;
            //loop - i = 0 to i = 3
            // 0 - a
            // 1 - b
            // 2 - c
            //it will pick a then a + d like that
            ans.append(mappedString.charAt(i));

            //index ko plus 1 kardega taaki hamara index aage waali input string pe badhe
            solve(digits,output,index+1,mapping,ans);

            //last step backtracking
            //jab hamara ek string store hoajega succesfully to hum dubara usse nhi laana chate
            //toh backtrack karwaege or ussse bolege vaapas jaao
            //matlab char "ad" toh vo d delete kardega store karne ke baad 
            //tabhi toh "ae" aaega backtrcak karne ke baad
            ans.deleteCharAt(ans.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        int index = 0;
        String[] mapping = {" "," ", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder ans = new StringBuilder();
        solve(digits,output,index,mapping,ans);
        return output; 
    }
}