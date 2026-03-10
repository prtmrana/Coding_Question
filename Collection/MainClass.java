package Collection;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //Two Sum code
        int [] nums = {2,7,11,15};
        int target = 9;
        int[] arr=TwoSum.twonumberSum(nums, target);
        System.out.println("two sum "+Arrays.toString(arr));

        //duplicate present or not 

        int[] nums2 = {1,2,3,2};
        System.out.println("duplicate in  num2 array ---"+ContainsDuplicate.isContainDuplicate(nums2));
    
    
       //first unique character

       String s = "leetcode";
       String s2= "loveleetcode";
       System.out.println("first unique character is at index : "+FirstUniqueCharacter.firstUniqueChar(s));
       System.out.println("first unique character is at index : "+FirstUniqueCharacter.firstUniqueChar(s2));
    
      // Subarray Sum Equals K
    }
}
