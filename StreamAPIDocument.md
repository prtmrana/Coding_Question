## Stream API
 - introduced in java 8 for processing sequences of elements (from collections, arrays, or I/O channels) in a declarative, functional style — similar to SQL queries on data.
 - A Stream is not a data structure , it doesn't store data. It's a pipeline that processes data from a source.

# Stream Creation 
 - // From a List
    Stream<String> stream = list.stream();
 - // From an array
    Stream<String> stream = Arrays.stream(array);
 - // From values directly
    Stream<String> stream = Stream.of("a", "b", "c");
 - // Primitive streams (more efficient)
    IntStream range = IntStream.range(1, 10);

# list operations-
list.stream()
    .filter(n -> n > 10)          // keep elements matching condition
    .map(n -> n * 2)              // transform each element
    .sorted()                     // sort
    .distinct()                   // remove duplicates
    .limit(5)                     // take first 5
    .skip(2);                     // skip first 2

# Terminal Operations 
.collect(Collectors.toList())     // gather into a list
.forEach(System.out::println)     // iterate
.count()                          // count elements
.reduce(0, Integer::sum)          // combine into single value
.findFirst()                      // get first match (Optional)
.anyMatch(n -> n > 5)             // boolean check
.min() / .max()                   // find extremes




// ── filter() ──────────────────────────────────────────
// Predicate<T>  →  boolean test(T t)
stream.filter(s -> s.startsWith("A"))
stream.filter(s -> s.length() > 3)
stream.filter(n -> n % 2 == 0)

// ── map() ─────────────────────────────────────────────
// Function<T, R>  →  R apply(T t)
stream.map(s -> s.toUpperCase())       // String → String
stream.map(s -> s.length())            // String → Integer
stream.map(n -> n * 2)                 // Integer → Integer

// ── flatMap() ─────────────────────────────────────────
// Function<T, Stream<R>>  →  Stream<R> apply(T t)
stream.flatMap(s -> Arrays.stream(s.split("")))   // "hi" → ["h","i"]
stream.flatMap(list -> list.stream())              // List → elements

// ── peek() ────────────────────────────────────────────
// Consumer<T>  →  void accept(T t)
stream.peek(s -> System.out.println(s))
stream.peek(n -> System.out.println("Processing: " + n))

// ── sorted() ──────────────────────────────────────────
// Comparator<T>  →  int compare(T o1, T o2)
stream.sorted()                                    // natural order
stream.sorted((a, b) -> a.compareTo(b))            // custom order
stream.sorted((a, b) -> b.compareTo(a))            // reverse order
stream.sorted(Comparator.comparing(String::length)) // by length

// ── distinct() ────────────────────────────────────────
// No functional interface — no parameter
stream.distinct()

// ── limit() ───────────────────────────────────────────
// long — no functional interface
stream.limit(5)

// ── skip() ────────────────────────────────────────────
// long — no functional interface
stream.skip(3)

// ── mapToInt() ────────────────────────────────────────
// ToIntFunction<T>  →  int applyAsInt(T t)
stream.mapToInt(s -> s.length())
stream.mapToInt(Integer::intValue)

// ── mapToLong() ───────────────────────────────────────
// ToLongFunction<T>  →  long applyAsLong(T t)
stream.mapToLong(s -> s.length())
stream.mapToLong(Long::parseLong)

// ── mapToDouble() ─────────────────────────────────────
// ToDoubleFunction<T>  →  double applyAsDouble(T t)
stream.mapToDouble(s -> s.length())
stream.mapToDouble(Double::parseDouble)

// ── takeWhile()  (Java 9+) ────────────────────────────
// Predicate<T>  →  boolean test(T t)
stream.takeWhile(n -> n < 5)    // takes elements UNTIL condition is false

// ── dropWhile()  (Java 9+) ────────────────────────────
// Predicate<T>  →  boolean test(T t)
stream.dropWhile(n -> n < 5)    // drops elements UNTIL condition is false