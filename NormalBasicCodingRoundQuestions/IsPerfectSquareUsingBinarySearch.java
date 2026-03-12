package NormalBasicCodingRoundQuestions;

import java.util.Scanner;

public class IsPerfectSquareUsingBinarySearch {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        int start=0,end=num;
        while(start<end){
            int mid=start+end/2;
            if(mid*mid==num) {
              System.out.println(true);
              break;
            }
            else if (mid*mid<num) start=mid+1;
            else end=mid-1;
        }

        
    }

  
}
