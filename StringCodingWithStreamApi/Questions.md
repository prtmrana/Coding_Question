## String related Questions

- 1. reverse a string using stream API
  - Intstream class has static method range (startIndex,endIndex) 
  - mapToObj() is a method of IntStream- (A function that converts int → object) which takes lembda expression as parameter which will have main logic like (input.charAt(input.length() - 1 - i))
  - map() is a method of Stream<T>  -- A function that converts one object to another
  - String::valueOf  -- Character → String
  - collect() is a terminal operation
  - joining() is a static method of Collectors class  --> Joins all elements of stream into a single String