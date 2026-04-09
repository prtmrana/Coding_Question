package DSA_DAILY_300_DAYS;

import java.util.Arrays;

public class FirstOddDescAndEvenEsc {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,7,4,10};
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=arr[i]*(-1);
            }
        }

        Arrays.sort(arr);
         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*(-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
