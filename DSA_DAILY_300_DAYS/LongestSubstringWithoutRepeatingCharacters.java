package DSA_DAILY_300_DAYS;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        // brute force approach   it will have time complexity of O(n^3)
        //  because we are using two loops and then checking for unique character
        // s in the substring

        //String s = "bbbbb";
        int n = s.length();
         int ans = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j <= n; j++) {
        //         if (allUnique(s, i, j)) {
        //             ans = Math.max(ans, j - i);
        //         }
        //     }
        // }
        // System.out.println(ans);



        //optimal approach using sliding window technique
        // it will have time complexity of O(n) because we are using two 
        // pointers to traverse

         HashSet<Character> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
        
    }

    public static boolean allUnique(String s, int start, int end) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = start; i < end; i++) {
            char c = s.charAt(i);
            if (seen.contains(c)) {
                return false;
            }
            seen.add(c);
        }
        return true;
    }
}
