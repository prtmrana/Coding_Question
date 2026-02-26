package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Map<Integer,Integer> map =new HashMap<>();
        int [] arr={1,2,3,2,5,4};
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
               System.out.println("repeated number --"+arr[i]); 
               break;
            }else{
                map.put(arr[i], i);
            }


        }
    }
}
