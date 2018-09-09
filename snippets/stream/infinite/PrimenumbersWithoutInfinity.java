public static List<Integer> primenumbers(int n) { /* ... */ }

public static List<Integer> primenumbersWithPredicate
    (Predicate<Integer> p, int n) {
    int multiplier = 1;
    List<Integer> result = new ArrayList<>();
    while (result.size() < n) {
        result = primenumbers(n * multiplier)
            .stream()
            .filter(p)
            .limit(n)
            .collect(toList());
        multiplier *= 2;
    }
    return result;
}
