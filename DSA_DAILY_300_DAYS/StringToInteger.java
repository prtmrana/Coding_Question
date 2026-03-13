package DSA_DAILY_300_DAYS;

/*
The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").

Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.

Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.

Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

Return the integer as the final result.
 **************************
 Input: s = " -042"
 Output: -42
 **************************
 Input: s = "1337c0d3"
 Output: 1337
****************************
Input: s = "0-1"
Output: 0

*/
public class StringToInteger {
    public static void main(String[] args) {
        System.out.print("1337c0d3--"+myAtoi("1337c0d3"));  //not resolved
    }

     public static int myAtoi(String s) {
        String returnString="";
        if(Character.isLetter(s.charAt(0))) return 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=' ' ){
                if(!Character.isLetter(s.charAt(i))){

                }
               returnString+=s.charAt(i);
            }
        }

        return Integer.valueOf(returnString);
    }
}
