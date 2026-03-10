package SortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        // Start with the first element of the array.
        // Find the minimum element in the remaining unsorted array.
        // Swap the minimum element with the first unsorted element.
        // Move the boundary of the sorted part one step forward.
        // Repeat until the entire array is sorted.

         int[] arr={10,9,8,7,6,5,4,3,2,1};
         for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min=j;
                }
                    int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
            }
         }

         for(int i:arr) System.out.print(i+"-");
    }
    
}
