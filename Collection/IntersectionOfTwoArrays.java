package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1= {1,2,3,4,5,6,7};
        int [] arr2= {1,6,6,7};
        int [] arr=interserctedArray(arr1, arr2);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static int[] interserctedArray(int[] arr1,int[] arr2){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i])) set2.add(arr2[i]);
        }

        int [] returnArray=new int[set2.size()];
        Iterator<Integer> itr=set2.iterator();
        int count=0;
        while(itr.hasNext()){
            returnArray[count]=itr.next();
            count++;
        }

        return returnArray;

    }
}
