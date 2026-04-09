package Streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInString {
    public static void main(String[] args) {
        String str="programming";
        Map<Character,Long> colleMap=
        str.chars().mapToObj(c->(char) c)
                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1
                ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

                System.out.println(colleMap);
    }

    
}
