package Collection;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int []  nums = {0,3,7,2,5,8,4,6,0,1};

        System.out.println("longest sequesnce---"+longestConsecutiveSeq(nums));
    }

    public static int longestConsecutiveSeq(int []  nums){
        Set<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        int longest=0;
        for(int i : set){
          if(!set.contains(i-1)){
            int current=i;
            int count=1;
            while(set.contains(current+1)){
                current++;
                count++;
            }
            longest=Math.max(count, longest);
          }
        }


        return longest;
    }
}
