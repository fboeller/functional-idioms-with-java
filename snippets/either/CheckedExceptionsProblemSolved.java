static Either<String, IOException>
    doAwesomeThing(String str) { /* ... */ }

Arrays.asList("abc","d","ef")
    .stream()
    .map(str -> doAwesomeThing(str))
    .filter(either -> either.isLeft());
