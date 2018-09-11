public static List<Integer> primenumbers(int n) { /* ... */ }

public static List<Integer> onlyAwesomePrimenumbers
    (Predicate<Integer> isAwesome, int n) {
    return primenumbers(/* How many? */)
        .stream()
        .filter(isAwesome)
        .collect(toList());
}
