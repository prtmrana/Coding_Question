package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
       List<Integer> l1=new LinkedList<>(Arrays.asList(1,2,3,4)); 
       List<Integer> l2=new LinkedList<>(Arrays.asList(3,6,7,8,9,10)); 
       int[] arr=new int[l1.size()+l2.size()];
       int count=0;
       for(Integer i : l1){
        arr[count]=i;
        count++;

       }

       System.out.println(arr);
       for(int i:arr) System.out.print(arr[i]);
    }
}
