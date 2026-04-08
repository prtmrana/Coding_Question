package NormalBasicCodingRoundQuestions;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
            int[] arr = {1, 0, 3, 0,1,2, 4, 0,8};
            
            System.out.println("Array after moving zeros to last:"+ Arrays.toString(moveZerosToLast(arr)));
        }
    //  public static int[] moveZerosToLast(int[] arr) {
    //     int right=arr.length-1;
    //     for(int i=arr.length-1;i>=0;i--){
    //         if(arr[i]==0){
    //             int temp=arr[i];
    //             arr[i]=arr[right];
    //             arr[right]=temp;
    //             right--;
    //         }
    //     }

    //     return arr;
    //  }
      public static int[] moveZerosToLast(int[] arr) {
        int right=arr.length-1;
        int i;
        for(i=arr.length-1;i>=0;i--){
            if(arr[i]==0){
                int j=i;
                int temp=arr[i];
                arr[i]=arr[right];
                while(j<right){
                    arr[j]=arr[j+1];
                    j++;
                }
                arr[right]=temp;
                right--;
            }
        }

        return arr;
     }
}
