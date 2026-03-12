package NormalBasicCodingRoundQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        //febonaaci series
        //The Fibonacci sequence is a series of numbers where each number is the sum of the two previous numbers.
        //F(n)=F(n−1)+F(n−2)
     
        int a=0,b=1;
        for(int i=1;i<=num;i++){
            System.out.print(a+",");
           int c=a+b;
           a=b;
           b=c;
          
        }

    }
}
