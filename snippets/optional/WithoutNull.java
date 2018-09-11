// No!
static Optional<String>
    toLowercase(Optional<String> str) { /* ... */ }

// input != null and output !=null
static String toLowercase(String str) { /* ... */ }

static Optional<String> readInput() { /* ... */ }

static Optional<String> readLowercaseInput() {
    return readInput()
        .map(in -> toLowercase(in));
}
