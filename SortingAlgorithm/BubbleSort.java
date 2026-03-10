package SortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        System.out.println("array after sorting---"+bubbleSort(arr));
        for(int i:arr) System.err.print(i+",");
    }

    public static int [] bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
           }
        }

        return arr;
    }
}
