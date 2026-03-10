package NormalBasicCodingRoundQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a number");
        int num=sc.nextInt();
        //palindrome number
       // System.out.println("number is "+isPalindrome(num));

        //prime number
        //System.out.println("number is prime ==="+isPrime(num));

        //factorial number 
        //System.out.print("number is strong---"+factorial(num));

        //strong number --> Sum of (factorial of each digit) == original number
       // System.out.print("number is strong---"+isStrongNumber(num));


        //perfect number --a positive integer that is equal to the sum of its proper positive divisors
        //System.out.println("number is perfect number ---"+isPerfectNumber(num));

        //armstrong number -- a number that equals the sum of its own digits, 
        // each raised to the power of the total number of digits in the number.

        //System.out.print("number is armstrong -- "+isArmStrongNumber(num));

        //GCD  --- Greatest Common Divisor
        //System.out.println("gcd is===="+gcd(12, 18));

        //lcm -- least common multiple
        //System.out.println("lcm is ===="+lcm(18, 48));

        //secondHighest

        int [] arr={12,53,77,98,21,55,88};
        int [] arr1={34};
        System.out.println("second highest number ---->"+secondHighestWithoutSort(arr1));
    }

     public static int secondHighest(int[] arr) {
       Arrays.sort(arr);
       return arr[arr.length-2];
    }
    public static int secondHighestWithoutSort(int[] arr) {
       int highest=arr[0],secondHighest=-1;
       for(int i=1;i<arr.length;i++){
        if(highest<arr[i]){
            highest=arr[i];
            secondHighest=highest;
        }else{
            secondHighest=arr[i];
        }
       }
       return secondHighest;
    }
    public static int lcm(int a, int b) {
       return (a*b)/gcd(a, b);
    }
     public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int factorial(int num){
        int fact=1;
        for(int i=num;i>1;i--){
            fact*=i;
        }
        
        return fact;
    }

    public static boolean isStrongNumber(int num){
        int sum=0,temp=num;
        while(temp!=0){
            int digit=temp%10;
            sum+=factorial(digit);
            temp=temp/10;
        }
        if(num==sum) return true;

        return false;
    }
    public static boolean isArmStrongNumber(int num){
        int count=0,temp=num,sum=0;
       while(temp!=0){
        count++;
        temp=temp/10;
       }
       temp=num;
       while(temp !=0){
        int digit=temp%10;
        sum+=Math.pow(digit, count);
        temp=temp/10;

       }
        if(num==sum) return true;

        return false;
    }
    public static boolean isPerfectNumber(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) sum+=i;
        }
        if(num==sum) return true;

        return false;
    }
    public static boolean isPalindrome(int num){
        int temp=num,rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev) return true;

        return false;
    }

     public static boolean isPrime(int num){
       for(int i=2;i<num/2;i++){
           if(num%i==0){
            return false ;
           }
       }
        return true;
    }
}
