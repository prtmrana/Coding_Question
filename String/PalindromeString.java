package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.next();
    String isPalindrome=" is a Palindrome String";
     for(int i=0;i<str.length()/2;i++){

        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            isPalindrome=" is not a Palindrome String";
            break;
        }
    }

    System.out.println(str+isPalindrome);
    }
}
