package Collection;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean isContainDuplicate(int [] nums){
        Set<Integer> set=new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        if(nums.length ==set.size()) return false;

    return true;

    }
}
