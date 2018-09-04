public static IntStream primenumbers() {
    return IntStream
        .iterate(2, x -> x + 1)
        .filter(x -> isPrime(x));
}

public static IntStream primenumbersWithPredicate
    (Predicate<Integer> p, int n) {
    return primenumbers()
        .filter(p)
        .limit(n);
}
