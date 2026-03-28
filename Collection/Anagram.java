package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("String and trinSg is an anagram ---"+isAnagram("String","trsing"));
    }

    public static boolean isAnagram(String str1,String str2){
        boolean isValueTrue=false;
        if(str1.length()!=str2.length()) return false;

        Map<Character,Integer> map=new HashMap<>();
        for(char c : str1.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0)+1);
            }else{
                map.put(c, 1);
            }
        }

        for(char c : str2.toCharArray()){
            if(!map.containsKey(c)){
             return false;
            }else{
                map.put(c, map.get(c)-1);
            }
            if(map.get(c)<0) return false;

            isValueTrue=true;
        }

        return isValueTrue;
    }

    
}
