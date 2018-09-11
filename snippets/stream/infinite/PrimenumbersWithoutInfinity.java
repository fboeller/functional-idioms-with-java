public static List<Integer> primenumbers(int n) { /* ... */ }

public static List<Integer> onlyAwesomePrimenumbers
    (Predicate<Integer> isAwesome, int n) {
    int multiplier = 1;
    List<Integer> result = new ArrayList<>();
    while (result.size() < n) {
        result = primenumbers(n * multiplier)
            .stream()
            .filter(isAwesome)
            .limit(n)
            .collect(toList());
        multiplier *= 2;
    }
    return result;
}
