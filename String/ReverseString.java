 package String;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.next();
    String reverseString="";
    for(int i=0;i<str.length();i++){
        reverseString+=str.charAt(str.length()-i-1);
    }

    System.out.println("reverse string is---"+reverseString);
}
    
}