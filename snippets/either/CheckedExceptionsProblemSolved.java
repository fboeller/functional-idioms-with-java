public static Either<String, IOException> doAwesomeThing(String str) { /* ... */ }

List.of("abc","d","ef")
    .stream()
    .map(str -> doAwesomeThing(str))
    .filter(either -> either.isLeft());
