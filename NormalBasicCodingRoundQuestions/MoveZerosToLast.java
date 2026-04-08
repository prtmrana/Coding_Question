package NormalBasicCodingRoundQuestions;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
            int[] arr = {1, 0, 2, 0, 3, 0, 4};
            
            System.out.println("Array after moving zeros to last:"+ Arrays.toString(moveZerosToLast(arr)));
        }
     public static int[] moveZerosToLast(int[] arr) {
        int right=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                right--;
            }
        }

        return arr;
     }
}
