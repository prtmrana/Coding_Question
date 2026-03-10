package SortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("array after sorting---"+);
    }

    public static bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
           }
        }
    }
}
