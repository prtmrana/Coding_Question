package Collection;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twonumberSum(int[] arr,int sum){
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int diff=-1;
            if(sum>arr[i]) diff=sum-arr[i];
            else diff=arr[i]-sum;
            if(map.containsValue(diff)){
                return new int[] {map.get(diff),i};
            }
        }

        return new int[] {0,0};
    }
}
