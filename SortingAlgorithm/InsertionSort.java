package SortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        // Start with the second element of the array because the first element is already considered sorted.
        // Take the current element as the key (the element that needs to be inserted in the sorted part).
        // Compare the key with elements before it in the sorted portion of the array.
        // Shift all elements greater than the key one position to the right to make space.
        // Insert the key at its correct position in the sorted part.
        // Repeat the process for all remaining elements until the entire array becomes sorted.
         
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        for(int i=1;i<arr.length;i++){
            int key=arr[i],j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }

        for(int i:arr) System.out.print(i+"-");
    }
}
