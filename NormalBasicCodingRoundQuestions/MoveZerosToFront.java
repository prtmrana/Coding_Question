package NormalBasicCodingRoundQuestions;

import java.util.Arrays;

public class MoveZerosToFront {
    public static void main(String[] args) {
         int[] arr = {1, 0, 2, 0, 3, 0, 4};
         
         System.out.println("Array after moving zeros to front:"+ Arrays.toString(moveZerosToFront(arr)));
    }

     public static int[] moveZerosToFront(int[] arr) {
          int len=arr.length;
          int left=0;
          for(int i=0;i<len;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
          }
          return arr; 
     }
}
