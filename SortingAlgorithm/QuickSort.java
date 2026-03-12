package SortingAlgorithm;

public class QuickSort {
    public static void main(String[] args) {
         int[] arr={10,9,8,7,6,5,4,3,2,1};

         //Quick Sort is also a Divide and Conquer sorting algorithm.
         // It works by selecting a pivot element and placing it in its correct position, 
         //then recursively sorting the elements on the left and right side of the pivot.

         /* 
            Choose a pivot element from the array (commonly the last element).
            Partition the array so that:
            Elements smaller than the pivot go to the left side.
            Elements greater than the pivot go to the right side.
            Place the pivot in its correct sorted position in the array.
            Recursively apply Quick Sort on the left subarray.
            Recursively apply Quick Sort on the right subarray.
            Repeat until subarrays contain only one element, which means the array is sorted.
        */
            //*********important */
            // Pick a pivot
            // Partition the array around the pivot
            // Recursively sort the left and right parts
        QuickSortDivide(arr,0,arr.length-1);
        for(int i : arr) System.out.print(i+"-");

    }

    public static int[] QuickSortDivide(int[] arr,int start,int end){
        if(start<end){
            int pivot=partition(arr, start, end);
            QuickSortDivide(arr, start, pivot-1);
            QuickSortDivide(arr, pivot+1, end);
        }


        return arr;
    }
    public static int partition(int [] arr,int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        int temp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;

        return i+1;
    }
    
}
