package DSA_DAILY_300_DAYS;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] colors={2,2,0,1,2,0,1,1,2,2,1,0,0,1};//only three colors

        //first approach is sort it 
      //  Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        //but this approach will have time complexity of nlogn

        //optimized approach

        // the time complexity will be 2n--> n only 

        int count1=0,count2=0;
        for(int i=0;i<colors.length;i++){
            if(colors[i]==0) count1++;
            else if(colors[i]==1) count2++;
        }

        for(int i=0;i<colors.length;i++){
           if(count1!=0){
            colors[i]=0;
            count1--;
           }else if(count2!=0){
            colors[i]=1;
            count2--;
           }else{
            colors[i]=2;
           }
        }

        System.out.println(Arrays.toString(colors));

    }

   
}
