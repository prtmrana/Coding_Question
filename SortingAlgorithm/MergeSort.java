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
     divide(arr,0,arr.length-1);
     for(int i: arr) System.out.print(i+"-");

    }

    private static int[] divide(int[] arr,int start,int end){
        //find the middle element
        //divide the array till it start<end
        //than merge them after comapring with each other
        
        if(start<end){
          int mid=(start+end)/2;
          divide(arr, start, mid);
          divide(arr, mid+1, end);
          merge(arr,start,mid,end);

        }
        return arr;
    }

    private static int[] merge(int[] arr,int start,int mid,int end){
         //calculte range for both the arrays break by mid
         //r2=end-mid;  and r1=mid-start+1;
         //add elements to both the arrays using for loop
         //use while loop and compare values of both array with each other and add smaller one to new array
         //use two while loop to check if any value left in any both the array 
         //add rest value to the new array too
         // return the new array
         int l1=(mid-start)+1,l2=end-mid;
         int[] arr1=new int[l1];
         int[] arr2=new int[l2];
         for(int i=0;i<l1;i++){
            arr1[i]=arr[start+i];
         }
         for(int j=0;j<l2;j++){
            arr2[j]=arr[mid+1+j];
         }

         int i=0,j=0,k=start;
         while(i<l1 && j<l2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;

         }

         while(i<l1){
            arr[k]=arr1[i];
            i++;
            k++;
         }
         while(j<l2){
            arr[k]=arr2[j];
            j++;
            k++;
         }

        return arr;

    }
}
