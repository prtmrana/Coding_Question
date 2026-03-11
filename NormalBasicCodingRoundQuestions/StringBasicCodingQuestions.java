package NormalBasicCodingRoundQuestions;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringBasicCodingQuestions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        
        //Count Vowels
        //System.out.println("VOWEL COUNT IS---"+vowelCount(str));

        //Remove Duplicate Characters
       // System.out.println("string after removing duplicates---"+removeDuplicates(str));

       //anagram
       //System.out.println("string is anagram --"+isAnagram("rana","aarne"));

       //palindrome
        System.out.println("string is palindrome --"+isPalindrome(str));
       //reverse
       //System.out.println("string after reverse--"+reverse(str));


    }
    public static String reverse(String str1){
        String reverseString="";
        for(int i=0;i<str1.length();i++){
            reverseString+=str1.charAt(str1.length()-i-1);
        }
        return reverseString;


    }

    public static boolean isPalindrome(String str){
       
        return str.equals(reverse(str));
    }


     public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
       char[] s1=str1.toCharArray();
       char[] s2=str2.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }

    public static boolean isAnagramWithourFunction(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
       Map<Character,Integer> map1=new HashMap<>();



       return false;

    }

    public static int vowelCount(String str){
       
        Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        Set<Character> vowelSet=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i))) vowelSet.add(str.charAt(i));
        }
        
        return vowelSet.size();
    }

    public static String removeDuplicates(String str){
       Set<Character> set=new HashSet<>();
       String returnString="";
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))) returnString+=str.charAt(i);

            set.add(str.charAt(i));
           
        }
        
        return returnString;
    }
}
