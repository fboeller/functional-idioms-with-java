public static List<Integer> primenumbers(int n) { /* ... */ }

public static List<Integer> primenumbersWithPredicate
    (Predicate<Integer> p, int n) {
    return primenumbers(/* How many? */)
        .stream()
        .filter(p)
        .collect(toList());
}
