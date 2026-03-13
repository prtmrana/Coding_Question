package DSA_DAILY_300_DAYS;
 
/*
Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.​​​​
'*' Matches zero or more of the preceding element.
Return a boolean indicating whether the matching covers the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
 

Constraints:

1 <= s.length <= 20
1 <= p.length <= 20
s contains only lowercase English letters.
p contains only lowercase English letters, '.', and '*'.
It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.

*/
public class RegularExpressionMatching {
    public static void main(String[] args) {
        //String s = "aa", p = "a";
        String s = "aa", p = "a*";
        System.out.println(isMatchedExpression(s, p));
    }

    public static boolean isMatchedExpression(String s1,String s2){
       if(s2.length()>=2){
        if(s2.charAt(0)=='.' && s2.charAt(1)=='*') return true;
        else {
            if(s1.length()<s2.length()) return false;
            else {
                int leng=s2.length();
                for(int i=0;i<leng;i++){
                   if(s2.charAt(leng-i-1)!=s1.charAt(leng-i-1) && s2.charAt(leng-i-1) !='*') return false;
                   else{
                    if(s2.charAt(i) !=s1.charAt(i)) return false;
                   }
                }
            }
        }
       }

        return true;
    }
}
