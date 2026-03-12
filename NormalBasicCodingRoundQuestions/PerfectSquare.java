package NormalBasicCodingRoundQuestions;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        //using inbuilt method
        System.out.println("number is perfect squre with inbulit--"+isPerfectSquareWithInbuiltMethod(num));

        //without inbuilt method
        System.out.println("number is perfect squre--"+isPerfectSquare(num));

    }
    public static boolean isPerfectSquare(int num){
        for(int i=1;i*i<=num;i++){
            if(i*i==num) return true;
        }
        return false;
    }

     public static boolean isPerfectSquareWithInbuiltMethod(int num){
        int sqrt=(int)Math.sqrt(num);
        if(Math.pow(sqrt, 2)==num) return true;
        return false;
    }
}
