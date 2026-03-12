package StringCodingWithStreamApi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FibonacciSeries {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        IntStream.range(0, num).map(n->fibonacci(n)).forEach(System.out::println);

    }

    static int fibonacci(int n){
    if(n<=1) return n;
    return fibonacci(n-1)+fibonacci(n-2);
    }
}
