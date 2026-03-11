package SortingAlgorithm;

public class MergeSort {
    public static void main(String[] args) {
         int[] arr={10,9,8,7,6,5,4,3,2,1};
         //divide and conquer algorithm
//          Divide the array into two halves until each subarray contains only one element.
// Recursively sort the left half of the array.
// Recursively sort the right half of the array.
// Merge the two sorted halves into a single sorted array.
// Repeat the process until the entire array is merged and sorted.

    }

    private static int[] divide(int[] arr,int start,int end){
        if(start<end){
          int mid=(start+end)/2;
          divide(arr, start, mid);
          divide(arr, mid+1, end);
          merge


        }
       

        return arr;
    }

    private static int[] merge(int[] arr,int start,int end,int mid){

    }
}
