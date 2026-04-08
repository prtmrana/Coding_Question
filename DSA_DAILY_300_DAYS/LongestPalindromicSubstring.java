package DSA_DAILY_300_DAYS;

import java.util.HashSet;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str="babad";
        String ans=longestPalindrome(str);
        System.out.println(ans);
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
         int ans = 0;
         int left=0;
        HashSet<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
           while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
           }
           set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }


        return null;
    }
}
