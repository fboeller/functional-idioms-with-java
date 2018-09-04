// No!
public static Optional<String> toLowercase(Optional<String> str) { /* ... */ }

// input != null and output !=null
public static String toLowercase(String str) { /* ... */ }

public static Optional<String> readInput() { /* ... */ }

public static Optional<String> readLowercaseInput() {
    return readInput()
        .map(in -> toLowercase(in));
}
