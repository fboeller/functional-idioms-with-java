public static IntStream primenumbers() {
    return IntStream
        .iterate(2, x -> x + 1)
        .filter(x -> isPrime(x));
}

public static IntStream onlyAwesomePrimenumbers
    (Predicate<Integer> isAwesome, int n) {
    return primenumbers()
        .filter(isAwesome)
        .limit(n);
}
