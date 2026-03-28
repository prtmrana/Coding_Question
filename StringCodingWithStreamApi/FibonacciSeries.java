package StringCodingWithStreamApi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of Fibonacci terms: ");
            int num = sc.nextInt();
            
            if (num <= 0) {
                System.out.println("Please enter a positive number");
                return;
            }
            
            System.out.println("Fibonacci Series:");
            IntStream.range(0, num).map(n -> fibonacci(n)).forEach(System.out::println);
        }
    }

    static int fibonacci(int n){
    if(n<=1) return n;
    return fibonacci(n-1)+fibonacci(n-2);
    }
}
