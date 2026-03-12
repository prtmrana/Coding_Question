package StringCodingWithStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("  Alice  ", " Bob ", "Charlie");
         List<String> result=names.stream().map(String::toUpperCase).collect(Collectors.toList());
         List<String> result2=names.stream().map(String::toUpperCase).map(String::trim).collect(Collectors.toList());
         System.out.println(result2.toString());

         //palindrome
         
         String str="level";
         boolean isPalindrome=IntStream.range(0, str.length())
         .allMatch(n->str.charAt(n)==str.charAt(str.length()-n-1));
         System.out.println(isPalindrome);
    }
}
