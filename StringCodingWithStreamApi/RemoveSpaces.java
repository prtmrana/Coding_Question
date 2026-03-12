package StringCodingWithStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSpaces {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("  Alice  ", " Bob ", "Charlie");
        List<String> result=names.stream().map(String::trim).collect(Collectors.toList());

        System.err.println(names.toString());
         System.err.println(result.toString());

       /*
       
       Collectors is a utility class that 
        provides factory methods for common collectors 
        like Collectors.toList(), Collectors.groupingBy(), etc.

        //Joining Methods
        MethodDescriptionCollectors.joining()  ---- join string
        Collectors.joining(delimiter)   --- Joins with separator
        Collectors.joining(delimiter, prefix, suffix)  --- Joins with separator, prefix, suffix

        //Collectors.counting()   
        //Collectors.summingInt/Long/Double()
        //Collectors.averagingInt/Long/Double()

        //----Min / Max
        1. Collectors.minBy(Comparator)
        2. Collectors.maxBy(Comparator)

        Optional<String> min = stream.collect(Collectors.minBy(Comparator.naturalOrder()));
        Optional<String> max = stream.collect(Collectors.maxBy(Comparator.naturalOrder()));


        // ******** Collectors.toMap(keyMapper, valueMapper)

       
       */ 

    }
}
