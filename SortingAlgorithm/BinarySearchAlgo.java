package SortingAlgorithm;

import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr={10,8,88,32,66,45,87,32,5,23,14};
        Arrays.sort(arr);
        System.out.println("element is present --"+binarySearch(arr,8));
        System.out.println("element is present --"+binarySearchUsingRecursion(arr,97,0,arr.length));
    }
    public static boolean binarySearch(int[] arr,int key){
       int l=0,h=arr.length-1;
       Arrays.sort(arr);
       while(l<=h){
        int mid=(l+h)/2;
        if(arr[mid]==key) return true;
        else if(arr[mid]<key) l=mid+1;
        else h=mid-1;
       }

        return false;
    }

     public static boolean binarySearchUsingRecursion(int[] arr,int key,int start,int end){
        if (start >= end) {       
        return false;
    }

    int mid = (start + end) / 2;

    if (arr[mid] == key) {
        return true;
    }
    else if (arr[mid] > key) {
        return binarySearchUsingRecursion(arr, key, start, mid - 1);
    }
    else {
        return binarySearchUsingRecursion(arr, key, mid + 1, end);
    }
    }
}
